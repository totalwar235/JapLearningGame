package com.caos.pure.japlearninggame.Utility;

import android.graphics.Bitmap;

/**
 * This object takes a bitmap and a vector and sees how well the bitmap overlaps the vector and scores the outcome
 * @author Created by Reed on 7/13/2016.
 */
public class compareBitmapVector {

    private Bitmap drawn;
    private Object hiragana;

    public compareBitmapVector(Bitmap drawn, Object curHiragana) {
        this.drawn = drawn;
        this.hiragana = curHiragana;
    }

    /**
     * @param1 a bitmap
     * @param2 a hiragana object
     *
     * @return the percentage correct
     */
    public double score(){
        double percent = 0.00;

        return percent;
    }

    public Bitmap getDrawn() {
        return drawn;
    }

    public void setDrawn(Bitmap drawn) {
        this.drawn = drawn;
    }
    public Object getHiragana() {
        return hiragana;
    }

    public void setHiragana(Object hiragana) {
        this.hiragana = hiragana;
    }
}
