package com.myComapany.hackerGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Tatek Ahmed on 2/10/2022
 **/

public class Main {
    public static  final int MAX_PASSWORD = 9999;

    public static void main(String[] args) {
        Random random = new Random();

        Vault vault = new Vault(random.nextInt(MAX_PASSWORD));

        List <Thread> threads = new ArrayList<>();

        threads.add(new AscendingHackerThread(vault));
        threads.add(new DisendingHackerThread(vault));
        threads.add(new PoliceThread());

        for (Thread thread: threads) {
            thread.start();
        }
    }
}
