package main.java.com.timon1983.javacore.chapter07;

public class Outer {
    int outer_x = 100;

    void test(){
        for(int i=0; i<10; i++){
            class Inner{
                int y = 10;
                void display(){
                    System.out.println("вывод: outer_x = " + outer_x);
                }
            }
            Inner inner = new Inner();
            inner.display();
        }
    }
//    class Inner{
//        int y = 10;
//        void display(){
//            System.out.println("вывод: outer_x = " + outer_x);
//        }
//    }
    void show(){
        //System.out.println(y);ERROR
    }
}
