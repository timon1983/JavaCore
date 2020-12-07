package main.java.com.timon1983.javacore.chapter09;

public interface IntStack {
    void push(int item);
    int pop();

    default void clear(){
        System.out.println("Метод clear() не реализован.");
    }
}
