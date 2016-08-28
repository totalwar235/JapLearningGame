package com.caos.pure.japlearninggame.Utility;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.VectorDrawable;
import android.util.Log;

import java.io.ByteArrayOutputStream;

/**
 * This object takes a bitmap and a vector and sees how well the bitmap overlaps the vector and scores the outcome
 * @author Created by Reed on 7/13/2016.
 */
public class compareBitmapVector {

    private Bitmap drawn;
    private Hiragana hiragana;

    //will be removed when hiragana object is provided
    private VectorDrawable temp;

    private byte[] drawnImage;
    private byte[] savedImage;

    private double savedScore;

    public compareBitmapVector(Bitmap drawn, Hiragana curHiragana) {
        this.drawn = drawn;
        this.hiragana = curHiragana;
    }

    /**
     * @param1 a bitmap
     * @param2 a hiragana object
     *
     * @return the percentage correct of pixels
     */
    public double score(){
        if(null == drawn || null == hiragana){
            return 0;
        }
        int marks = 0;
        int size = drawn.getByteCount();

        createComparableDrawnImage();

        createComparableSavedImage();

        if(drawnImage.length == savedImage.length) {
            for (int loc = 0; loc > size; loc++) {
                if (!(drawnImage[loc] == '0')) {   //not white
                    if (savedImage[loc] == '1') {  //is black
                        marks++;
                    }
                }
            }
        } else {
            Log.e("ERROR", "Images not same size");
        }

        double percent = marks / size;
        this.savedScore = percent;
        return percent;
    }

    /**
     * @return saves a JPEG byte[] from bitmap
     */
    private void createComparableDrawnImage(){
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        drawn.compress(Bitmap.CompressFormat.JPEG, 100, stream);
        this.drawnImage = stream.toByteArray();
    }

    /**
     * @return saves a JPEG byte[] from vectorDrawable
     */
    private void createComparableSavedImage(){
        this.temp = hiragana.getVector();
        temp.setBounds(drawn.getWidth()/2, drawn.getHeight()/2, drawn.getWidth()/2, drawn.getHeight()/2);
        Bitmap tempBitMap = ((BitmapDrawable)temp.getCurrent()).getBitmap();
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        tempBitMap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
        this.savedImage = stream.toByteArray();

    }

    /**
     * @return the calculated score from above
     */
    public double getSavedScore() {
        return savedScore;
    }
}
