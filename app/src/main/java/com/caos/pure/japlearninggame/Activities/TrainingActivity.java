package com.caos.pure.japlearninggame.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.caos.pure.japlearninggame.R;
import com.caos.pure.japlearninggame.Utility.Hiragana;
import com.caos.pure.japlearninggame.Utility.TrainingView;
import com.caos.pure.japlearninggame.Utility.loadHiragana;

public class TrainingActivity extends AppCompatActivity {

    private TrainingView drawingView;
    private Hiragana trainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.training_view);
        drawingView = (TrainingView) findViewById(R.id.trainingView);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String hiraganaName = extras.getString("name");
            //The key argument here must match that used in the other activity

            //this will get the vector from the res dynamically for the training view
            this.trainer = loadHiragana.select(hiraganaName);
            trainer.getVector(drawingView.getContext());
        }
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
