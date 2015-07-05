package android.lic.com.insuranceproposalapp;

import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.lic.com.insuranceproposalapp.util.SystemUiHider;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 *
 * @see SystemUiHider
 */
public class Splash extends Activity {

    private static final int SPLASH_TIME_OUT = 1000;
    RelativeLayout splash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);
        splash = (RelativeLayout)findViewById(R.id.splashlayout);
        splash.setBackground(new Drawable() {
            @Override
            public void draw(Canvas canvas) {

            }

            @Override
            public void setAlpha(int alpha) {

            }

            @Override
            public void setColorFilter(ColorFilter cf) {

            }

            @Override
            public int getOpacity() {
                return 0;
            }
        });
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent;
                intent = new Intent(Splash.this, MainActivity.class);
                startActivity(intent);

                finish();
            }
        },SPLASH_TIME_OUT);

    }

}
