package Recurrsion;

import java.util.Arrays;

public class ReverseAnArray {
	public static void reve(int []a,int start,int end) {
		if(start<end) {
			int temp = a[start];
			a[start]=a[end];
			a[end]= temp;
			reve(a,start+1,end-1);
		}
		
		
	}
	public static void main(String[] args) {
		int arr[]= {1,4,3,5,3};
		reve(arr,0,arr.length-1);
				System.out.println(Arrays.toString(arr));
	}
}
