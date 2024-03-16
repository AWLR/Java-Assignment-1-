import java.util.Scanner;

public class AssignmentTask2 {
    public static void main(String[] args) {
        // user input data
        System.out.println("taking data from user");
        Scanner sc = new Scanner(System.in);

        System.out.println("enter an email address: ");
        String email = sc.nextLine();

        // Validate email address
        boolean valid = true;
        if (!email.contains("@")) {
            System.out.println("invalid email: no @ ");
            valid = false;
        } else {
            int atIndex = email.indexOf("@");
            int dotIndex = email.indexOf(".", atIndex);
            if (dotIndex == -1) {
                System.out.println("invalid email: no . after @ ");
                valid = false;
            } else if (dotIndex - atIndex <= 1) {
                System.out.println("invalid email: . immediately after @ symbol");
                valid = false;
            } else {
                String domain = email.substring(dotIndex + 1);
                if (domain.length() < 3) {
                    System.out.println("invalid email: at least 3 characters long after @");
                    valid = false;
                }
            }
        }

        // Print validation result
        if (valid) {
            System.out.println("valid email");
        } else {
            System.out.println("invalid email");
        }

        // Close the scanner
        sc.close();
    }
}

