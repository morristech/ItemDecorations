package me.dkzwm.itemdecorations.divider;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by dkzwm on 2017/4/11.
 *
 * @author dkzwm
 */

public class PaintDivider implements IDivider {
    private Paint mPaint;

    public PaintDivider(Paint paint) {
        mPaint = paint;
    }

    @Override
    public void draw(Canvas canvas, int left, int top, int right, int bottom) {
        canvas.drawLine(left, top, right, bottom, mPaint);
    }

    @Override
    public int getType() {
        return TYPE_PAINT;
    }

    @Override
    public int getDividerSize() {
        return Math.round(mPaint.getStrokeWidth());
    }
}
