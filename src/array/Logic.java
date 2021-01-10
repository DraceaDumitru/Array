package array;

public class Logic {
    public void printArray(int[] array){

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] );
        }

    }

    public void populateArrayWithValues(int[] array, int maxValue){
        for (int i = 0; i < maxValue; i++){
            array[i] = i +1;
        }
    }

    public int[] setConsecutiveValuesToArray(int minim, int maxValue){
        int[] array = new int[maxValue];
        for (int i = minim-1; i < maxValue; i++){
            array[i] = i +1;
        }
        return array;
    }

    public double getAverageFromArray(int[] array){
        double sum = 0;
        for (int i = 0; i < array.length;i++){
            sum = sum + array[i]; // sum +=myArray[i];

        }
        return sum/array.length;

    }
    public boolean isValueInArray(int[] array, int ceva) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == ceva)
                return true;
        }
        return false;
    }
}
