package com.NB_CRM.utils;

public class BrowserUtils2 {


    public static void sleep(int second){
        second*=1000;

        try {
            Thread.sleep(second);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
