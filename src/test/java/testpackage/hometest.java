package testpackage;

import org.testng.annotations.Test;
import basepackage.baseclass;
public class hometest extends baseclass{

	@Test(priority = 1)
	public void admin()
	{
		homeobj.adminnavigate();
	}
}
