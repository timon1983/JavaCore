package main.java.com.timon1983.javacore.chapter09;

import main.java.com.timon1983.javacore.chapter09.MyPack.CallBack;
import main.java.com.timon1983.javacore.chapter09.MyPack.Client;

public class TestIface2 {
    public static void main(String[] args) {
        CallBack c = new Client();
        AnotherClient ob = new AnotherClient();

        c.callback(42);

        c = ob;

        c.callback(42);
    }
}
