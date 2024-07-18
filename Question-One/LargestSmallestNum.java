// Create a java project, name it methods_in_java, in the project create a package named java_methods and in the package, create a class and named methods. 
// b. in the classmethods, write a method that asks user to enter three numbers, using if statement determine the largest number, the smallest number and display the results in the following format. 
// The smallest number: ?
// The largest number  number: ?
// ? is your largest and ? smallest number.

import java.util.Scanner;

public class LargestSmallestNum {

    public static void main(String[] args) {
        findLargestAndSmallest();
    }

    public static void findLargestAndSmallest() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Enter the third number: ");
        int num3 = scanner.nextInt();

        int largest, smallest;

        // Determine the largest number
        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }

        // Determine the smallest number
        if (num1 <= num2 && num1 <= num3) {
            smallest = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            smallest = num2;
        } else {
            smallest = num3;
        }

        System.out.println("The smallest number: " + smallest);
        System.out.println("The largest number: " + largest);
        System.out.println(largest + " is your largest and " + smallest + " is your smallest number.");

        scanner.close();
    }
}
