package main.java.com.timon1983.javacore.chapter18;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();

        System.out.println("Начальный размер списочного массива а1: " + ts.size());

        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        System.out.println(ts);
    }
}
