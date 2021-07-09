import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

public class ArrayDemo {

	
	public static void main(String[] args) {
		int [] int1 = new int[] {1,2,3};
		int [] int2 = new int[] {4,5,6};
		
		int[] result = ArrayUtils.addAll(int1, int2);
		
		System.out.println(Arrays.toString(result));
	}
}
