package sortingAlgorithm;

import java.util.Arrays;

public class CombineSortedArray {
public static void main(String[] args) {
	int []a = {1,3,4,6,8};
	int []b= {2,4,7,8,9};
	
	int left = 0;
	int right = 0;
	
	int arr[]= new int [a.length+b.length];
	int k =0;
	while(a.length > left && b.length> right) {
		if(a[left]> b[right]) {
			arr[k]=b[right];
			right++;
			k++;
		}
		else{
			arr[k]=a[left];
			left++;
			k++;
		}
		System.out.println(".....");
	}
	System.out.println(".......===");
	while(left<a.length) {
		arr[k]=a[left];
		left++;
		k++;
	}
	while(right<b.length) {
		arr[k]=b[right];
		right++;
		k++;
	}
	System.out.println(Arrays.toString(arr));
	 
}
}
