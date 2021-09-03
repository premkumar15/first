package org.maven1;

import java.io.File;
import java.io.FileInputStream;
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

public class Base {

	protected static WebDriver driver;

	public WebDriver WebdriverManager(String browser) {
		System.setProperty("webdriver.chrome.driver", browser);
		driver = new ChromeDriver();
		return driver;
	}

	public void urlLaunch(String url) {
		driver.get(url);
	}

	public void maximize() {
		driver.manage().window().maximize();
	}

	public String getUrl(String name) {
		driver.getCurrentUrl();
		return name;

	}

	public String getTitle(String name) {
		driver.getTitle();
		return name;
	}

	public void navigateTo(String url) {

		driver.navigate().to(url);
	}

	public void forward() {
		driver.navigate().forward();
	}

	public void back() {
		driver.navigate().back();
	}

	public void refresh() {
		driver.navigate().refresh();
	}

	public void sendKeys(WebElement element, String name) {
		element.sendKeys(name);

	}

	public void click(WebElement element) {
		element.click();

	}

	public String getText(WebElement element) {
		return element.getText();

	}

	public String getAttribute(WebElement element, String name) {
		return element.getAttribute(name);

	}

	public boolean multiple(WebElement element) {
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		return multiple;

	}

	public void dropDownbyIndex(WebElement element, String name) {
		Select s = new Select(element);
		s.selectByValue(name);

	}

	public void visibleText(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);

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

}
