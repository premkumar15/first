package org.maven1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Singledata {
	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\spark\\Documents\\prem java\\poi-ooxml\\target\\Book1.xlsx");
		FileInputStream input=new FileInputStream(file);
		Workbook book=new XSSFWorkbook(input);
		Sheet sheet = book.getSheet("Sheet2");
		Row row = sheet.getRow(4);
		Cell cell = row.getCell(0);
		String string = cell.getStringCellValue();
		System.out.println(string);
	}

}

