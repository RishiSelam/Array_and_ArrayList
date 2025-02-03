//main.java
import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        ArrayFunctions functions = new ArrayFunctions();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Display Even/Odd Numbers");
            System.out.println("2. Find Minimum Neighboring Numbers");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    functions.evenOdd();
                    break;
                case 2:
                    functions.min();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return; // Exit the program
                default:
                    System.out.println("Invalid choice! Please enter 1, 2, or 3.");
            }
        }
    }
}
