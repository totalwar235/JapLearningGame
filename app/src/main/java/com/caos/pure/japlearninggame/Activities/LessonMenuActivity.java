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
        Intent training = new Intent(this, TrainingActivity.class);
        startActivity(training);
        //setContentView(R.layout.training_view);
    }
}
