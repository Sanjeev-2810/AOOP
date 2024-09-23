package week7_postlab2;
import java.util.Arrays;

public class GenericBubbleSort {

   
    public static <T extends Comparable<T>> void bubbleSort(T[] array) {
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
             
                if (array[j].compareTo(array[j + 1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
           
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
       
        Integer[] intArray = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Unsorted Integer Array: " + Arrays.toString(intArray));
        bubbleSort(intArray);
        System.out.println("Sorted Integer Array: " + Arrays.toString(intArray));

        Double[] doubleArray = {64.5, 34.3, 25.1, 12.8, 22.6, 11.2, 90.9};
        System.out.println("\nUnsorted Double Array: " + Arrays.toString(doubleArray));
        bubbleSort(doubleArray);
        System.out.println("Sorted Double Array: " + Arrays.toString(doubleArray));
        String[] stringArray = {"banana", "apple", "cherry", "date", "fig", "grape"};
        System.out.println("\nUnsorted String Array: " + Arrays.toString(stringArray));
        bubbleSort(stringArray);
        System.out.println("Sorted String Array: " + Arrays.toString(stringArray));
    }
}

