package ArrayMedium;

public class LargestSumSubArray {
	public static void main(String[] args) {
		int a []= {-2,1,-3,4,-1,2,1,-5,4};
//		int maxSum=0;
//		for (int i = 0; i < a.length; i++) {
//			int sum =0;
//			for (int j = i; j < a.length; j++) {
//				if(sum>=maxSum)
//					maxSum=sum;
//				
//				sum+=a[j];
//			} 
//		}
//		System.out.println(maxSum);
		int sum=0;
		int maxSum=Integer.MIN_VALUE;
		int start=0;
		int end=0;
		for (int i = 0; i < a.length; i++) {
			if(sum==0)
				start=i;
			sum +=a[i];
			if(sum>maxSum) {
				maxSum=sum;
				end=i;
			}
			if(sum<0) {
				sum=0;
			}
		}
		System.out.println(maxSum);
		System.out.println(start+" "+end);
	}
}
