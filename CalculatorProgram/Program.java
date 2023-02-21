
//package calculator;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        char operator;
        double num1, num2;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Operator ( +, -, *, / )");
        operator = input.next().charAt(0);

        System.out.println("Enter the two numbers one by one");
        num1 = input.nextDouble();
        num2 = input.nextDouble();

//        input.close(); // what does this do??

        switch( operator ){
            case '+':           //%f -> float type
                System.out.printf("%.2f + %.2f = %.2f", num1, num2, (num1 + num2));
                break;
            case '-':
                System.out.printf("%.2f - %.2f = %.2f", num1, num2, (num1 - num2));
                break;
            case '*':
                System.out.printf("%.2f * %.2f = %.2f", num1, num2, (num1 * num2));
                break;
            case '/':
                if (num2 != 0)
                    System.out.printf("%.2f / %.2f = %.2f", num1, num2, (num1 / num2));
                else
                    System.out.println("Divide by Zero not possible");
                break;

            default:
                System.out.printf("%c is an invalid operator", operator);
        }
    }
}
