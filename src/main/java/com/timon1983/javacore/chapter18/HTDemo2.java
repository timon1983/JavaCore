package main.java.com.timon1983.javacore.chapter18;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HTDemo2 {
    public static void main(String[] args) {
        Hashtable<String, Double> balance = new Hashtable<String, Double>();

        String str;
        double bal;

        balance.put("Джон Доу", 3434.34);
        balance.put("Том Смит", 123.22);
        balance.put("Джейн Бейкер", 1378.00);
        balance.put("Том Холл", 99.22);
        balance.put("Ральф Смит", -19.08);

        Set<String> set = balance.keySet();
        Iterator<String> it = set.iterator();

        while(it.hasNext()){
            str = it.next();
            System.out.println(str + ": " + balance.get(str));
        }
        System.out.println();

        bal = balance.get("Джон Доу");
        balance.put("Джон Доу", bal + 1000);
        System.out.println("Новый остаток на счете Джона Доу: " + balance.get("Джон Доу"));
    }
}
