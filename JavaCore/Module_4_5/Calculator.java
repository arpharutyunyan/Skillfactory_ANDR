package JavaCore.Module_4_5;

import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /* Get two numbers and one operation.
        Calculate and print the result.
         */
        float num1 = getNumber();
        char operation = getOperation();
        float num2 = getNumber();
        float result = calculate(num1, num2, operation);
        System.out.println("Result is " + result);
    }

    public static float getNumber() {
        // Return number getting from users.
        System.out.println("Enter the number: ");
        float num = scanner.nextFloat();
        return num;
    }

    public static char getOperation() {
        // Return character (+, -, *, /) getting from users.
        System.out.println("Enter your operation: ");
        char operation = scanner.next().charAt(0);
        return operation;
    }

    public static float calculate(float operand1, float operand2, char operation) {
        float result;
        // Check operation
        switch (operation) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                // The second operand can't be 0.
                if (operand2 == 0) {
                    System.out.println("You can't divide by zero!");
                    // If the operand is zero, get another number.
                    operand2 = getNumber();
                    // Recursively call the method for that new operand.
                    result = calculate(operand1, operand2, operation);
                } else {
                    result = operand1 / operand2;
                }
                break;

            default:
                System.out.println("Choose the correct operation!");
                // If the operation is not correct, get new operation.
                operation = getOperation();
                // Recursively call the method for that new operation.
                result = calculate(operand1, operand2, operation);

        }
        return result;
    }
}
