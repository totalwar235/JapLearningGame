package com.caos.pure.japlearninggame.Utility;

import android.graphics.drawable.VectorDrawable;

import java.util.ArrayList;

/**
 * Loads Hiragana
 *  Created by Eric on 7/21/2016.
 */

public class loadHiragana {

    // PULLING CHARACTERS INTO A LIST
    private void load() {
        ArrayList<Hiragana> temp = new ArrayList<Hiragana>();

        //Creates collection
        temp.add(new Hiragana("a", drawable/hiragana01.xml, 1));
        temp.add(new Hiragana("i", drawable/hiragana02.xml, 1));
        temp.add(new Hiragana("u", drawable/hiragana03.xml, 1));
        temp.add(new Hiragana("o", drawable/hiragana04.xml, 1));
        temp.add(new Hiragana("e", drawable/hiragana05.xml, 1));

        //Prints out collection
        for(int i = 0; i < temp.size(); i++){
            System.out.printf("%s\n", temp.get(i))
        }
    }

    private void vectorDrawableState(){
    }
}
