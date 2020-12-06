package main.java.com.timon1983.javacore.chapter08;

public class A {
    int i, j;
    private int n;

    A() {
        System.out.println("В конструкторе А.");
    }

    A(int a, int b) {
        i = a;
        j = b;
    }

    void setij(int x, int y) {
        i = x;
        n = y;
    }

    void showij() {
        System.out.println("i и j: " + i + " " + j);
    }

    void callme(){
        System.out.println("В методе callme() из класса А");
    }

    final void meth(){
        System.out.println("Это завершенный метод.");
    }
}
