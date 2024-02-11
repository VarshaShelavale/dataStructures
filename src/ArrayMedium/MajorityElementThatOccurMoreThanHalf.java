package ArrayMedium;

public class MajorityElementThatOccurMoreThanHalf {
	public static void main(String[] args) {
		int a[]= {1,1,2,2,1,1,0,2,2,2,2,2};
		int n =a.length/2;
//		for (int i = 0; i < a.length; i++) {
//			int count=1;
//			for (int j = i+1; j < a.length; j++) {
//				if(a[i]==a[j]) {
//					count++;
//				}
//			}
//			if(count>n) {
//				System.out.println(a[i]);
//				break;
//			}
//		}
		int e1=0;
		int count=0;
		for (int i = 0; i < a.length; i++) {
			if(count==0) {
				count++;
				e1=a[i];
			}else if(a[i]==e1) {
				count++;
			}
			else {
				count--;
			}
		}
		int cnt=0;
		for (int i = 0; i < a.length; i++) {
			if(e1==a[i]) {
				cnt++;
			}
		}
		if(cnt>=n) {
			System.out.println(e1);
		}
		else {
			System.out.println(-1);
		}
	}
}
