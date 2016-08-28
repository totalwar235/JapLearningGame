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
    private String masterDrawingPath;
    private VectorDrawable masterDrawing;
    private int Family;

    public Hiragana(String name, String masterDrawingPath, int Family) {
        this.name = name;
        this.masterDrawingPath = masterDrawingPath;
        this.Family = Family;
    }

    public void getVector(Context context){
        Resources res = context.getResources();
        int resourceId = res.getIdentifier(this.masterDrawingPath, "drawable",
                context.getPackageName());
        this.masterDrawing =  (VectorDrawable) res.getDrawable(resourceId,null);
    }

    public VectorDrawable getVector(){
        return this.masterDrawing;
    }

    public String getName() {
        return name;
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
