package com.caos.pure.japlearninggame.Utility;

import android.graphics.Bitmap;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Reed on 8/5/2016.
 */
public class compareBitmapVectorTest {
    private compareBitmapVector tester;
    private Bitmap fakeBit;
    private Hiragana testee;

    @Before
    public void initMethod(){
        testee = new Hiragana();
        fakeBit = null;
        tester = new compareBitmapVector(fakeBit,testee);
    }

    @Test
    public void noObjects(){
        assertEquals(tester.score(),0);
    }
}
