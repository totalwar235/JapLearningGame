package com.caos.pure.japlearninggame.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.caos.pure.japlearninggame.R;
import com.caos.pure.japlearninggame.Utility.TrainingView;

public class TrainingActivity extends AppCompatActivity {

    private TrainingView drawingView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.training_view);
        drawingView = (TrainingView) findViewById(R.id.trainingView);
    }

    public void clickReset(View view) {
        drawingView.reset();
    }

    public void clickSubmit(View view) {
        drawingView.prepareDrawing();
        Intent intent = new Intent(this, ShowResultActivity.class);
        startActivity(intent);
    }
}
