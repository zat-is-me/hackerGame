package com.myComapany.hackerGame;

/**
 * @author Tatek Ahmed on 2/10/2022
 **/

public class PoliceThread extends Thread{

    @Override
    public void run(){
        for (int i = 10; i >= 0 ; i--) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
        System.out.println("Game over for you hackers");
        System.exit(0);
    }
}
