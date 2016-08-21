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
        temp.add(new Hiragana("a", "drawable/hiragana01.xml", 1));
        temp.add(new Hiragana("i", "drawable/hiragana02.xml", 1));
        temp.add(new Hiragana("u", "drawable/hiragana03.xml", 1));
        temp.add(new Hiragana("o", "drawable/hiragana04.xml", 1));
        temp.add(new Hiragana("e", "drawable/hiragana05.xml", 1));

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
