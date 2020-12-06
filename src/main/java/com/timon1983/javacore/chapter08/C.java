package main.java.com.timon1983.javacore.chapter08;

public class C extends B {
    C(){
        System.out.println("В конструкторе С.");
    }
    void callme(){
        System.out.println("В методе callme() из класса C");
    }
}
