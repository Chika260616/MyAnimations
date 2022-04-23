package com.example.myanimations;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
        //Создаем переменные для нашей анимации
    private Animation logoAnim,HelloTextAnim,buttonLogoAnim ;

    private Button bAnim;
    private TextView tAnim;
    private ImageView logoImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }
    private void init()
    {

        logoAnim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.image_anim);
        HelloTextAnim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.text_anim);
        buttonLogoAnim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.button_anim);

        logoImage = findViewById(R.id.imageAnim);
        tAnim = findViewById(R.id.textAnim);
        bAnim = findViewById(R.id.buttonAnim);

        logoImage.startAnimation(logoAnim);
        tAnim.startAnimation(HelloTextAnim);
        bAnim.startAnimation(buttonLogoAnim);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        finish();
    }
}