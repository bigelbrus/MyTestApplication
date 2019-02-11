package com.geekbrains.materialdesign.mytestapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.BounceInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = findViewById(R.id.email_sign_in_button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                v.animate()
//                        .rotation(360)
//                        .setListener(new AnimatorListenerAdapter() {
//                            @Override
//                            public void onAnimationEnd(Animator animation) {
//                                super.onAnimationEnd(animation);
//                                Toast.makeText(MainActivity.this,"Hi", Toast.LENGTH_SHORT).show();
//                            }
//                        });
                RotateAnimation rotateAnimation = new RotateAnimation(0,660,200,50);
                rotateAnimation.setRepeatCount(5);
                rotateAnimation.setDuration(200);
                v.setAnimation(rotateAnimation);
            }
        });
        button.animate()
                .rotation(360)
                .setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);
                        Toast.makeText(MainActivity.this,"Hi", Toast.LENGTH_SHORT).show();
                    }
                });



    }
}
