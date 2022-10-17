package Practice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import practice.S1;


public class StudentTest {
	
@Test

public void evaluatesExpresssion() {
	S1 st1=new S1();
	int id1 = st1.roll();
	String id2 =st1.name();
	int id3 = st1.std();
	String id4 = st1.section();
	String id5 = st1.ClassTeacher();
	String id6 = st1.address();
	int id7 = st1.contactno();
	String id8 = st1.adm_date();
	
		assertEquals(1,id1);
	assertEquals("Abhi",id2);
	assertEquals(1,id3);
	assertEquals("A",id4);
	assertEquals("Nirata",id5);
	assertEquals("A-1,Hyd",id6);
	assertEquals(123,id7);
	assertEquals("1-Jan-20",id8);
	
	
	
}
}
