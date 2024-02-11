package sortingAlgorithm;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int []a= {4,5,6,2,7,1,3,9};
		quickSort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}
	public static void quickSort(int a [], int low,int high ) {
		if(low<high) {
			int pivot= quick(a,low,high);
			quickSort(a,low,pivot-1);
			quickSort(a,pivot+1,high);
		}
	}
	public static int quick(int a[],int low,int high) {
		int i = low;
		int j = high;
		int pivot= low;
		while(i<j) {
			while(a[i]<=a[pivot]&& i<=high) {
				i++;
			}
			while(a[j]>a[pivot]&& j>=low) {
				j--;
			}
			if(i<j){
				int temp = a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		int temp= a[pivot];
		a[pivot]=a[j];
		a[j]=temp;
		return j;
	}
	
}
