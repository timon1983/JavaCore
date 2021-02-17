package main.java.com.timon1983.javacore.chapter28;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicDemo {
    public static void main(String[] args) {
        new AtomicThread("A");
        new AtomicThread("B");
        new AtomicThread("C");
    }
}

class Shared2{
    static AtomicInteger ai = new AtomicInteger(0);
}

class AtomicThread implements Runnable{
    String name;
    AtomicThread(String n){
        name = n;
        new Thread(this).start();
    }

    public void run(){
        System.out.println("Запуск потока" + name);
        for(int i=1; i<=3; i++)
            System.out.println("Поток" + name + " получено: " +
                    Shared2.ai.getAndSet(i));
    }
}
