package min_and_max;

public class Main {

	public static void main(String[] args) {
		Integer[] intArray = {3, 5, 7, 2, 8, 6};
        MinMaxImpl<Integer> intMinMax = new MinMaxImpl<>();
        System.out.println("Integer Array - Min: " + intMinMax.findMin(intArray));
        System.out.println("Integer Array - Max: " + intMinMax.findMax(intArray));
        
        
        String[] strArray = {"apple", "orange", "banana", "pear"};
        MinMaxImpl<String> strMinMax = new MinMaxImpl<>();
        System.out.println("String Array - Min: " + strMinMax.findMin(strArray));
        System.out.println("String Array - Max: " + strMinMax.findMax(strArray));

        
        Character[] charArray = {'d', 'a', 'v', 'f'};
        MinMaxImpl<Character> charMinMax = new MinMaxImpl<>();
        System.out.println("Character Array - Min: " + charMinMax.findMin(charArray));
        System.out.println("Character Array - Max: " + charMinMax.findMax(charArray));

        
        Float[] floatArray = {2.5f, 1.2f, 3.6f, 0.8f};
        MinMaxImpl<Float> floatMinMax = new MinMaxImpl<>();
        System.out.println("Float Array - Min: " + floatMinMax.findMin(floatArray));
        System.out.println("Float Array - Max: " + floatMinMax.findMax(floatArray));
    }
}
