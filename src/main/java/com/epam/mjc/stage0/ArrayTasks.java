package com.epam.mjc.stage0;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
        String seasons[] = new String[]{"winter", "spring", "summer", "autumn"};
        for (int i = 0; i < 4; i++) {
            return seasons;
        }

        /**
         * Generate an int[] array of consecutive positive integers
         * starting at 1 of the given length (length parameter > 0).
         * <p>
         * Example:
         * <p>
         * length = 1  -> [1]
         * length = 3  -> [1, 2, 3]
         * length = 5  -> [1, 2, 3, 4, 5]
         */
        public int[] generateNumbers ( int length){
           generateNumbers = new int[length];
            for (int i = 0; i < generateNumbers.length; i++) {
               generateNumbers[i] = i + 1;
            }
            for (int i = 0; i < generateNumbers.length; i++) {
                System.out.print(generateNumbers[i] + " ");
        }


        /**
         * Find the sum of all elements of the int[] array.
         * <p>
         * Example:
         * <p>
         * arr = [1, 3, 5]   -> sum = 9
         * arr = [5, -3, -4] -> sum = -2
         */
        public int totalSum ( int[] arr){
            arr = new int[length];
            totalSum = 0;
            for (int i : arr)
                totalSum += i;
            System.out.println(totalSum);
        }
    }


    /**
     * Return the index of the first occurrence of number in the arr array.
     * If there is no such element in the array, return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2
     * arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
            // if array is Null
            if (arr == null) {
                return -1;
            }

            // find length of array
            int len = arr.length;
            int i = 0;

            // traverse in the array
            while (i < len) {

                // if the i-th element is t
                // then return the index
                if (arr[i] == number) {
                    return i;
                }
                else {
                    i = i + 1;
                }
            }
            return -1;
        }
    }

    /**
     * Return the new String[] array obtained from the arr array
     * by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"]
     * arr = ["pineapple", "apple", "pen"] -> ["pen", "apple", "pineapple"]
     */
    public String[] reverseArray(String[] arr) {

    }


    /**
     * Return new int[] array obtained from arr int[] array
     * by choosing positive numbers only.
     * P.S. 0 is not a positive number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3]
     * arr = [-1, -2, -3]   -> []
     * arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {

    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules:
     * Incoming one-dimensional arrays must be arranged in ascending order of their length;
     * numbers in all one-dimensional arrays must be in ascending order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]]
     * arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {
            int[][] arr1 = sortArrByLength(arr);
            for (int i = 0; i < arr1[i].length; i++) {
                sortArrAscending(arr[i]);
            }
            return arr1;
        }
        }

    }
}
