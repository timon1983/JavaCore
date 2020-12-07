package main.java.com.timon1983.javacore.chapter09;

import main.java.com.timon1983.javacore.chapter09.MyPack.CallBack;

abstract class Incomplete implements CallBack {
    int a, b;

    void show(){
        System.out.println(a + " " + b);
    }
}
