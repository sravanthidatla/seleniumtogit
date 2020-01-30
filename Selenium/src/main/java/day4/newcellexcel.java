package day4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class newcellexcel {
	
	public static void main(String[] args) throws IOException
	{
		
		String chromePath=("C:\\Users\\Training_b6b.01.07\\Desktop\\Selenium\\jars\\ChromeDriver.exe");
		System.setProperty("webdriver.chrome.driver",chromePath);
		WebDriver driver=new ChromeDriver();
		driver.get("http://newTours.demoaut.com/");
		
		
		File src= new File("C:\\Users\\Training_b6b.01.07\\Desktop\\Login.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		
		driver.findElement(By.linkText("Home")).click();
		
		String expectedTitle="Welcome: Mercury Tours123";
		String ActualTitle=driver.getTitle();
		
		int rowCount=sheet1.getLastRowNum();
		System.out.println("Total no of row is:"+rowCount);
		for(int i=1;i<=rowCount;i++)
		{
		
		if(expectedTitle.equals(ActualTitle))
		{
			System.out.println("same");
			sheet1.getRow(0).createCell(3).setCellValue("Results");
			sheet1.getRow(i).createCell(3).setCellValue("Pass:Home Page");
			
		}
		else
		{
			System.out.println("not in home");
			sheet1.getRow(i).createCell(3).setCellValue("Fail: not in Home Page");
		}
		
		FileOutputStream fout = new FileOutputStream("C:\\Users\\Training_b6b.01.07\\Desktop\\Login.xlsx");
		wb.write(fout);
		}
	
	wb.close();
	driver.close();

	}
	}
