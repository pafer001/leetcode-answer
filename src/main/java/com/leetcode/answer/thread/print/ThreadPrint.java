package com.leetcode.answer.thread.print;

public class ThreadPrint {
    static Object object = new Object();

    public static void main(String[] args) {

        final Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {

                synchronized (object) {
                    for (int i = 1; i <= 10; i += 2) {
                        try {
                            System.out.println(i);
                            object.notify();
                            object.wait();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }

            }
        });


        final Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {

                synchronized (object) {
                    for (int i = 2; i <= 10; i += 2) {
                        try {
                            System.out.println(i);
                            object.notify();
                            object.wait();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }

            }
        });



        thread1.start();
        thread2.start();

    }
}
