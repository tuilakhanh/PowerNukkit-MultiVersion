package cn.nukkit.block;

import cn.nukkit.item.ItemTool;

public class BlockDoubleSlabWarped extends BlockSolid {

    public BlockDoubleSlabWarped() {
    }

    @Override
    public int getId() {
        return WARPED_DOUBLE_SLAB;
    }
    
    @Override
    public String getName() {
        return "Double Warped Slab";
    }

    @Override
    public double getHardness() {
        return 2;
    }

    @Override
    public double getResistance() {
        return 3;
    }
    
    @Override
    public int getToolType() {
        return ItemTool.TYPE_AXE;
    }

    /*@Override
    public BlockColor getColor() {
        return BlockColor.BLACK_BLOCK_COLOR;
    }*/
    
    @Override
    public int getBurnChance() {
        return 0;
    }
    
    @Override
    public int getBurnAbility() {
        return 0;
    }

}
