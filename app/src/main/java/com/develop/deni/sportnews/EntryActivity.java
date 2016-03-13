package com.develop.deni.sportnews;

import android.app.Activity;
import android.app.WallpaperManager;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.Display;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;

public class EntryActivity extends Activity {

    private static int handler=3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent glavna = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(glavna);

                finish();

            }
        },handler);


    }
}
