package com.leetcode.answer.thread.print;

import java.util.concurrent.Semaphore;

public class SemaphorePrint {

    public static void main(String[] args) {

        final Semaphore semaphore = new Semaphore(1);
        final Semaphore semaphore1 = new Semaphore(0);


        final Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i=1; i< 10; i+=2) {
                        semaphore.acquire();
                        System.out.println(" aaa " + i);
                        semaphore1.release();
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });
        final Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i=2; i< 10; i+=2) {
                        semaphore1.acquire();
                        System.out.println(" bbb " + i);
                        semaphore.release();
                    }

                } catch (Exception e) {

                }

            }
        });

        thread1.start();
        thread2.start();
    }


}
