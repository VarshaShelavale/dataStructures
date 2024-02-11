package ArrayMedium;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NextLexographicalOrder {
	public static void main(String[] args) {
		int[] a = {3,1,2};
		List<Integer> A = Arrays.asList(new Integer[] {3,1,2});
		permut(A);
		for (Integer object : A) {
			System.out.print(object);
		}
	}
	public static List permut(List<Integer> li) {
		int l = li.size();
		int ind=-1;
		for (int i = l-2 ; i >= 0; i--) {
			if(li.get(i)<li.get(i+1)) {
				ind=i;
				break;
			}
		}
		if(ind==-1) {
			Collections.reverse(li);
			return li;
		}
		
		for (int i = l-1; i > ind ; i--) {
			if(li.get(i)>li.get(ind)) {
				int temp=li.get(i);
				li.set(i, li.get(ind));
				li.set(ind, temp);
				break;
			}
		}
		List sublist = li.subList(ind+1, l);
		Collections.reverse(sublist);
		return li;
		
	}
}