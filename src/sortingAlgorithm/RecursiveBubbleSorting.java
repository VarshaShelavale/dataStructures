package sortingAlgorithm;

import java.util.Arrays;

public class RecursiveBubbleSorting {
	public static void bubble(int[]a,int index) {
		if(index==1)return;
		for (int i = 0; i < a.length-1; i++) {
			if(a[i]>a[i+1]) {
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
		}
		bubble(a,index-1);
	}
	public static void main(String[] args) {
		int a []= {1,2,5,8,2,3,9,6};
		bubble(a,a.length-1);
		System.out.println(Arrays.toString(a));
	}
}
