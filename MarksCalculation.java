// QUESTION 2:
// Create a java project, package and class. In the class, write a method that asks a lecturer to enter marks for three units, java programming, networking and maths. The method should compute the average marks for three units and output the data in the following format. 

// marks for java programming is: ?
// marks for networking is: ?
// marks for maths is: ?
// the average is: ?
import java.util.Scanner;

public class MarksCalculation {

    public static void main(String[] args) {
        calculateAverageMarks();
    }

    public static void calculateAverageMarks() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks for Java Programming: ");
        double javaMarks = scanner.nextDouble();

        System.out.println("Enter marks for Networking: ");
        double networkingMarks = scanner.nextDouble();

        System.out.println("Enter marks for Maths: ");
        double mathsMarks = scanner.nextDouble();

        double averageMarks = (javaMarks + networkingMarks + mathsMarks) / 3;

        System.out.println("Marks for Java Programming is: " + javaMarks);
        System.out.println("Marks for Networking is: " + networkingMarks);
        System.out.println("Marks for Maths is: " + mathsMarks);
        System.out.println("The average is: " + averageMarks);

        scanner.close();
    }
}
