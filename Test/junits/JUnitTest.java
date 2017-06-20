package junits;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import calci.calciUtil;


public class JUnitTest {

	
	//calciUtil calsi = new calciUtil();
	//calciUtil calsi = null;
	
	calciUtil calci = null;
	
	
	@Before
	public void setUp(){
		calci = new calciUtil();
	}
	
	
	@Test
	public void addTest(){
		
		
		Assert.assertEquals(10, calci.add(5, 5));
	}
	
	@Test
	public void subtractTest(){
		
		
		Assert.assertEquals(0, calci.subtract(5, 5));
	}
	
	
	@Test
	public void multiplyTest(){
		
		
		Assert.assertEquals(25, calci.multiply(5, 5));
	}
	
	@Test
	public void devideTest(){
		
		
		Assert.assertEquals(1, calci.devide(5, 5));
	}
	
	
	
}
