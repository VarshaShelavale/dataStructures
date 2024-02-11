package ArrayMedium;

public class LongestConsecutiveNumbers {
	public static void main(String[] args) {
		int a[]= {100,200,1,2,3,4};
		int cnt = 0;
		
		for (int i = 0; i < a.length; i++) {
			int temp = a[i];
			int count = 1;
			for (int j = 0; j < a.length; j++) {
				if(search(a,temp+1)) {
					temp+=1;
					count++;
				}
			}
			if(count>cnt) {
				cnt=count;
			}
			
		}
		System.out.println(cnt); 
		
	}
	public static boolean search(int []a,int v) {
		for (int i = 0; i < a.length; i++) {
			if(a[i]==v) {
				return true;
			}
		}
		
		return false;
	}
}
