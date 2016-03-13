package com.develop.deni.sportnews;

import android.app.Application;

/**
 * Created by dslunjski on 11.3.2016..
 */
public class MojObjekt extends Application {

    private static Object objekt;


    public static Object getObjekt() {
        return objekt;
    }

    public static void setObjekt(Object objekt) {
        MojObjekt.objekt = objekt;
    }
}
