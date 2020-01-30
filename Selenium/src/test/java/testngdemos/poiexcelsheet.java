package testngdemos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
import org.apache.poi.xssf.usermodel.XSSFSheet;
public class poiexcelsheet {
	@Test
	public static void main(String[] args) throws IOException
	{
		File src= new File("C:\\Users\\Training_b6b.01.07\\Desktop\\Login.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		
		int rowCount=sheet1.getLastRowNum();
		System.out.println("Total no of row is:"+rowCount);
		
		for(int i=1;i<=rowCount;i++)
		{
			String firstname=sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println("First name is:"+firstname);
			
			String lastname=sheet1.getRow(i).getCell(1).getStringCellValue();
			System.out.println("First name is:"+lastname);
			
			String password=sheet1.getRow(i).getCell(2).getStringCellValue();
			System.out.println("First name is:"+password);
			
			String cnfpwd=sheet1.getRow(i).getCell(3).getStringCellValue();
			System.out.println("First name is:"+cnfpwd);
			
			
		}
		wb.close();
			
		
	}

}
