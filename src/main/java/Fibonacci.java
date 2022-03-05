/**
 * Class that provides with a method that will
 * compute and return the nth position of the
 * fibonacci sequence.
 *
 *
 * author fran1215
**/

public class Fibonacci {

    public int compute(int n){
        if(n < 0) throw new RuntimeException("Negative value: " + n);

        if (n <= 1) return n;

        int previous = 0, next = 1, sum;

        for (int i = 2; i <= n; i++) {

            sum = previous;
            previous = next;
            next = sum + previous;
        }

        return next;
    }
}
