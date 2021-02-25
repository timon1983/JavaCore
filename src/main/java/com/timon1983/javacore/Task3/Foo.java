package Task3;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Semaphore;

public class Foo {

    Semaphore semaphore2 = new Semaphore(0);
    Semaphore semaphore3 = new Semaphore(0);
    Semaphore semaphore1 = new Semaphore(1);

    public void first() {
        try {
            semaphore1.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("First");

        semaphore2.release();
        semaphore1.release();
   }
        public void second() {
        try {
                semaphore2.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("Second");
            semaphore3.release();
            semaphore1.release();
    }
            public void third() {
       try {
                   semaphore3.acquire();
                } catch (InterruptedException e) {
                   e.printStackTrace();
                }
                System.out.print("Third");
              semaphore2.release();
              semaphore3.release();
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
       Thread.sleep(1000);
    }
}