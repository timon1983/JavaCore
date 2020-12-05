package main.java.com.timon1983.javacore.chapter07;

public class Stack {
    private int stck[] = new int[10];
    private int tos;

    Stack(){
        tos = -1;
    }

    void push(int item){
        if(tos == stck.length-1)
            System.out.println("Стек заполнен");
        else
            stck[++tos] = item;
    }

    int pop(){
        if(tos < 0){
            System.out.println("Стек не загружен.");
            return 0;
        }
        else
            return stck[tos--];
    }
}
