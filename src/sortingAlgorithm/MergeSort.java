package sortingAlgorithm;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int a []= {1,2,5,8,2,3,9,6};
		mergeSort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}
	public static void mergeSort(int arr[],int low , int high ) {
		if(low>=high) {
			return;
		}
		int mid = (low+high)/2;
		mergeSort(arr,low,mid);
		mergeSort(arr,mid+1,high);
		merge(arr,low,mid,high);
	}
	public static void merge(int arr[],int low,int mid,int high) {
		int left = low;
		int right = mid+1;
		
		int a[]= arr.clone();
		int k =0;
		while(mid >= left && high>= right) {
			if(arr[left]>= arr[right]) {
				a[k]=arr[right];
				right++;
				k++;
			}
			else{
				a[k]=arr[left];
				left++;
				k++;
			}
//			System.out.println(".....");
		}
//		System.out.println(".......===");
		while(left<=mid) {
			a[k]=arr[left];
			left++;
			k++;
		}
		while(right<=high) {
			a[k]=arr[right];
			right++;
			k++;
		}
		for (int i = low; i <= high; i++) {
			arr[i]=a[i-low];
		}
	}
	
}
