package collections;

import java.util.HashSet;

public class Sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set = new HashSet();
		String a = "Test";
		String b = "Test2";
		System.out.println(set.add(a));
		set.add(b);
		System.out.println(set.add(a));
		//set.add(b);
		//System.out.println(set.add(a));
		
		System.out.println(set);
	}

}
