package com.myComapany.hackerGame;

/**
 * @author Tatek Ahmed on 2/10/2022
 **/

public abstract class HackerThread extends Thread{
    protected Vault vault;


    public HackerThread(Vault vault) {
        this.vault = vault;
        this.setName(this.getClass().getName());
        this.setPriority(Thread.MAX_PRIORITY);
    }

    @Override
    public void start(){
        System.out.println("Starting thread "+ this.getName());
        super.start();
    }
}
