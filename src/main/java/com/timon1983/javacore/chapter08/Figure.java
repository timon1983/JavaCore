package main.java.com.timon1983.javacore.chapter08;

abstract class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b){
        dim1 = a;
        dim2 = b;
    }

//    double area(){
//        System.out.println("Площадь фигуры не определена.");
//        return 0;
//    }
    abstract double area();
}
