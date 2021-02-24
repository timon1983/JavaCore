package Task3;

import java.util.concurrent.*;

public class FooEx2 {

    public void first() {
        System.out.print("First");
    }

    public void second() {
        System.out.print("Second");
    }

    public void third() {
        System.out.print("Third");
    }
}

class FooMain2{

    public static void main(String[] args)  {
        CyclicBarrier cb3 = new CyclicBarrier(1);
        CyclicBarrier cb2 = new CyclicBarrier(1, new FooThread3(cb3));
        CyclicBarrier cb1 = new CyclicBarrier(1, new FooThread2(cb2));

        new FooThread1(cb1);
    }
}

class FooThread1 implements Runnable{
    CyclicBarrier cyclicBarrier;
    Foo foo = new Foo();

    FooThread1(CyclicBarrier cb){
        cyclicBarrier = cb;
        new Thread(this).start();
    }
    @Override
    public void run() {
        foo.first();
        try {
            cyclicBarrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}

class FooThread2 implements Runnable{
    CyclicBarrier cyclicBarrier;
    Foo foo1 = new Foo();

    FooThread2(CyclicBarrier cb){
        cyclicBarrier = cb;
    }
    @Override
    public void run() {
        foo1.second();
        try {
            cyclicBarrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}

class FooThread3 implements Runnable{
    CyclicBarrier cyclicBarrier;
    Foo foo2 = new Foo();

    FooThread3(CyclicBarrier cb){
        cyclicBarrier = cb;
    }
    @Override
    public void run() {
 //       foo2.third();
        try {
            cyclicBarrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
