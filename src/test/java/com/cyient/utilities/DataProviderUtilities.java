package com.cyient.utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;


public class DataProviderUtilities {
	

	@DataProvider
	public Object[][] validCredentialExcel( ) throws IOException
	{
		
		Object[][] main = ExcelUtils.getSheetIntoObjectArray("src/test/resources/Signora.xlsx","ValidCredTest" );
		return main;
	}
   
	@DataProvider
	public Object[][] validPasswordExcel() throws IOException
	{
		Object[][] main = ExcelUtils.getSheetIntoObjectArray("src/test/resources/Signora.xlsx","ValidTest1");
		return main;
	}
	}