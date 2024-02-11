package ArrayMedium;

import java.util.Arrays;

public class SetMatrixZero {
	public static void main(String[] args) {
		int[][]a= {{1,1,1},{1,0,1},{1,1,1}};
		int m []=new int[3];
		int n []= new int [3];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(a[i][j]==0) {
					m[i]=1;
					n[j]=1;
					
				}
			}
		}
		setZero(a,m,n);
		System.out.println(Arrays.deepToString(a));
	}
	public static void setZero(int[][]a,int r[],int c[]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(r[i]==1 || c[j]==1) {
					a[i][j]=0;
				}
			}
		}
	}
}
