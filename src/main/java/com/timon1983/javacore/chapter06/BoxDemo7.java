package main.java.com.timon1983.javacore.chapter06;

public class BoxDemo7 {
    public static void main(String[] args) {
        Box mybox1 = new Box(10,20,15);
        Box mybox2 = new Box(3,6,9);
        double vol;

        vol = mybox1.volume1();
        System.out.println("Объём равен " + vol);
        vol = mybox2.volume1();
        System.out.println("Объём равен " + vol);
    }
}
