package weekly_assignments.week2;

import java.util.Arrays;

public class ManipulateArray {
    public static void main(String[] args) {
        //Task: ManipulateArray
        //Given an int array
        //int[] myArray = new int[3];
        //Assign 5 to all elements of this array In a FOR EACH loop

        int[] myArray = new int[3];
        int index = 0;
        for (int each : myArray) {
            myArray[index] = 5;
            index++;
        }
        System.out.println(Arrays.toString(myArray));
    }
}
