package ques6;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArrayquesTest {
	@Test
	public void check() {
		Arrayques a = new Arrayques();
		int i = a.array();
		assertEquals(1,i);
	}

}
