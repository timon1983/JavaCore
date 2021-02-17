package main.java.com.timon1983.javacore.chapter07;

public class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();

        System.out.println("Факториал 3 равен " + f.fact1(3));
        System.out.println("Факториал 4 равен " + f.fact1(4));
        System.out.println("Факториал 5 равен " + f.fact1(5));
    }
}
