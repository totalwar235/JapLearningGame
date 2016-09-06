package com.caos.pure.japlearninggame.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.caos.pure.japlearninggame.R;

public class LessonMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson_menu);
    }

    public void startTraining(View view) {
        String hiraganaName;
        switch (view.getId()) {
            case R.id.hiraganaA:
                hiraganaName = new String("a");
                break;
            case R.id.hiraganaKa:
                hiraganaName = new String("ka");
                break;
            case R.id.hiraganaSa:
                hiraganaName = new String("sa");
                break;
            default:
                hiraganaName = new String("a");
                break;
        }
        Intent training = new Intent(this, TrainingActivity.class);
        training.putExtra("name", hiraganaName);
        startActivity(training);
    }
}
