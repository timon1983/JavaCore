package main.java.com.timon1983.javacore.chapter09.p2;

import main.java.com.timon1983.javacore.chapter07.OverloadDemo;
import main.java.com.timon1983.javacore.chapter09.p1.Protection;


public class OverPackage {
    OverPackage(){
        Protection p = new Protection();
        System.out.println("конструктор из другого пакета");
        //System.out.println("n = " + n);только для данного класса или пакета
        //System.out.println("n_pri = " + n_pri); только для данного класса
        //System.out.println("n_pro = " + n_pro); только для данного классаб подкласса или пакета
        System.out.println("n_pub = " + p.n_pub);

    }
}
