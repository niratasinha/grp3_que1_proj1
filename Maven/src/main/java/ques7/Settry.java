package ques7;

	
	import java.util.HashSet;
import java.util.Set;
	
	public class Settry {
		public int show2()
		{
		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(6);
		set.add(7);
		set.add(8);
		set.add(9);
		set.add(10);
		set.add(10);
		set.add(10);
		set.add(10);
		set.add(10);
		set.add(10);
		set.add(10);
		set.add(10);
		set.add(10);
		set.add(10);
		set.add(10);
		System.out.println(set);
		int last = 0;
		for(int x : set)
		{
			last = x;
		}
		System.out.println("Last Element is:"+ last);
		return last;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Settry s1 = new Settry();
			s1.show2();
		}
	}


