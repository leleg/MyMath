package test;

import static org.junit.Assert.*;

import org.junit.Test;

import math.MyMath;

public class MyMathTest {

	@Test
	public void test() {
		MyMath mtest = new MyMath();
		assertEquals(30, mtest.multi(6,5));
	}

}
