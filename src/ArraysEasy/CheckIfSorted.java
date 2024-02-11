package ArraysEasy;

public class CheckIfSorted {
	public static void main(String[] args) {
		int a []= {5,1,2,3,4,5,8};
		boolean flag = false;
		for (int i = 0; i < a.length-1; i++) {
			if(a[i]>a[i+1]) {
				flag= true;
				System.out.println("not sorted");
				break;
			}
		}
		if(!flag) {
			System.out.println("sorted");
		}
	}
}
