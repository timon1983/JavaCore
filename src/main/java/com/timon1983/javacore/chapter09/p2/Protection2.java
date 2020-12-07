package main.java.com.timon1983.javacore.chapter09.p2;
import main.java.com.timon1983.javacore.chapter09.p1.Protection;

public class Protection2 extends Protection {
    Protection2(){
        System.out.println("конструктор унаследованный из другого пакета");

        //System.out.println("n = " + n);только для данного класса или пакета
        //System.out.println("n_pri = " + n_pri); только для данного класса

        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
