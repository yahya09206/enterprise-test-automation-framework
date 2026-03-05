package com.yahya.util;


/**
 * This call will only be storing the utility methods that can be used across the project.
 */
public class BrowserUtil {

    // Sleep method
    public static void sleep(int seconds){
        seconds *= 1000;
        try{
            Thread.sleep(seconds);
        }catch (InterruptedException e){

        }
    }
}
