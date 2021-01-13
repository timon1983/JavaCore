package main.java.com.timon1983.javacore.chapter20;

import java.io.Console;

public class ConcoleDemo {
    public static void main(String[] args) {
        String str;
        Console con;

        con = System.console();

        if(con == null) return;

        str = con.readLine("Введите строку: ");
        con.printf("Выведенная вами строка: %s\n", str);
    }
}
