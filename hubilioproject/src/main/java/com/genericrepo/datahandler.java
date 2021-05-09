package com.genericrepo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class datahandler
{
	public String getdatafromnotepad(String key) throws Exception
	{
		FileInputStream fis = new FileInputStream(constants.path);
		Properties p = new Properties();
		p.load(fis);
		return p.getProperty(key);
	}
	
}
