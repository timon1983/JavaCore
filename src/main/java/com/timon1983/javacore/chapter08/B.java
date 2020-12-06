package main.java.com.timon1983.javacore.chapter08;

public class B extends A{
    int k;
    int i;
    int total;

    B(){
        System.out.println("В конструкторе В.");
    }
    B(int a , int b){
        super.i = a;
        i = b;
    }
    B(int a , int b , int c){
        super(a,b);
        k = c;
    }
    void show(){
        System.out.println("Член i в суперклассе: " + super.i);
        System.out.println("Член i в подклассе: " + i);
    }

    void showk(){
        System.out.println("k: " + k);
    }
    void sum(){
        //total = i +n; ERROR!!!
        System.out.println("i+j+k: " + (i + j + k));
    }
    void showij(String msg){
       // super.showij();
        System.out.println(msg + k);
    }

    void callme(){
        System.out.println("В методе callme() из класса В");
    }

    //void meth(){} ERROR!!! metod final not override
}
