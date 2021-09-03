package org.maven1;

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

import io.github.bonigarcia.wdm.WebDriverManager;

public class Samsung {

	public static void main(String[] args) throws IOException, InterruptedException {
  WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		File file = new File("C:\\Users\\spark\\Documents\\prem java\\poi-ooxml\\target\\Book1.xlsx");
			FileInputStream inputStream = new FileInputStream(file);
			Workbook workbook = new XSSFWorkbook(inputStream);
			Sheet crtRefr = workbook.createSheet("vamsunggalaxy");
			driver.get("https://www.amazon.in/");
			Thread.sleep(3000);
			WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
			search.sendKeys("samsunggalaxy",Keys.ENTER);
			
			Thread.sleep(4000);
       List<WebElement> samsunggalaxy = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
               for(int i=0;i<samsunggalaxy.size();i++) {
				WebElement element = samsunggalaxy.get(i);
				Row createRow = crtRefr.createRow(i);
				Cell createCell = createRow.createCell(0);
				
				String text = element.getText();
				createCell.setCellValue(text);
				
			}
			
			
	FileOutputStream stream = new FileOutputStream(file);	
	workbook.write(stream);
	System.out.println("added $$$$");
			
		
		
	}
	}

