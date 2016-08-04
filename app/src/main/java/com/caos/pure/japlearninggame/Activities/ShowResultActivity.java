package com.caos.pure.japlearninggame.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.caos.pure.japlearninggame.R;
import com.caos.pure.japlearninggame.Utility.TrainingView;;

//This is just for testing purpose;

public class ShowResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_result);
        ImageView drawing = (ImageView) findViewById(R.id.drawing);
        drawing.setImageBitmap(TrainingView.DRAWING);
    }
}