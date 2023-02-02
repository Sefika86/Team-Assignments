package weekly_assignments;

import java.util.Arrays;

public class MaxMinNumbersInString {

    public static void main(String[] args) {

        //You are given a string of space separated numbers,
        // write a method that returns the highest and lowest number as an int array.
        // The smaller should be the first element of the array.

        String number = "1 2 3 4 50";

        String[] arr = number.split(" ");

        System.out.println(Arrays.toString(arr));

        int[] result = new int[2];

        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;

        for (String each : arr) {

            int a = Integer.parseInt(each);

            if (minValue > a) {
                minValue = a;
                result[0] = a;
            }

            if (maxValue < a) {
                maxValue = a;
                result[1] = a;
            }


        }
        System.out.println(Arrays.toString(result));


    }
}
