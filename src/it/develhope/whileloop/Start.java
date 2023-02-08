package it.develhope.whileloop;


import java.util.concurrent.TimeUnit;

public class Start {
    public static void main(String[] args) {

        System.out.println("----------------Starting-----------------");

        int timeLoop = 1;
        TimeUnit time = TimeUnit.SECONDS;
        while(true){
        try {
            time.sleep(timeLoop);
            System.out.println("In am in loop");} catch (InterruptedException e) {
            System.out.println("I interrupted the loop");
        }
      }
   }
}
