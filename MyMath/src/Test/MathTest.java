package Test;

import mymath.MyMath;
import static org.junit.Assert.*;

import org.junit.Test;



public class MathTest {

	@Test
	public void testMulti() {
		MyMath test = new MyMath();
			
			assertEquals(30, test.multi(5,5));
	}

}
