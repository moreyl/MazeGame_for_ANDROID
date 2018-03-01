package com.example.moreyl.maze;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by moreyl on 28.02.2018.
 */

public class MazeView extends View { // унаследовали от android класса view

    private GameManager gameManager;



    public MazeView(Context context, GameManager gameManager) { // здесь нам требуется объект GameManager
        super(context);
        this.gameManager = gameManager;
        gameManager.setView(this);

    }
 // переопределим метод onDrow()


    @Override
    protected void onDraw(Canvas canvas) {
        gameManager.drow(canvas);
    }

    protected void onSizeChanged(int w , int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        gameManager.setScreenSize(w, h);
    }


}
