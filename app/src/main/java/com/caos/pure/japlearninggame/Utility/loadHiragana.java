package com.caos.pure.japlearninggame.Utility;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

import com.caos.pure.japlearninggame.R;

import java.util.ArrayList;

/**
 * Loads Hiragana
 *  Created by Eric on 7/21/2016.
 */

public class loadHiragana {

    private static ArrayList<Hiragana> temp = new ArrayList<Hiragana>();

    // PULLING CHARACTERS INTO A LIST
    public static void load() {


        //Creates collection
        temp.add(new Hiragana("a", R.drawable.hiragana00, 1));
        temp.add(new Hiragana("ka", R.drawable.hiragana01, 1));
        temp.add(new Hiragana("sa", R.drawable.hiragana02, 1));
        temp.add(new Hiragana("ta", R.drawable.hiragana03, 1));
        temp.add(new Hiragana("na", R.drawable.hiragana04, 1));

        //Prints out collection
        for(int i = 0; i < temp.size(); i++){
            System.out.printf("%s\n", temp.get(i));
        }
    }

    public static Hiragana select(String name){
        for(Hiragana kana : temp){
            if(kana.getName().equals(name)){
                return kana;
            }
        }
        return null;
    }
}
