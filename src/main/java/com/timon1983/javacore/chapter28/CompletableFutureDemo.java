package chapter28;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CompletableFutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> welcomeText = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "Rajeev";
        }).thenApply(name -> {
            return "Привет," + name;
        }).thenApply(greeting -> {
            return greeting + ". Добро пожаловать в блог CalliCoder";
        });

        System.out.println(welcomeText.get());
// Выводит: Привет, Rajeev. Добро пожаловать в блог CalliCoder
    }
}
