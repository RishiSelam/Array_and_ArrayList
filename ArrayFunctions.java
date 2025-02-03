// ArrayFunctions.java
// Rishi Selam
// AIML B2
// 23070126107

import java.util.ArrayList;

class ArrayFunctions {
    
    // Displays an array
    void display(ArrayList<Integer> array) {
        System.out.println("Array is: " + array);
    }

    // Splits input numbers into even and odd lists
    void evenOdd() {
        UserInput in = new UserInput();
        int[] array = in.arrayInput();
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int num : array) {
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }

        System.out.println("Even Numbers:");
        display(even);
        System.out.println("Odd Numbers:");
        display(odd);
    }

    // Finds two neighboring numbers with the smallest difference
    void min() {
        UserInput in = new UserInput();
        int[] array = in.arrayInput();

        if (array.length < 2) {
            System.out.println("Not enough numbers to compare!");
            return;
        }

        int minIndex = 0;
        int minDiff = Math.abs(array[1] - array[0]);

        for (int i = 1; i < array.length - 1; i++) {
            int diff = Math.abs(array[i + 1] - array[i]);
            if (diff < minDiff) {
                minDiff = diff;
                minIndex = i;
            }
        }

        System.out.println("Two closest neighboring numbers: " + array[minIndex] + " & " + array[minIndex + 1]);
        System.out.println("Index of first number: " + minIndex);
    }
}
