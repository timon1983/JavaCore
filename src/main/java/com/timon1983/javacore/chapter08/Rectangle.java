package main.java.com.timon1983.javacore.chapter08;

class Rectangle extends Figure{
    Rectangle(double a, double b){
        super(a,b);
    }

    double area() {
        System.out.println("В области четырехугольника.");
        return dim1 * dim2;
    }
}
