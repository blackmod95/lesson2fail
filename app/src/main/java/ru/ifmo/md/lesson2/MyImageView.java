package ru.ifmo.md.lesson2;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.View;
import android.graphics.Bitmap;

public class MyImageView extends View {

    Bitmap bitmap;
    public final static int HEIGHT = 161;
    public final static int WIDTH = 161;
    int[] pixels = new int[HEIGHT * WIDTH];

    public MyImageView(Context context) {
        super(context);
        bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.picture);
        bitmap.getPixels(pixels, 0, HEIGHT, 0, 0, HEIGHT, WIDTH);
    }

    public void change() {
        invalidate();
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawBitmap(pixels, 0, HEIGHT, 0, 0, HEIGHT, WIDTH, false, null);
    }
}