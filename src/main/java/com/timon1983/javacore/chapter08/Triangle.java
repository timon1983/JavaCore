package main.java.com.timon1983.javacore.chapter08;

class Triangle extends Figure{
    Triangle(double a, double b){
        super(a,b);
    }

    double area(){
        System.out.println("В области треугольника.");
        return dim1 * dim2 / 2;
    }
}
