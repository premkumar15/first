 package org.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maven {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\spark\\Documents\\prem java\\selenium\\dri\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		File file=new File("C:\\Users\\spark\\Documents\\prem java\\poi-ooxml\\target\\Book1.xlsx");
		FileInputStream fileinput = new FileInputStream(file);
		Workbook work=new XSSFWorkbook(fileinput);
		
		 Sheet Sh = work.createSheet("zmazon iphone name list");
		driver.get("http://amazon.in/");
		WebElement txtsearch = driver.findElement(By.id("twotabsearchtextbox"));
		txtsearch.sendKeys("iphone",Keys.ENTER);
		List<WebElement> allproductname = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		for(int i=0;i<allproductname.size();i++) {
			WebElement productname = allproductname.get(i);
      Row createRow = Sh.createRow(i);
      Cell createCell = createRow.createCell(0);
      String text = productname.getText();

    createCell.setCellValue(text);}
	FileOutputStream stream2 = new FileOutputStream(file);
	work.write(stream2);
	System.out.println("Amazon added successfully");
	driver.quit();
	
	
			
		}
		
	
		
	
	}


