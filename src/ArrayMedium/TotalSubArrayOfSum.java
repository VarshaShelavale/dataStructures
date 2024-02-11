package ArrayMedium;

import java.util.ArrayList;

public class TotalSubArrayOfSum {
	public static void main(String[] args) {
int []a= {3,1,2,4,2,3,1,1};
		int sum =4;
		int count=0;
		
		for (int i = 0; i < a.length; i++) {
			int s=0; 
			for (int j = i; j < a.length; j++) {
				s+=a[j];
				if(s==sum) {
					count++;
				}
				
			}
			
		}
		System.out.println(count);
	}
}
