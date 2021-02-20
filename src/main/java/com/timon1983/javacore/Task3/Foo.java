package Task3;

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

        Thread threadFirst = new Thread(()->{
            foo.first();
        });

        Thread threadSecond = new Thread(() -> {
            foo.second();
        });

        Thread threadThird = new Thread(() -> {
            foo.third();
        });

        threadFirst.setPriority(10);
        threadSecond.setPriority(5);
        threadThird.setPriority(1);

        threadFirst.start();
        threadSecond.start();
        threadThird.start();
    }
}