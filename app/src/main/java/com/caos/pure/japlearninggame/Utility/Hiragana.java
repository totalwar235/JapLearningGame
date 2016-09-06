package com.caos.pure.japlearninggame.Utility;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

import com.caos.pure.japlearninggame.R;

/**
 * Created by Reed on 7/25/2016.
 */
public class Hiragana {



    private String name;
    //private String masterDrawingPath;
    private int imageId;
    private VectorDrawable masterDrawing;
    private int Family;

    public Hiragana(String name, int imageId, int Family) {
        this.name = name;
        this.imageId = imageId;
        //this.masterDrawingPath = masterDrawingPath;
        this.Family = Family;
    }

    public void getVector(Context context){
        this.masterDrawing =  (VectorDrawable) context.getDrawable(imageId);
    }

    public VectorDrawable getVector(){
        return this.masterDrawing;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFamily() {
        return Family;
    }

    public void setFamily(int family) {
        Family = family;
    }

    public VectorDrawable getMasterDrawing() {
        return masterDrawing;
    }
    public void setMasterDrawing(VectorDrawable masterDrawing) {
        this.masterDrawing = masterDrawing;
    }


}
