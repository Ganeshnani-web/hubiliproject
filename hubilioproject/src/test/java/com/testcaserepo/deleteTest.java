package com.testcaserepo;

import org.testng.annotations.Test;

import com.genericrepo.Baseclass;

public class deleteTest extends Baseclass
{
	@Test(groups = {"regressiontest","integration"})
	public void delteorg()
	{
		System.out.println("delete org");
	}
}
