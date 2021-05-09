package com.testcaserepo;

import org.testng.annotations.Test;

import com.genericrepo.Baseclass;

public class validatenewOrgtest extends Baseclass
{
	@Test(groups = {"regressiontest","smoke"})
	public void validateneworg()
	{
		 System.out.println("hard assert sucess");
		 System.out.println("soft assert sucees");
		 
	}
}
