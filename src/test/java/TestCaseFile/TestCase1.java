package TestCaseFile;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObjectFile.LoginWebElement;
import PageObjectFile.LogoutWebElement;
import UtilitiesFIle.ReadDataFromExcel;

public class TestCase1 extends BaseClass {
	@Test(dataProvider = "Datapro")
	public void loginPage(String usernam, String userpass)
	{	
		driver.get(url);
		log1.info("url open");
		LoginWebElement l1=new LoginWebElement(driver);
		l1.user_name(usernam);
		log1.info("Enter the username");
		l1.user_pass(userpass);
		log1.info("Enter the password");
		l1.user_sub();
		log1.info("Click submit button");
	}
	@DataProvider(name="Datapro")
	public String[][] searchData() throws Exception
	{   String File_Name="C:\\Users\\user\\Desktop\\new.xlsx";
	int Rows=ReadDataFromExcel.getRowCount(File_Name,"Sheet1" );
	int cells=ReadDataFromExcel.getColCount(File_Name,"Sheet1");
	String s1[][]=new String[Rows-1][cells];
	for(int i=1;i<Rows;i++)
	{
		for(int j=0;j<cells;j++)
		{
			s1[i-1][j]=ReadDataFromExcel.getCellvalue(File_Name, "Sheet1", i,j);
		}
	}
	return s1;
	
	}
	public void log_out()
	{
		LogoutWebElement l=new LogoutWebElement(driver);
		l.user_log();
	}

}
