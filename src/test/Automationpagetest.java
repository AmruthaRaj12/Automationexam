package test;

import org.testng.annotations.Test;

import pages.Automationpage;

public class Automationpagetest extends Baseclass{
	@Test
	public void testlogin()
	{
		Automationpage ob=new Automationpage(driver);
		ob.resources();
		ob.tech();
		ob.shopify();
		ob.createalead();
		ob.techno();
		ob.field();
		ob.setvalues("shoppy");
		
		
}
}

