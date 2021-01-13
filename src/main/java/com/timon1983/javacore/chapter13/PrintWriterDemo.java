package main.java.com.timon1983.javacore.chapter13;

import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);

        pw.println("Это строка");
        int i = -7;
        pw.println(i);
        double d = 4.5f - 7;
        pw.println(d);
    }
}
