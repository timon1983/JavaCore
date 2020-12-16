package main.java.com.timon1983.javacore.chapter18;

import main.java.com.timon1983.javacore.chapter09.MyIF;

import java.util.Comparator;
import java.util.TreeSet;

public class MyComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
//    @Override
//    public int compare(String a, String b) {
//        String aStr, bStr;
//        aStr = a;
//        bStr = b;
//        return bStr.compareTo(aStr);
//    }
}

class CompDemo{
    public static void main(String[] args) {
        MyComp mc = new MyComp();
        TreeSet<String> ts = new TreeSet<String>(mc.reversed());
       // TreeSet<String> ts = new TreeSet<>(new MyComp());
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        for(String element : ts)
            System.out.print(element + " ");
        System.out.println();
    }
}

class CompDemo2{
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>((aStr,bStr) -> bStr.compareTo(aStr));

        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        for(String element : ts)
            System.out.print(element + " ");
        System.out.println();
    }
}
