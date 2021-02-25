package Task4;

import java.util.concurrent.CompletableFuture;

public class FizzBuzzMain2 {
    public static void main(String[] args) {
        int n = 15;
        FizzBuzz2 fb = new FizzBuzz2(n);

     for(int i = 1; i <= n ; i++) {
         int fizzI = i;
         CompletableFuture.runAsync(() -> {
        fb.fizz(fizzI);
    });
         int buzzI = i;
         CompletableFuture.runAsync(() -> {
        fb.buzz(buzzI);
    });
         int fizzbuuzzI = i;
         CompletableFuture.runAsync(() -> {
        fb.fizzbuzz(fizzbuuzzI);
    });
         int numberI = i;
         CompletableFuture.runAsync(() -> {
        fb.number(numberI);
    });
         try {
             Thread.sleep(100);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }
    }
}
