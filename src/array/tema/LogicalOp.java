package array.tema;

import java.util.Arrays;
import java.util.List;

public class LogicalOp {
    public void countArray(int[] array) {
        //Ex 2
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    //Ex 3
    public void countOddNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1) {
                System.out.print(array[i] + ", ");
            }
        }
    }

    //Ex 4
    public double makeAverage(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        return sum / array.length;
    }

    //Ex 5
    public static boolean checkIfContains(String[] arr, String targetValue) {
        for (String s : arr) {
            if (s.equals(targetValue))
                return true;
            System.out.println(true + " : s exist in array");
        }
        return false;
    }

    //Ex 6
    public boolean contains(final int[] array, final int key) {
        for (final int i : array) {
            if (i == key) {
                System.out.println(true + " : 3 exist in array");
                return true;
            }
        }
        return false;
    }

    //Ex 7
    public static void lines() {
        int[][] a = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf(" -", a[i][j]);
            }
            System.out.println();
        }
    }
    //Ex 8
    //EX 9
    public static int getSecondSmallest(int[] a, int total) {
        int a1[] = {1, 2, 5, 6, 3, 2};
        int b[] = {44, 66, 99, 77, 33, 22, 55};

        int temp;
        for (int i = 0; i < total; i++) {
            for (int j = i + 1; j < total; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[1];
    }
    //Ex 10
    public static void fillEmptyArray(){
        int[] newArray = new int[] {1,2,3,4};
        int[] result = new int[newArray.length];
        for(int i=0;i<newArray.length;i++)
        //    result[i]=newArray[i];
        System.out.print(newArray[i]+",");
    }
}
