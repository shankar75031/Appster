package com.example.hbg.appster;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide;

public class MainIntro extends IntroActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addSlide(new SimpleSlide.Builder()
                .title("For customers")
                .description("Use this application to order food early!")
                .background(R.color.colorPrimary)
                .backgroundDark(R.color.colorPrimaryDark)
                .build());

        addSlide(new SimpleSlide.Builder()
                .title("For owners")
                .description("Maintain your menu upto date at all times")
                .background(R.color.md_pink_500)
                .backgroundDark(R.color.md_pink_700)
                .build());
    }
}
