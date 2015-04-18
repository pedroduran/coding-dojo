package com.peshe.coding_dojo.codingdojo.models;

import android.test.InstrumentationTestCase;

/**
 * Created by pedroduran on 18/4/15.
 */
public class BasketTest extends InstrumentationTestCase {

    

    public void test1BookIs8Eur() throws Exception {
        int precio = 8;

        assertEquals(precio, 8);
    }

    public void test1BookType1and1BookType2HasDiscount() throws Exception {
        double precioType1 = 0;

        double precioType2 = 8;
        double precioTotal = (precioType1 + precioType2) * 0.95;
        double precioTotalWithDiscount = (precioType1 + precioType2) * 0.95;

        assertEquals(precioTotal, precioTotalWithDiscount);
    }
}
