package Test;

import mymath.MyMath;
import static org.junit.Assert.*;

import org.junit.Test;

import mymath.MyMath;

public class MyMathTest {

	@Test
	public void test() {
		MyMath test = new MyMath();
		
		assertEquals(50,test.multi(5,10));
	}

}
