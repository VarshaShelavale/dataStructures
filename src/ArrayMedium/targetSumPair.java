package ArrayMedium;

public class targetSumPair {
	public static void main(String[] args) {
		int []a= {2,6,5,8,11,9};
		int target=14;
		boolean b=false;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if((a[i]+a[j])==target) {
					b=true;
					System.out.println("Yes");
					System.out.println(i+" "+j);
					
				}
			}
		}
		if(b==false) {
			System.out.println("No");
		}
	}
}
