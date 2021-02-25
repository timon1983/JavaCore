package Task4;

public class FizzBuzz2 {
    private int number;

    public FizzBuzz2(int n) {
        number = n;
    }

    public void fizz(int num) {
        if (num % 3 == 0 && num % 5 != 0) {
                System.out.print("fizz" + ", ");
        }
    }
    public void buzz(int num) {
        if (num % 5 == 0 && num % 3 != 0) {
                System.out.print("buzz" + ", ");
            }
    }
    public void fizzbuzz(int num) {
        if (num % 5 == 0 && num % 3 == 0) {
                System.out.print("fizzbuzz" + ", ");
            }
    }
    public void number(int num) {
        if (num % 3 != 0 && num % 5 != 0) {
                System.out.print(String.valueOf(num) + ", ");
            }
    }
}
