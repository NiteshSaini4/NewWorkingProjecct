package UtilitiesFIle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class ReadDataFromExcel {
	public static XSSFWorkbook  WB;
	public static XSSFSheet WS;
	public static XSSFRow Rw;
	public static XSSFCell Cl;
	public static FileInputStream fn;
	public static String getCellvalue(String filename,String sheetname,int row ,int cell) throws Exception 
	{
		
		fn=new FileInputStream(filename);		
		WB=new XSSFWorkbook(fn);
		WS=WB.getSheet(sheetname);
		Cl=WB.getSheet(sheetname).getRow(row).getCell(cell);
		WB.close();
		return Cl.getStringCellValue();

	}
	public static int getRowCount(String filename ,String sheetname) throws Exception
	{
			fn=new FileInputStream(filename);
			WB=new XSSFWorkbook(fn);
			WS=WB.getSheet(sheetname);
			int totalRow=WS.getLastRowNum()+1;
			WB.close();
			return totalRow;
	}
	public static int getColCount(String filename ,String sheetname) throws Exception
	{
		fn=new FileInputStream(filename);
		WB=new XSSFWorkbook(fn);
		WS=WB.getSheet(sheetname);
		int totalCol=WS.getRow(0).getLastCellNum();
		WB.close();
		return totalCol;
	}


}
