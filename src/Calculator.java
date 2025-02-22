import javax.swing.plaf.InputMapUIResource;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operation;
        int first_number;
        int second_number;
        while (true) {
            try {
                System.out.print("Insert the first number: ");
                first_number = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Please insert a valid number.");
                scanner.nextLine();
            }
        }
        while (true) {
            try {
                System.out.print("Insert the second number: ");
                second_number = scanner.nextInt();
                break;
            }
            catch (InputMismatchException e) {
                System.out.println("Please insert a valid number.");
                scanner.nextLine();
            }
        }
        scanner.nextLine();
        while (true) {
            try {
                System.out.print("Insert a sign: (+, -, *, /): ");
                operation = scanner.nextLine();
                if (!operation.equals("+") && !operation.equals("-") &&
                        !operation.equals("*") && !operation.equals("/")) {
                    throw new InputMismatchException("Invalid sign.");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        }
        switch (operation) {
            case "+":
                int addition_result = first_number + second_number;
                System.out.println("The result is: " + addition_result);
                break;
            case "-":
                int substraction_result = first_number - second_number;
                System.out.println("The result is: " + substraction_result);
                break;
            case "*":
                double multiplication_result = first_number * second_number;
                System.out.println("The result is: " + multiplication_result);
                break;
            case "/":
                if (second_number != 0) {
                    double division_result = first_number / second_number;
                    System.out.println("The result is: " + division_result);
                }
                else {
                    System.out.println("You can't divide by 0!");
                }
                break;
        }
    }
}
