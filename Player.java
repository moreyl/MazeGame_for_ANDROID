package com.example.moreyl.maze;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Log;

/**
 * Created by moreyl on 28.02.2018.
 */

public class Player implements Drawable {  // Объявляем класс Player который реализуеи нитерфейс Drawable

    private Paint paint; // для объекта Player создали его собственный экземпляр Paint
    private Point point;



    public Player() {  // инициализация в конструкторе
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.RED);
        point = new Point(0,0);
    }

    public void move(int diffX, int diffY) {
        point.x += diffX;
        point.y += diffY;
        Log.i("Player", String.format("%d %d", point.x, point.y));

    }

    @Override
    public void drow(Canvas canvas, Rect rect) {  // переопредилили метод drow() интерфейса Drawable
        canvas.drawRect(point.x, point.y,  point.x + 50, point.y + 50, paint); // принесли экземпляр класса Canvas


    }
}
