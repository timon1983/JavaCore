package Task3;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;


public class Foo {

    Semaphore semaphore1 = new Semaphore(0);
    Semaphore semaphore2 = new Semaphore(1);
    Semaphore semaphore3 = new Semaphore(0);



    public synchronized void first() {
        try {
            semaphore2.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("First");
        semaphore1.release();
        semaphore2.release();
    }

        public synchronized void second() {
            try {
                semaphore1.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                semaphore2.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("Second");
            semaphore2.release();
            semaphore3.release();

    }
            public synchronized void third() {
                try {
                    semaphore3.acquire();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    semaphore2.acquire();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print("Third");
                semaphore2.release();
    }
}





class FooMain{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Foo foo = new Foo();

        CompletableFuture.runAsync(() -> {

            foo.third();
        });

        CompletableFuture.runAsync(() -> {

            foo.first();
        });
        CompletableFuture.runAsync(() -> {

            foo.second();
        });
    }
}