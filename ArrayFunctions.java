// ArrayFunctions.java

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

    // Finds the minimum number in the array
    void min() {
        UserInput in = new UserInput();
        int[] array = in.arrayInput();

        if (array.length == 0) {
            System.out.println("Array is empty!");
            return;
        }

        int minNum = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minNum) {
                minNum = array[i];
            }
        }

        System.out.println("Minimum number in the array: " + minNum);
    }
}
