package main.java.com.timon1983.javacore.chapter11;

public class O {
    int n;
    boolean valueSet = false;

    synchronized int get() {
        while (!valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Исключение типа " + e + " перхвачено");
            }
            System.out.println("Получено: " + n);
            valueSet = false;
            notify();
            return n;

    }

        synchronized void put(int n) {
            while (valueSet)
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.println("Исключение типа " + e + " перхвачено");
                }
            this.n = n;
            valueSet = true;
            System.out.println("Отправлено: " + n);
            notify();
    }
}

class ProducerO implements Runnable{
    O o;

    ProducerO(O o){
        this.o = o;
        new Thread(this, "Поставщик").start();
    }

    public void run(){
        int i = 0;

        while (true){
            o.put(i++);
        }
    }
}

class ConsumerO implements Runnable {
    O o;

    ConsumerO(O o) {
        this.o = o;
        new Thread(this, "Потребитель").start();
    }

    public void run() {
        int i = 0;

        while (true) {
            o.get();
        }
    }
}

class PCFixed{
    public static void main(String[] args) {
        O o = new O();
        new ProducerO(o);
        new ConsumerO(o);

        System.out.println("Для остановки нажмите Ctrl-C.");
    }
}



