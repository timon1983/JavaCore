package main.java.com.timon1983.javacore.chapter18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<String>();

        a1.add("C");
        a1.add("A");
        a1.add("E");
        a1.add("B");
        a1.add("D");
        a1.add("F");

        System.out.print("Исходное содержимое списочного массива а1: ");
        Iterator<String> itr = a1.iterator();
        while (itr.hasNext()){
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        ListIterator<String> litr = a1.listIterator();
        while(litr.hasNext()){
            String element = litr.next();
            litr.set(element + "+");
        }
        System.out.print("Измененное содержимое списочного массива а1: ");
        itr = a1.iterator();
        while (itr.hasNext()){
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.print("Измененный в обратном порядке список: ");
        while (litr.hasPrevious()){
            String element = litr.previous();
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
