package main.java.com.timon1983.javacore.chapter06;

public class Stack {
    int stck[] = new int[10];
    int tos;

    public Stack(){
        tos = -1;
    }
    public void push(int item){
        if(tos == 9)
            System.out.println("Стек заполнен");
        else
            stck[++tos] = item;
    }
    public int pop(){
        if(tos < 0){
            System.out.println("Стек не загружен.");
            return 0;
        }
        else
            return stck[tos--];
    }
}
