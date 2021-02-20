package main.java.com.timon1983.javacore.chapter11;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Текущий поток исполнения: " + t);
        t.setName("MyThread");
        System.out.println("Текущий поток исполнения: " + t);
        try {
        for(int i = 5; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
            } catch (InterruptedException e) {
            System.out.println("Главный поток исполнения прерван");
            }
        }
    }
