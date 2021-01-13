package main.java.com.timon1983.javacore.chapter15;

public interface MyFunc5<T> {
    MyClass3<T> func(T n);
}

class MyClass3<T>{
    private T val;

    MyClass3(T v){
        val = v;
    }
    MyClass3(){
        val = null;
    }
    T getVal(){
        return val;
    }
}

class ConstructorRefDemo2{
    public static void main(String[] args) {
        MyFunc5<Integer> myClassCons = MyClass3<Integer>::new;
        MyClass3<Integer> mc = myClassCons.func(100);
        System.out.println("Значение val в объекте mc равно " + mc.getVal());
    }
}
