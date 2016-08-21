package com.caos.pure.japlearninggame.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.caos.pure.japlearninggame.R;
import com.caos.pure.japlearninggame.Utility.loadHiragana;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadHiragana.load();
    }

    public void startStudy(View view) {
        Intent lesson = new Intent(this, LessonMenuActivity.class);
        startActivity(lesson);

    }
}
