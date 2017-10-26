import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ImplementationTest {
	private Implementation obj;

	@Before
	public void setUp() throws Exception {
		obj=new Implementation();
	}

	@After
	public void tearDown() throws Exception {
		obj=null;
	}

	@Test
	public void testadd() {
		long ans=5 + (-3) + 21 + (-18);
		assertEquals(ans,obj.add(5,-3,21,-18));
		
		ans = 15 + (-49);
		assertEquals(ans,obj.add(15,-49));
	}
	@Test
	public void testSubtract() {
		long ans =327 -498 -(-47)-32;
		assertEquals(ans,obj.subtract(327,498,-47,32));
		
		ans = 15 - (-49);
		assertEquals(ans,obj.subtract(15,-49));
	}

}
