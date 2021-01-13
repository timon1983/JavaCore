package main.java.com.timon1983.javacore.chapter13;

import java.security.spec.NamedParameterSpec;

public class NativeDemo {
    int i;

    public static void main(String[] args) {
        NativeDemo ob = new NativeDemo();
        ob.i = 10;
        System.out.println("Содержимое переменной ob.i перед вызовом платформенно-ориентированного" +
                "метода:" + ob.i);
        ob.test();
        System.out.println("Содержимое переменной ob.i после вызовом платформенно-ориентированного" +
                "метода:" + ob.i);
    }
    public native void test();
    static {
        System.out.println("NativeDemo");
    }
}
