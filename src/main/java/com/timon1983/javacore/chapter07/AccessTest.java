package main.java.com.timon1983.javacore.chapter07;

public class AccessTest {
    public static void main(String[] args) {
        Test ob = new Test();
        ob.c = 10;
        ob.d = 20;
        //ob.e = 100; ERROR!
        ob.setE(100);
        System.out.println("c,d и e: " + ob.c + " " + ob.d + " " + ob.getE());
    }
}
