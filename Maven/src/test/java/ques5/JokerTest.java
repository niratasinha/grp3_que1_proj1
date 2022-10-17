package ques5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JokerTest {

	@Test
	
	public void findout() {
		Joker j = new Joker("Joker1","Odissi");
		assertEquals("Joker1",j.JName);
		assertEquals("Odissi",j.Dance);
		
		
		
		
	}
}
