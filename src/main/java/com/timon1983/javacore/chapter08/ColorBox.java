package main.java.com.timon1983.javacore.chapter08;

public class ColorBox extends Box{
    int color;

//    ColorBox(double w, double h, double d,int c){
//        width = w;
//        height = h;
//        depth = d;
//        color = c;
//    }
    ColorBox(double w, double h, double d, int c) {
        super(w, h, d);
        color = c;
    }
}
