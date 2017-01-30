package Test;

import mymath.MyMath;
import static org.junit.Assert.*;

import org.junit.Test;



public class MathTest {

	@Test
	public void testMulti() {
		MyMath test = new MyMath();
			int output = test.multi(5, 6);
			assertEquals(30, output);
	}

}
