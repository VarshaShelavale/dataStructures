package ArraysEasy;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {
	public static void main(String[] args) {
		int a []= {1,2,2,3,4,5,5,5,7,8};
		int l =a.length;
//		for (int i = 0; i < l-1; i++) {
//			for (int j = i+1; j < l; j++) {
//				if(a[i]==a[j]) {
//					for (int k = j; k < l-1; k++) {
//						a[k]=a[k`+++1];
//					}
//					j--;
//					l--;
//				}
//			}
//		}
		int i =0;
		for (int j = 1; j < a.length; j++) {
			if(a[i]!=a[j]) {
				i++;
				a[i]=a[j];
				
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
