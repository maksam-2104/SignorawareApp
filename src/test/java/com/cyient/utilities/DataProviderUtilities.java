package com.cyient.utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.cyient.utility.ExcelUtils;

public class DataProviderUtilities {
	

	@DataProvider
	public Object[][] validCredentialExcel( ) throws IOException
	{
		
		Object[][] main = ExcelUtils.getSheetIntoObjectArray("src/test/resources/testdata/Signora.xlsx\",\"ValidCredentialTest" );
		return main;
	}
   
	@DataProvider
	public Object[][] validPasswordExcel() throws IOException
	{
		Object[][] main = ExcelUtils.getSheetIntoObjectArray("src/test/resources/testdata/Signora.xlsx\",\"ValidCredentialTest");
		return main;
	}