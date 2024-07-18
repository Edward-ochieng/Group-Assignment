import java.util.Scanner;

public class TriangleAreaCalculator {

    public static void main(String[] args) {
        TriangleAreaCalculator calculator = new TriangleAreaCalculator();
        double base = calculator.askForBase();
        double height = calculator.askForHeight();
        double area = calculator.calculateArea(base, height);
        calculator.displayArea(area);
    }

    // Method to ask the user to enter the base of the triangle
    public double askForBase() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        return scanner.nextDouble();
    }

    // Method to ask the user to enter the height of the triangle
    public double askForHeight() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the triangle: ");
        return scanner.nextDouble();
    }

    // Method to compute the area of the triangle
    public double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }

    // Method to output the calculated area of the triangle and display it to the user
    public void displayArea(double area) {
        System.out.println("The area of the triangle is: " + area);
    }
}
