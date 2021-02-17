package main.java.com.timon1983.javacore.chapter11;

 class Aq {
    synchronized void foo(Bq b){
        String name = Thread.currentThread().getName();

        System.out.println(name + " вошел в метод A.foo()");

        try{
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println("Класс А прерван");
        }
        System.out.println(name + " пытается вызвать метод B.last()");
        b.last();
    }

    synchronized void last(){
        System.out.println("В методе A.last()");
    }
}

class Bq{
    synchronized void bar(Aq a){
        String name = Thread.currentThread().getName();
        System.out.println(name + " вошел в метод B.bar()");

        try{
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println("Класс В прерван");
        }

        System.out.println(name + " пытается вызвать метод A.last()");
    }

    synchronized void last(){
        System.out.println("В методе A.last()");
    }
}

class Deadlock implements Runnable{
    Aq a = new Aq();
    Bq b = new Bq();

    Deadlock(){
        Thread.currentThread().setName("Главный поток");
        Thread t = new Thread(this, "Соперничающий поток");
        t.start();

        a.foo(b);
        System.out.println("Назад в главный поток");
    }

    public void run(){
        b.bar(a);
        System.out.println("Назад в другой поток");
    }

    public static void main(String[] args) {
        new Deadlock();
    }
}
