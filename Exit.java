package com.example.moreyl.maze;

/**
 * Created by moreyl on 03.03.2018.
 */

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;

public class Exit extends Dot {
    public Exit(Point point, int size) {
        super(size, point, getPaint());
    }
    private static Paint getPaint() {
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.rgb(11,23,36));
        return paint;
    }
}