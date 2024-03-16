import java.util.Scanner;

public class AssignmentTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = 1  ;
        System.out.print("Enter the height of the pyramid (must be positive value): ");
        height = sc.nextInt();

        if(height >0){ // Check if the user input is more that 0 and not a negative number
            // Upper half of the pyramid
            for (int i = 0; i < height; i++) {
                // Printing leading spaces
                for (int j = i; j < height - 1; j++) {
                    System.out.print(" ");
                }

                // Printing numbers in increasing order
                for (int j = 1; j <= i + 1; j++) {
                    System.out.print(j);
                }

                // Printing numbers in decreasing order
                for (int j = i; j > 0; j--) {
                    System.out.print(j);
                }

                System.out.println();
            }
            for (int i = height - 2; i >= 0; i--) {
                // Printing leading spaces
                for (int j = i; j < height - 1; j++) {
                    System.out.print(" ");
                }

                // Printing numbers in increasing order
                for (int j = 1; j <= i + 1; j++) {
                    System.out.print(j);
                }

                // Printing numbers in decreasing order
                for (int j = i; j > 0; j--) {
                    System.out.print(j);
                }

                System.out.println();
            }

        }else{
            System.out.print("Please rerun and try to enter a positive number ");

        }

    }
}