package ArrayMedium;

public class StockBuyAndSell {
	public static void main(String[] args) {
		int []a= {7,1,5,3,6,4};
//		int sum=0;
//		for (int i = 0; i < a.length-1; i++) {
//			for (int j = i; j < a.length; j++) {
//				if((a[j]-a[i])>sum)
//						sum=a[j]-a[i];
//				
//			} 
//		}
//		System.out.println(sum);
		int min=Integer.MAX_VALUE;
		int max =0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]<min)
				min=a[i];
			
			else if(a[i]-min>max)
				max=a[i]-min;
		}
		System.out.println(max);
	}
}
