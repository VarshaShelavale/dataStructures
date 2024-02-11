package Hashing;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FrequencyElement {
public static void main(String[] args) {
	int a []= {2,3,2,3,5,4,2,3,3,3,3,3,3,3};
	Map <Integer,Integer>m = new HashMap();
	for (int i = 0; i < a.length; i++) {
		if(m.containsKey(a[i])) {
			m.put(a[i], m.get(a[i])+1);
		}
		else {
			m.put(a[i], 1);
		}
	}
	int max = Integer.MIN_VALUE;
	Set s = (Set) m.keySet();
	Iterator itr = s.iterator();
	while(itr.hasNext()) {
		
		if(m.get((Integer)itr.next())>max) {
			max=(Integer)itr.next();
		}
	}
	System.out.println(max);
	System.out.println(m);
}
}
