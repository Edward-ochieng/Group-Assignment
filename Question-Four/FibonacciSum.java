public class FibonacciSum {

    public static void main(String[] args) {
        int sum = sumEvenFibonacci(4000000);
        System.out.println("Sum of even-valued Fibonacci terms not exceeding 4 million: " + sum);
    }

    public static int sumEvenFibonacci(int limit) {
        int a = 1, b = 2, sum = 0;
        while (b <= limit) {
            if (b % 2 == 0) {
                sum += b;
            }
            int nextTerm = a + b;
            a = b;
            b = nextTerm;
        }
        return sum;
    }
}
