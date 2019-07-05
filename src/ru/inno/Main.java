package ru.inno;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.UUID;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        scanner.nextLine();
        Thread myThread1 = new MyThread();
        myThread1.start();
        Thread myThread2 = new MyThread();
        myThread2.start();
        Thread myThread3 = new MyThread();
        myThread3.start();
        try {
            myThread1.join();
            myThread2.join();
            myThread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        scanner.nextLine();
    }
}
