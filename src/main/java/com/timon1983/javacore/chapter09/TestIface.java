package main.java.com.timon1983.javacore.chapter09;

import main.java.com.timon1983.javacore.chapter09.MyPack.CallBack;
import main.java.com.timon1983.javacore.chapter09.MyPack.Client;

public class TestIface {
    public static void main(String[] args) {
        CallBack c = new Client();
        c.callback(42);
    }
}
