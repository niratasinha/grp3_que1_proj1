package ques6;

import java.util.ArrayList;

public class Arrayques {
 public int array() {
	 ArrayList<String>list1 = new ArrayList<String>();
	 list1.add("A");
	 list1.add("b");
	 list1.add("c");
	 list1.add("d");
	 ArrayList<String>list2 = new ArrayList<String>(); 
	 list2.add("A");
	 list2.add("x");
	 list2.add("y");
	 list2.add("z");
	 ArrayList<String>list3 = new ArrayList<String>(); 
	 list3.add("i");
	 list3.add("i");
	 list3.add("A");
	 list3.add("k");
	 ArrayList<String>list4 = new ArrayList<String>(); 
	 list3.add("o");
	 list3.add("n");
	 list3.add("m");
	 list3.add("A");
	 ArrayList<String>list5 = new ArrayList<String>(); 
	 list3.add("o");
	 list3.add("A");
	 list3.add("t");
	 
	 list2.retainAll(list2);
	 list2.retainAll(list3);
	 list2.retainAll(list4);
	 list2.retainAll(list5);
	 
	 System.out.println("Common Alphabets"+list1);
	 String a=list1.get(0);
	 int index = list5.indexOf(a);
	 System.out.println("Index is:" +index);
	 return index;
	 
 }


}
