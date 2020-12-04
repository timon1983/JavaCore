package main.java.com.timon1983.javacore.chapter06;

public class BoxDemo5 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        mybox1.setDim(10, 20, 15);
        mybox1.setDim(3, 6, 9);

        vol = mybox1.volume1();
        System.out.println("Объём равен " + vol);

        vol = mybox2.volume1();
        System.out.println("Объём равен " + vol);

    }
}
