package com.example.moreyl.maze;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by moreyl on 28.02.2018.
 */

public class Maze implements Drawable {
    private Paint paint;
    public Maze() {  // инициализация в конструкторе
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.GREEN);


    }

    @Override
    public void drow(Canvas canvas) {  // переопредилили метод drow() интерфейса Drawable
        canvas.drawCircle(100, 100, 75, paint); // принесли экземпляр класса Canvas

    }
}
