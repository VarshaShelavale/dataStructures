package ArraysEasy;

public class LongestSubArray {
	public static void main(String[] args) {
		int []a = {1,2,3,1,1,1,4,2,3};
		int len=0;
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i; j < a.length; j++) {
				int sum =0;
				for (int k = i; k <= 
						j; k++) {
					sum +=a[k];
				}
				if(sum==3) {
					len= Integer.max(len,j-i+1);
				}
			}
		}
		System.out.println(len);
	} 
}
