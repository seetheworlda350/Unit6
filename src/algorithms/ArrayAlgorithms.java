package algorithms;


import java.util.Arrays;

public class ArrayAlgorithms {
    public static void main(String[] args) {
        int[] array = {5, 8, -3, 0, 200, -10, 5, -3};
        System.out.println("The smallest number is: " + findMin(array));
        System.out.println("The largest number is: " + findMax(array));
        System.out.println("The average is: " + findAverage(array));
        System.out.println("The array shifted left is: " + Arrays.toString(shiftLeft(array)));
        System.out.println("The array shifted right is: " + Arrays.toString(shiftRight(array)));
        System.out.println("The reversed array is: " + Arrays.toString(reverseArray(array)));
    }

    // Finds the minimum value in an array
    public static int findMin(int[] array) {
        int minValue = Integer.MAX_VALUE;
        for (int num : array) {
            if (num <= minValue) {
                minValue = num;
            }
        }
        return minValue;
    }

    // Finds the maximum value in an array
    public static int findMax(int[] array) {
        int maxValue = Integer.MIN_VALUE;
        for (int num : array) {
            if (num >= maxValue) {
                maxValue = num;
            }
        }
        return maxValue;
    }

    // Finds the average value of elements in an array
    public static double findAverage(int[] array) {
        double sum = 0;
        int count = 0;
        for (int num : array) {
            sum += num;
            count++;
        }
        sum = sum / count;
        return sum;
    }

    // Shifts the array to the left by one position
    public static int[] shiftLeft(int[] array) {
        int[] finalArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                finalArray[i] = array[0];
            } else {
                finalArray[i] = array[i + 1];
            }
        }
        return finalArray;
    }

    // Shifts the array to the right by one position
    public static int[] shiftRight(int[] array) {
        int[] finalArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                finalArray[i] = array[array.length - 1];
            } else {
                finalArray[i] = array[i - 1];
            }
        }
        return finalArray;
    }

    // Reverses the elements in the array
    public static int[] reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            reversedArray[array.length - 1 - i] = array[i];
        }
        return reversedArray;
    }
}