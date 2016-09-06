package com.caos.pure.japlearninggame.Activities;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.caos.pure.japlearninggame.R;
import com.caos.pure.japlearninggame.Utility.Hiragana;
import com.caos.pure.japlearninggame.Utility.TrainingView;
import com.caos.pure.japlearninggame.Utility.loadHiragana;

public class TrainingActivity extends AppCompatActivity {

    private TrainingView drawingView;
    private ImageView hiraganaImage;
    private Hiragana trainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.training_view);
        drawingView = (TrainingView) findViewById(R.id.trainingView);
        hiraganaImage = (ImageView) findViewById(R.id.hiraganaImage);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            //for test
            String hiraganaName = extras.getString("a");
            //The key argument here must match that used in the other activity

            //this will get the vector from the res dynamically for the training view
            this.trainer = loadHiragana.select(hiraganaName);
            hiraganaImage.setImageResource(trainer.getImageId());
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
