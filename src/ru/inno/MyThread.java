package ru.inno;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.UUID;

public class MyThread extends Thread{
    @Override
    public void run() {
        Set<String> storage = new HashSet<>();
        for (Integer i = 0; i<100_000_000; i++){
            UUID newUuid = UUID.randomUUID();
            if (i % 4 == 0){
                storage.add(String.valueOf(newUuid));
            }
            if (i % 10_000 == 0){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
