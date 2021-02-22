package chapter28;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureDemo2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Integer age = -1;

        CompletableFuture<String> maturityFuture = CompletableFuture.supplyAsync(() -> {
            if (age < 0) {
                throw new IllegalArgumentException("Возраст не может быть отрицательным");
            }
            if (age > 18) {
                return "Взрослый";
            } else {
                return "Ребёнок";
            }
        }).exceptionally(ex -> {
            System.out.println("Ой! У нас тут исключение - " + ex.getMessage());
            return "Неизвестно!";
        });

        System.out.println("Зрелость: " + maturityFuture.get());
    }
}
