import com.calculator.personal.module.BasicOperations;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number");
        double firstNumber = scanner.nextDouble();
        System.out.println("Input second number");
        double secondNumber = scanner.nextDouble();

        BasicOperations basicOperations = new BasicOperations();
        double equals = basicOperations.add(firstNumber, secondNumber);

        System.out.println("The add is:" + equals);
    }
}
