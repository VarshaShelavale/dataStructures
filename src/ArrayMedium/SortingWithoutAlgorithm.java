package ArrayMedium;

import java.util.Arrays;
import java.util.Iterator;

public class SortingWithoutAlgorithm {
	public static void main(String[] args) {
		int []a= {2,0,2,1,1,0,0,1,2,0,2,1};
		int c=0;
		int []b = new int[a.length];
		for (int i = 0; i <=2; i++) {
			int count=0;
			for (int j = 0; j < a.length; j++) {
				if(i==a[j]) {
					count++;
	
				}
			} 
			
			for (int j = c; j < count+c; j++) {
				 
				b[j]=i;
				
			}
			c+=count;
		} 
		System.out.println(Arrays.toString(b));
	}
}
