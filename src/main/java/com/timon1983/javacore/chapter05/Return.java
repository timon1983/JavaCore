package main.java.com.timon1983.javacore.chapter05;

public class Return {
    public static void main(String[] args) {
        boolean t = true;
        System.out.println("До возврата.");
        if(t) return;
        System.out.println("Этот оператор выполняться не будет.");
    }
}
