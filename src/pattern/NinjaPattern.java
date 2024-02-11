package pattern;

import java.util.Iterator;

public class NinjaPattern {
	public static void main(String[] args) 
	{ int r =1;
	  int c = 7;
	  int n = 4;
		for (int i = 1; i <=7; i++) {
			for (int j = 1; j <= 7; j++) {
				if(i==r ||j==r || i==c || j==c) {
					System.out.print(n);
				}
				
			}
			
			n--;
			System.out.println();
		}
	}
}
