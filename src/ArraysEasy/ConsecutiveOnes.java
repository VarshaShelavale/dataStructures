package ArraysEasy;

import java.util.Arrays;

public class ConsecutiveOnes {
public static void main(String[] args) {
	int []a = {1,1,0,1,1,1,0,1,1,1,1,0,1};
	int count=0;
	int c =0;
	for (int i = 0; i < a.length; i++) {
		if(a[i]==1) {
			c++;
			if(count<c)
			count=c;
		}
		else if( a[i]!=1){
			c=0;
		}
		
		}
	
	System.out.println(count);
}
}
