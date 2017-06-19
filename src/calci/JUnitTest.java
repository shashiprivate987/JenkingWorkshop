package calci;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class JUnitTest {

	
	//calciUtil calsi = new calciUtil();
	calciUtil calsi = null;
	
	
	@Before
	public void setUp(){
		calsi = new calciUtil();
	}
	
	
	@Test
	public void addTest(){
		
		
		Assert.assertEquals(10, calsi.add(5, 5));
	}
	
	@Test
	public void subtractTest(){
		
		
		Assert.assertEquals(0, calsi.subtract(5, 5));
	}
	
	
	@Test
	public void multiplyTest(){
		
		
		Assert.assertEquals(25, calsi.multiply(5, 5));
	}
	
	@Test
	public void devideTest(){
		
		
		Assert.assertEquals(1, calsi.devide(5, 5));
	}
	
}
