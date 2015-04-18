package com.peshe.coding_dojo.codingdojo.models;

import android.test.InstrumentationTestCase;

/**
 * Created by pedroduran on 18/4/15.
 */
public class BasketTest extends InstrumentationTestCase {

    public static double getPrice(int bookNumber) {
        switch (bookNumber) {
            case 1:
                return 8;
            case 2:
                return 2 * 8 * 0.95;
        }
        return 0;
    }

    public void test1BookIs8Eur() throws Exception {
        assertEquals(getPrice(1), 8.0);
    }

    public void test1BookType1and1BookType2HasDiscount() throws Exception {
        double precioType1 = 8;
        double precioType2 = 8;
        double precioTotalWithDiscount = (precioType1 + precioType2) * 0.95;

        assertEquals(getPrice(2), precioTotalWithDiscount);
    }
}
