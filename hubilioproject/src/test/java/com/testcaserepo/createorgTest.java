package com.testcaserepo;



import org.testng.annotations.Test;

import com.genericrepo.Baseclass;

public class createorgTest extends Baseclass
{

	@Test(groups = {"regressiontest","integration","smoke"})
	public void createorgnization()
	{
		System.out.println("org created");
		System.out.println("ORG SUCEESS");
		System.out.println("hpie to org");
	}

}
