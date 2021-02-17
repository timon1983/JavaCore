package main.java.com.timon1983.javacore.chapter28;

import java.util.concurrent.Phaser;

public class PhaserDemo {
    public static void main(String[] args) {
        Phaser phsr = new Phaser(1);
        int curPhase;

        System.out.println("запуск потоков");

        new MyThread2(phsr,"A");
        new MyThread2(phsr,"B");
        new MyThread2(phsr,"C");

        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Фаза " + curPhase + " завершена");

        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Фаза " + curPhase + " завершена");

        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Фаза " + curPhase + " завершена");

        phsr.arriveAndDeregister();
    }
}

class MyThread2 implements Runnable{
    Phaser phsr;
    String name;

    MyThread2(Phaser p, String n){
        phsr = p;
        name = n;
        phsr.register();
        new Thread(this).start();
    }

    public void run(){
        System.out.println("Поток " + name + " начинает первую фазу");
        phsr.arriveAndAwaitAdvance();

        try{
            Thread.sleep(10);
        }catch (InterruptedException e){
            System.out.println(e);
        }

        System.out.println("Поток " + name + " начинает вторую фазу");
        phsr.arriveAndAwaitAdvance();

        try{
            Thread.sleep(10);
        }catch (InterruptedException e){
            System.out.println(e);
        }

        System.out.println("Поток " + name + " начинает третью фазу");
        phsr.arriveAndAwaitAdvance();
    }
}
