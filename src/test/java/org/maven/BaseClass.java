package org.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static  WebDriver driver;

	public static void driver() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	public static void url(String url) {
		driver.get(url);

	}

	public static void enterText(WebElement element, String text) {
		element.sendKeys(text);
	}

	public String attribute(WebElement att, String value) {
		String attribute = att.getAttribute(value);
		return attribute;
	}

	public static void click(WebElement element) {

		element.click();
	}

	public static void ddselectByVisibleText(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByVisibleText(value);
	}

	public static void ddselectByIndex(WebElement element, int string) {
		Select s = new Select(element);
		s.selectByIndex(string);
	}

	public static void ddselectByValue(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);

	}

	public static void clear(WebElement element) {
		element.clear();

	}

	public static void send(WebElement element, String date) {
		element.sendKeys(date);

	}

	public static void maxim() {
		driver.manage().window().maximize();
	}

	public String file(int row, int cell) throws IOException {
		File file = new File("C:\\Users\\spark\\Documents\\prem java\\poi-ooxml\\target\\Book1.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook work = new XSSFWorkbook(stream);
		Sheet sheet = work.getSheet("adactin");
		Row row1 = sheet.getRow(row);
		Cell cell1 = row1.getCell(cell);
		int cellType = cell1.getCellType();
		String data = "";
		if (cellType == 1) {
			data = cell1.getStringCellValue();
		}

		else {
			double ncv = cell1.getNumericCellValue();
			long l = (long) ncv;
			data = String.valueOf(l);

		}
		return data;

	}

	public  void booking(int row, int cell, String c) throws IOException {
		File file = new File("C:\\Users\\spark\\Documents\\prem java\\poi-ooxml\\target\\Book1.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook work = new XSSFWorkbook(stream);
		Sheet sheet = work.getSheet("adactin");
		Row row1 = sheet.getRow(row);
		Cell cell1 = row1.createCell(cell);
		cell1.setCellValue(c);
		FileOutputStream outputStream = new FileOutputStream(file);
		work.write(outputStream);

	}

}
