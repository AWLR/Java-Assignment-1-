import java.util.Scanner;

public class AssignmentTask3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Custom Calculator");
        System.out.print("Enter the first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double b = scanner.nextDouble();

        System.out.println("Select operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Modulus (%)");
        System.out.println("6. Custom operation");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result: " + (a + b));
                break;
            case 2:
                System.out.println("Result: " + (a - b));
                break;
            case 3:
                System.out.println("Result: " + (a * b));
                break;
            case 4:
                if (b == 0 || a == 0) {
                    System.out.println("Error: Division by zero");
                } else {
                    System.out.println("Result: " + (a / b));
                }
                break;
            case 5:
                System.out.println("Result: " + (a % b));
                break;
            case 6:
                System.out.println("Enter custom operation (e.g., a*b or a+b):");
                scanner.nextLine(); // consume newline
                String customOperation = scanner.nextLine();
                String[] parts = customOperation.split("[+\\-*/%]");
                if (parts.length == 2) {
                    double result = 0;
                    char operator = customOperation.charAt(parts[0].length());
                    double num1 = Double.parseDouble(parts[0]);
                    double num2 = Double.parseDouble(parts[1]);
                    switch (operator) {
                        case '+':
                            result = num1 + num2;
                            break;
                        case '-':
                            result = num1 - num2;
                            break;
                        case '*':
                            result = num1 * num2;
                            break;
                        case '/':
                            if (num2 == 0 || num1 ==0) {
                                System.out.println("Error: Division by zero");
                                return;
                            }
                            result = num1 / num2;
                            break;
                        case '%':
                            result = num1 % num2;
                            break;
                        default:
                            System.out.println("Invalid operation");
                            return;
                    }
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Invalid custom operation");
                }
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
