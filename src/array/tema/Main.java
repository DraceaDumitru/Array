package array.tema;

import array.Array;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        LogicalOp logicalOp = new LogicalOp();
        //Ex 1
        System.out.println(calculator.addition(4, 3, 2));
        System.out.println(calculator.addition(2.3, 7));
        System.out.println(calculator.addition(8, 3));
        System.out.println(calculator.multiplication(3, 2, 9));
        System.out.println(calculator.multiplication(3.5F, 3.8D, 3));
        System.out.println(calculator.multiplication(2, 5, 7, 9));
        System.out.println(calculator.substration(10, 2.1F, 2.4F));
        System.out.println(calculator.substration(30.5F, 2.1D, 4, 1F));
        System.out.println(calculator.substration(80, 6.4D, 2.1F));
        System.out.println(calculator.division(24, 4D));
        System.out.println(calculator.division(50.3D, 4, 2.4D));
        System.out.println(calculator.division(1000, 3.1F, 5.3D, 2, 3.3D));
        System.out.println();
        //Ex 2
        System.out.println("Count numbers to 100 : ");
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
        }
        logicalOp.countArray(array);
        System.out.println();
        //Ex 3
        System.out.println("Count odd numbers to 100 : ");
        int[] array1 = new int[100];
        for (int i = 0; i < 100; i++) {
            array1[i] = i + 1;
        }
        logicalOp.countOddNumbers(array1);
        System.out.println();
        //Ex 4
        System.out.println("do average to array of 18 : ");
        int[] array2 = new int[18];
        for (int i = 0; i < 18; i++) {
            array2[i] = i + 1;
        }
        double sum = 0;
        for (int i = 0; i < array2.length; i++) {
            sum = sum + array2[i];
            logicalOp.makeAverage(array2);
        }
        double average = sum / array2.length;
        System.out.println(average);
        //Ex 5
         System.out.println("check if contain a value in array : ");
         logicalOp.checkIfContains(new String[]{"a , s , c, v,g"}, "s");
         System.out.println();
        //EX 6
        System.out.println("check if contain a number in arrray : ");
        logicalOp.contains(new int[]{3, 1, 2, 3, 2},3);
        System.out.println();
        //Ex 7
        System.out.println("Display a grille");
        logicalOp.lines();
        System.out.println();
        //Ex 8
        //Ex 9
        System.out.println("display second biggest number from array : ");
        logicalOp.getSecondSmallest(new int[]{1, 2, 5, 6, 3, 2},6);
        int a[] = {1, 2, 5, 6, 3, 2};
        int b[] = {44, 66, 99, 77, 33, 22, 55};
        System.out.println("Second smallest: " + logicalOp.getSecondSmallest(a, 6));
        System.out.println("Second smallest: " + logicalOp.getSecondSmallest(b, 7));
        System.out.println();
        //Ex 9
        System.out.println("Fill empty array ");
        logicalOp.fillEmptyArray();
        System.out.println();
    }
}
