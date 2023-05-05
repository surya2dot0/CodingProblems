package in.learning.integers;

import java.util.HashSet;
import java.util.Set;

public class UniqueNumber {

	public static int uniqueNumber(int arr[]) {
		
		
		Set<Integer> num = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			if(num.contains(arr[i])) {
				num.remove(arr[i]);
			} else {
				num.add(arr[i]);
			}
			
			
		}
		return num.iterator().next();
		
	}
	public static void main(String[] args) {
		int[] arr = new int []{1,2,1,2,4};
		System.out.println(uniqueNumber(arr));

	}

}
