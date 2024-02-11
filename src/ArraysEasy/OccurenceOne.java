package ArraysEasy;

public class OccurenceOne {
	public static void main(String[] args) {
		int []a = {1,1,2,3,4,1,6,7};
		for (int i = 0; i < a.length; i++) {
			int count =1;
			for (int j = 0; j < a.length; j++) {
				if(a[i]==a[j] && i!=j) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(a[i]);
			}
		}
	}
}
