package com.myComapany.hackerGame;

/**
 * @author Tatek Ahmed on 2/10/2022
 **/

public class DisendingHackerThread extends HackerThread{
    public DisendingHackerThread(Vault vault) {
        super(vault);
    }

    @Override
    public void run(){
        for (int guess = Main.MAX_PASSWORD; guess >=0; guess--) {
            if (vault.isCorrectPassowrd(guess)) {
                System.out.println(this.getName() + " guessed the password " + guess);
                System.exit(0);
            }
        }
    }
}
