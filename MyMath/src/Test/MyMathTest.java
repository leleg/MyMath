package Test;
import mymath.MyMath;
import static org.junit.Assert.*;

import org.junit.Test;



public class MyMathTest {

	@Test
	public void testMulti() {
		MyMath test = new MyMath();
			int output = test.multi(5, 4);
			assertEquals(output, 20);
	}

}
