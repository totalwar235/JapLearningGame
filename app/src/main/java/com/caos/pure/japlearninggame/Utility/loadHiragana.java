package com.caos.pure.japlearninggame.Utility;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Loads hiragana from basicHiragana
 *  Created by Eric on 7/21/2016.
 */
public class loadHiragana {

    public Object hiragana;


    /* PULLING CHARACTERS INTO A LIST*/
    private void load() {
        Scanner s = new Scanner(new File("com/caos/pure/japlearninggame/Utility/basicHiragana"));

        basicHiragana<String> list = new basicHiragana<String>();

        while (s.hasNext()) list.add(s.next());
        s.close();
    }

    private void printest(){
        System.out.println(Arrays.toString(list.toArray()));
    }
}
