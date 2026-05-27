package net.din37r.cyberishlights.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("deprecation")
public class NeonLantern extends Block implements net.minecraft.world.level.block.SimpleWaterloggedBlock {

    public static final DirectionProperty FACING = DirectionalBlock.FACING;
    public static final net.minecraft.world.level.block.state.properties.BooleanProperty WATERLOGGED = net.minecraft.world.level.block.state.properties.BlockStateProperties.WATERLOGGED;

    private static final VoxelShape SHAPE_UP    = Block.box(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
    private static final VoxelShape SHAPE_DOWN  = Block.box(4.0, 7.0, 4.0, 12.0, 16.0, 12.0);
    private static final VoxelShape SHAPE_NORTH = Block.box(4.0, 4.0, 7.0, 12.0, 12.0, 16.0);
    private static final VoxelShape SHAPE_SOUTH = Block.box(4.0, 4.0, 0.0, 12.0, 12.0, 9.0);
    private static final VoxelShape SHAPE_WEST  = Block.box(7.0, 4.0, 4.0, 16.0, 12.0, 12.0);
    private static final VoxelShape SHAPE_EAST  = Block.box(0.0, 4.0, 4.0, 9.0, 12.0, 12.0);

    public NeonLantern(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(FACING, Direction.UP)
                .setValue(WATERLOGGED, false));
    }

    @Override
    public @NotNull VoxelShape getShape(BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull CollisionContext context) {
        return switch (state.getValue(FACING)) {
            case DOWN  -> SHAPE_DOWN;
            case NORTH -> SHAPE_NORTH;
            case SOUTH -> SHAPE_SOUTH;
            case WEST  -> SHAPE_WEST;
            case EAST  -> SHAPE_EAST;
            default    -> SHAPE_UP;
        };
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        Direction clickedFace = context.getClickedFace();
        net.minecraft.world.level.material.FluidState fluidState = context.getLevel().getFluidState(context.getClickedPos());
        boolean isWater = fluidState.getType() == net.minecraft.world.level.material.Fluids.WATER;
        return this.defaultBlockState().setValue(FACING, clickedFace).setValue(WATERLOGGED, isWater);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, WATERLOGGED);
    }

    @Override
    public net.minecraft.world.level.material.@NotNull FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? net.minecraft.world.level.material.Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    @Override
    public @NotNull BlockState updateShape(BlockState state, @NotNull Direction direction, @NotNull BlockState neighborState, net.minecraft.world.level.@NotNull LevelAccessor level, @NotNull BlockPos currentPos, @NotNull BlockPos neighborPos) {
        if (state.getValue(WATERLOGGED)) {
            level.scheduleTick(currentPos, net.minecraft.world.level.material.Fluids.WATER, net.minecraft.world.level.material.Fluids.WATER.getTickDelay(level));
        }
        return super.updateShape(state, direction, neighborState, level, currentPos, neighborPos);
    }
}
