package demo.utilities;

import java.util.Arrays;
//import java.util.Random;

//import org.apache.commons.lang3.ArrayUtils;

public class ArrayOperationsDemo {
	public void arrayOperations() {
		int[] array = new int[] { 3, 5, 2, 5, 14, 4 };//static declaration
		int[] array1 = new int[] { 3, 5, 2, 5, 14, 4 };//static declaration
//		int anyValue = array[new Random().nextInt(array.length)];//declaration using random
		int[] newArray = Arrays.copyOf(array, array.length + 1);//copy another array data into a new array
		int newItem=110;
		newArray[newArray.length - 1] = newItem;
		boolean areEqual = Arrays.equals(array1, array);
		System.out.println("Comparing two array:"+areEqual);
//		int[] largerArray = ArrayUtils.insert(2, array, 77);
	}

}
