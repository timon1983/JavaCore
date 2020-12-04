package main.java.com.timon1983.javacore.chapter05;

public class NoBody {
    public static void main(String[] args) {
        int i = 100;
        int j = 200;
        while(++i < --j);
        System.out.println("Среднее значение равно " + i);
    }
}
