package ArraysEasy;

import java.util.ArrayList;
import java.util.List;


public class FindUnion {
	public static void main(String[] args) {
	      List arr = new ArrayList();
		int a []= {1,2,4,5,6,7};
		int b[]= {3,4,5,5,7,8,9};
		int n1 = a.length; 
		int n2 = b.length;
		int i =0;
		int j=0;
		while(n1>i && n2>j) {
			if(a[i]<=b[j]) {
				if( !arr.contains(a[i])) {
						arr.add(a[i]);
					}
					i++;
				}
			else {
				if(!arr.contains(b[j])) {
					arr.add(b[j]);
				}
				j++;
			}
		}
		while(i<n1) {
			if(!arr.contains(a[i])) {
				arr.add(a[i]);
			}
			i++;
		}
		while(j<n2) {
			if(!arr.contains(b[j])) {
				arr.add(b[j]);
			}
			j++;
		}
		System.out.println(arr);
			
	}
}
