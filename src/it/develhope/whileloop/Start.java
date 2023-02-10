package it.develhope.whileloop;

/**
 * This is a Tester class
 * @author alessiolimina
 */


import java.util.concurrent.TimeUnit;

public class Start {
    public static void main(String[] args) {

        System.out.println("----------------Starting-----------------");

        /**
         * Declaring variable timeLoop
         * Set the TimeUnit time with SECONDS
         */

        int timeLoop = 1;
        TimeUnit time = TimeUnit.SECONDS;

        /**
         * Doing an infinite WHILE Loop
         * Using the sleep() method (from java.util.concurrent.TimeUnit) within a try-catch statement
         */

        while(true){
        try {time.sleep(timeLoop);
            System.out.println("In am in loop");} catch (InterruptedException e) {
            System.out.println("I interrupted the loop");
        }
      }
   }
}
