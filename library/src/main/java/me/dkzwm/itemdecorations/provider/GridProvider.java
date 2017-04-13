package me.dkzwm.itemdecorations.provider;

/**
 * Created by dkzwm on 2017/4/13.
 *
 * @author dkzwm
 */
public abstract class GridProvider implements IGridProvider {
    @Override
    public boolean isRowNeedDraw(int row) {
        return true;
    }

    @Override
    public boolean isColumnNeedDraw(int column) {
        return true;
    }

    @Override
    public void release() {

    }
}
