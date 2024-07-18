import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[15];
        
        // a) Take 15 integer inputs from the user and store them in an array
        System.out.println("Enter 15 integers:");
        for (int i = 0; i < 15; i++) {
            numbers[i] = scanner.nextInt();
        }

        // a) Print the values stored in the array on screen
        System.out.println("The values in the array are:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // b) Check if a user-specified number is in the array
        System.out.println("Enter a number to check if it is in the array:");
        int target = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("The number found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Number not found in this array");
        }

        // c) Create another array with elements in reverse order
        int[] reversedNumbers = new int[15];
        for (int i = 0; i < numbers.length; i++) {
            reversedNumbers[i] = numbers[numbers.length - 1 - i];
        }
        System.out.println("The values in the reversed array are:");
        for (int number : reversedNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // d) Get the sum and product of all elements of the array
        int sum = 0;
        int product = 1;
        for (int number : numbers) {
            sum += number;
            product *= number;
        }
        System.out.println("Sum of all elements: " + sum);
        System.out.println("Product of all elements: " + product);
    }
}
