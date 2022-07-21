package com.NB_CRM.utils;

public class BrowserUtils2 {
    static final int SECOND;

    static {
        SECOND = 5 * 1000;
    }

    public static void sleep() {


        try {
            Thread.sleep(SECOND);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
