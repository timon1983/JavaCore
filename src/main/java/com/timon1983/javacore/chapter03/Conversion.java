package main.java.com.timon1983.javacore.chapter03;

public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;
        System.out.println("\nПреобразование типа int в тип byte.");
        b = (byte)i;
        System.out.println("i и b" + i + " " + b);
        System.out.println("\nПреобразование типа double в тип int.");
        i = (byte)d;
        System.out.println("i и d" + i + " " + d);
        System.out.println("\nПреобразование типа double в тип byte.");
        b = (byte)d;
        System.out.println("b и d" + b + " " + d);
    }
}
