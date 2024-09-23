package week7_postlab1;
import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch<T> {

    public int binarySearch(T[] array, T key, Comparator<T> comparator) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int comparison = comparator.compare(array[mid], key);

            if (comparison == 0) {
                return mid; 
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1; 
    }

    
    public static void main(String[] args) {
        BinarySearch<Integer> intSearch = new BinarySearch<>();
        Integer[] intArray = {1, 3, 5, 7, 9, 11, 13};
        System.out.println("Integer Array: " + Arrays.toString(intArray));
        System.out.println("Element 7 found at index: " +
                intSearch.binarySearch(intArray, 7, Integer::compareTo));

        BinarySearch<Double> doubleSearch = new BinarySearch<>();
        Double[] doubleArray = {1.2, 3.4, 5.6, 7.8, 9.0, 11.2, 13.4};
        System.out.println("Double Array: " + Arrays.toString(doubleArray));
        System.out.println("Element 7.8 found at index: " +
                doubleSearch.binarySearch(doubleArray, 7.8, Double::compareTo));

        BinarySearch<String> stringSearch = new BinarySearch<>();
        String[] stringArray = {"apple", "banana", "cherry", "date", "fig", "grape"};
        System.out.println("String Array: " + Arrays.toString(stringArray));
        System.out.println("Element 'date' found at index: " +
                stringSearch.binarySearch(stringArray, "date", String::compareTo));
    }
}
