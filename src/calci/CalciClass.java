package calci;

import junit.framework.Assert;

public class CalciClass {

	
	static int addRes = 0;
	static int addSub = 0;
	static int addMul = 0;
	static int addDiv = 0;
	
	public static void main(String[] args) {
		

		calciUtil calculate =  new calciUtil();
		
		
		
		addRes = calculate.add(5, 5);
		addSub = calculate.subtract(5, 5);
		addMul = calculate.multiply(5, 5);
		addDiv = calculate.devide(5, 5);
		
		
		System.out.println(addRes);
		
		Assert.assertEquals(10, addRes);
		
		
	}

}
