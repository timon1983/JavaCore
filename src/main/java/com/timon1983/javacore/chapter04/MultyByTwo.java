package main.java.com.timon1983.javacore.chapter04;

public class MultyByTwo {
    public static void main(String[] args) {
        int i;
        int num = 0xFFFFFFF;

        for(i=0; i<4; i++) {
            num = num << 1;
            System.out.println(num);
        }
    }
}
