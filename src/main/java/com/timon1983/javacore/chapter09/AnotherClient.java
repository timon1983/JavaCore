package main.java.com.timon1983.javacore.chapter09;

import main.java.com.timon1983.javacore.chapter09.MyPack.CallBack;

public class AnotherClient implements CallBack {
    @Override
    public void callback(int p) {
        System.out.println("Еще один вариант метода callback()");
        System.out.println("p в квадрате равно " + (p*p));
    }
}
