public class FibonacciSequence {

    public static void main(String[] args) {
        int terms = 10;
        generateFibonacci(terms);
    }

    public static void generateFibonacci(int terms) {
        int a = 1, b = 2;
        System.out.print(a + ", " + b);

        for (int i = 3; i <= terms; i++) {
            int nextTerm = a + b;
            System.out.print(", " + nextTerm);
            a = b;
            b = nextTerm;
        }
        System.out.println();
    }
}
