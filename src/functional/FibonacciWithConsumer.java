package functional;

import java.util.function.Consumer;

public class FibonacciWithConsumer {

    public static void main(String[] args) {

        Consumer<Integer> fibonacci = e -> {
            int sum, t1 = 1, t2=2;
            while(t1<=e) {
                System.out.print(t1 + " ");
                sum = t1+t2;
                t1 = t2;
                t2 = sum;
            }
        };

        fibonacci.accept(500);

    }
}
