package ArraysEasy;

import java.util.Arrays;
import java.util.Iterator;

public class MoveZerosToEnd {
	public static void main(String[] args) {
		int a[]= {0,0,1,0,2,3,0,7,8};
		
		
//		int b []=new int[a.length];
//		int j =0;
//		for (int i = 0; i < a.length; i++) {
//			if(a[i]!=0) {
//				b[j]=a[i];
//				j++;
//			}
//		}
		
		
//		int l = a.length-1;
//		for (int i = 0; i <=l; i++) {
//			if(a[i]==0) {
//				int temp= a[i];
//				a[i]=a[l];
//				a[l]=temp;
//				i--;
//				l--;
//			}
//		}
//		int l =a.length;
//		for (int i = 0; i < l-1; i++) {
//			for (int j = i; j < l-1; j++) {
//				if(a[i]==0) {
//					for (int k = j; k < l-1; k++) {
//						a[k]=a[k+1];
//					}
//					
//					j--;
//					l--;
//				}
//			}
//		}
//		for (int i = l; i < a.length; i++) {
//			a[i]=0;
//		}
		System.out.println(Arrays.toString(a));
	}
	public static void move(int a []) {
		
	}
}
