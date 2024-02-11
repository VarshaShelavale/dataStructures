package ArrayMedium;

import java.util.Arrays;

public class RearrangeElements {
	public static void main(String[] args) {
		int[]a= {-1,2,-4,-5,3,4};
		for (int i = 0; i < a.length-1; i++) {
			if(i%2==0 && a[i]<0) {
				int temp= a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
			if(i%2!=0 && a[i]>0) {
				int temp= a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
			
			
		}
		System.out.println(Arrays.toString(a));
	}
}
