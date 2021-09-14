package com.sw.worldprogrammerday;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private WorldProgrammerDay worldProgrammerDay;
    private TextView tv_text, tv_date;
    private LinearLayout linearLayout, linearLayout2;
    private int cont = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: " + cont);
        initView();
        haiddots(linearLayout);

    }

    private void initView() {
        tv_text = findViewById(R.id.tv_text);
        tv_date = findViewById(R.id.tv_date);
        linearLayout = findViewById(R.id.dotsC1);
        linearLayout2 = findViewById(R.id.dotsC2);
    }

    //0,3,7,11,15,19,23,27
    public void haiddots(View view) {
        view.setAlpha(1.0f);
        view.animate()
                .translationY(60)
                .setDuration(1000)
                .alpha(0.0f)
                .setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);
                        switch (cont) {
                            case 0:
                                view.setVisibility(View.GONE);
                                cont++;
                                Log.d(TAG, "onCreate: " + cont);
                                anmatTvShow(tv_text, "Hello Ahmed");
                                break;
                            case 3:
                                view.setVisibility(View.GONE);
                                cont++;
                                Log.d(TAG, "onCreate: " + cont);
                                anmatTv2Show(tv_date, "Hello Samir");
                                break;
                            case 7:
                                view.setVisibility(View.GONE);
                                cont++;
                                Log.d(TAG, "onCreate: " + cont);
                                anmatTvShow(tv_text, "Do you know what day it is?");
                                break;
                            case 11:
                                view.setVisibility(View.GONE);
                                cont++;
                                Log.d(TAG, "onCreate: " + cont);
                                anmatTv2Show(tv_date, "no I do not know");
                                break;
                            case 15:
                                view.setVisibility(View.GONE);
                                cont++;
                                Log.d(TAG, "onCreate: " + cont);
                                anmatTvShow(tv_text, "This is World Programming Day");
                                break;
                            case 19:
                                view.setVisibility(View.GONE);
                                cont++;
                                Log.d(TAG, "onCreate: " + cont);
                                anmatTv2Show(tv_date, "Oh really");
                                break;
                            case 23:
                                view.setVisibility(View.GONE);
                                cont++;
                                Log.d(TAG, "onCreate: " + cont);
                                anmatTvShow(tv_text, "Yes, happy programming day");
                                break;
                            case 27:
                                view.setVisibility(View.GONE);
                                cont++;
                                Log.d(TAG, "onCreate: " + cont);
                                anmatTv2Show(tv_date, "Happy programming day");
                                break;


                        }


                    }
                });
    }

    //2,6,10,14,18,22,26
    public void showDots(View view) {
        view.setVisibility(View.VISIBLE);
        view.setAlpha(0.0f);
        view.animate()
                .translationY(60)
                .setDuration(1000)
                .alpha(1.0f)
                .setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);
                        switch (cont) {
                            case 2:
                                cont++;
                                Log.d(TAG, "onCreate: " + cont);
                                haiddots(linearLayout2);
                                break;
                            case 6:
                                cont++;
                                Log.d(TAG, "onCreate: " + cont);
                                haiddots(linearLayout);
                                break;
                            case 10:
                                cont++;
                                Log.d(TAG, "onCreate: " + cont);
                                haiddots(linearLayout2);
                                break;
                            case 14:
                                cont++;
                                Log.d(TAG, "onCreate: " + cont);
                                haiddots(linearLayout);
                                break;
                            case 18:
                                cont++;
                                Log.d(TAG, "onCreate: " + cont);
                                haiddots(linearLayout2);
                                break;
                            case 22:
                                cont++;
                                Log.d(TAG, "onCreate: " + cont);
                                haiddots(linearLayout);
                                break;
                            case 26:
                                cont++;
                                Log.d(TAG, "onCreate: " + cont);
                                haiddots(linearLayout2);
                                break;


                        }

                    }
                });
    }

    //1,8,16,24
    public void anmatTvShow(View view, String text) {
        Log.d(TAG, "onCreate: " + text);
        view.setVisibility(View.VISIBLE);
        view.setAlpha(0.0f);
        tv_text.setText(text);
        view.animate()
                .translationY(60)
                .setDuration(2000)
                .alpha(1.0f)
                .setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);
                        switch (cont) {
                            case 1:
                                linearLayout.setVisibility(View.GONE);
                                cont++;
                                Log.d(TAG, "onCreate: " + cont);
                                showDots(linearLayout2);
                                break;
                            case 8:
                                cont++;
                                Log.d(TAG, "onCreate: " + cont);
                                anmatTvhide(tv_date);
                                break;
                            case 16:
                                cont++;
                                Log.d(TAG, "onCreate: " + cont);
                                anmatTvhide(tv_date);
                                break;
                            case 24:
                                cont++;
                                Log.d(TAG, "onCreate: " + cont);
                                anmatTvhide(tv_date);
                                break;


                        }

                    }
                });
    }

    //4,12,20
    public void anmatTv2Show(View view, String text) {
        view.setVisibility(View.VISIBLE);
        view.setAlpha(0.0f);
        tv_date.setText(text);
        view.animate()
                .translationY(60)
                .setDuration(2000)
                .alpha(1.0f)
                .setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);
                        switch (cont) {
                            case 4:
                                cont++;
                                Log.d(TAG, "onCreate: " + cont);
                                anmatTvhide(tv_text);
                                break;
                            case 12:
                                cont++;
                                Log.d(TAG, "onCreate: " + cont);
                                anmatTvhide(tv_text);
                                break;
                            case 20:
                                cont++;
                                Log.d(TAG, "onCreate: " + cont);
                                anmatTvhide(tv_text);
                                break;


                        }

                    }
                });
    }

    //5,9,13,17,21,25
    public void anmatTvhide(View view) {
        view.setAlpha(1.0f);
        view.animate()
                .translationY(60)
                .setDuration(2000)
                .alpha(0.0f)
                .setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);
                        switch (cont) {
                            case 5:
                                view.setVisibility(View.GONE);
                                cont++;
                                Log.d(TAG, "onCreate: " + cont);
                                showDots(linearLayout);
                                break;
                            case 9:
                                view.setVisibility(View.GONE);
                                cont++;
                                Log.d(TAG, "onCreate: " + cont);
                                showDots(linearLayout2);
                                break;
                            case 13:
                                view.setVisibility(View.GONE);
                                cont++;
                                Log.d(TAG, "onCreate: " + cont);
                                showDots(linearLayout);
                                break;
                            case 17:
                                view.setVisibility(View.GONE);
                                cont++;
                                Log.d(TAG, "onCreate: " + cont);
                                showDots(linearLayout2);
                                break;
                            case 21:
                                view.setVisibility(View.GONE);
                                cont++;
                                Log.d(TAG, "onCreate: " + cont);
                                showDots(linearLayout);
                                break;
                            case 25:
                                view.setVisibility(View.GONE);
                                cont++;
                                Log.d(TAG, "onCreate: " + cont);
                                showDots(linearLayout2);
                                break;


                        }

                    }
                });
    }
}