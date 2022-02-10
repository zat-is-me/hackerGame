package com.myComapany.hackerGame;

/**
 * @author Tatek Ahmed on 2/10/2022
 **/

public class Vault {
    private int password;

    public Vault(int password){
        this.password = password;
    }

    public boolean isCorrectPassowrd(int guess) {
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this.password == guess;
    }
}
