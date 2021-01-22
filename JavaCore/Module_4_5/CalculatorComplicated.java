package JavaCore.Module_4_5;

import java.util.Scanner;

public class CalculatorComplicated {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Get first number
        float num1 = getNumber();
        // Endless cycle
        while (true) {
            // Get operation
            char operation = getOperation();
            // As first number will become the result of previous operation, that's why number1 = 0.
            if (operation == 'c') {
                num1 = 0F;
            } else if (operation == 's') {
                // Return number1 because result is assigned num1 and stop the program
                System.out.println("Result is " + num1);
                break;
            } else {
                float num2 = getNumber();
                float result = calculate(num1, num2, operation);
                System.out.println("Result is " + result);
                num1 = result;
            }
        }
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
        if (operation == '+') {
            result = operand1 + operand2;
        } else if (operation == '-') {
            result = operand1 - operand2;
        } else if (operation == '*') {
            result = operand1 * operand2;
        } else {
            if ((operation == '/') && (operand2 == 0)) {
                System.out.println("You can't divide by zero!");
                // If the operand is zero, get another number.
                operand2 = getNumber();
                // Recursively call the method for that new operand.
                result = calculate(operand1, operand2, operation);
            } else {
                result = operand1 / operand2;
            }
        }
        return result;
    }
}
