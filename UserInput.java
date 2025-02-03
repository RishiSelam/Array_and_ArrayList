//UserInput.java
import java.util.Scanner;

class UserInput {
    int[] arrayInput() {
        int[] array = new int[5]; // Modify size if needed
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter " + array.length + " numbers: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        return array;
    }
}
