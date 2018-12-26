package com.example.demo.thread;

import javax.xml.stream.XMLOutputFactory;

public class MyThread extends Thread {
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            long l = 1000L;
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"    "+i);
        }
    }
}
class Tr1 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(50);
                System.out.println(Thread.currentThread().getName()+"Tr1");
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class Tr2 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(50);
                System.out.println(Thread.currentThread().getName()+"Tr2");
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
