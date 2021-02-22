package Task3;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Foo {

    public void first(){
        System.out.print("First");
    }

    public void second(){
        System.out.print("Second");
    }

    public void third(){
        System.out.print("Third");
    }
}

class FooMain{
    public static void main(String[] args) {
        Foo foo = new Foo();
        CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(() -> {
            foo.first();
            foo.second();
            foo.third();
        });
        try {
            completableFuture.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}