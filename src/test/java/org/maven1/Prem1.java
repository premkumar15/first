package org.maven1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Prem1 {

public static void main(String[] args) throws IOException {
	File file = new File("C:\\Users\\spark\\Documents\\prem java\\poi-ooxml\\target\\Book1.xlsx");
	FileInputStream inputStream = new FileInputStream(file);
	Workbook workbook = new XSSFWorkbook(inputStream);
	Sheet sheet = workbook.getSheet("Sheet2");
	
	for(int i=0;i<sheet.getPhysicalNumberOfRows();i++) {
		
		Row row = sheet.getRow(i);
		
	
		for(int j=0;j<row.getPhysicalNumberOfCells();j++) {
	
	Cell cell = row.getCell(j);
	System.out.println(cell);
	
		}
		
		
			
	}	
	
	int columnWidth = sheet.getColumnWidth(0);
	System.out.println(columnWidth);
	int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
	System.out.println(rowCount);
	int defaultColumnWidth = sheet.getDefaultColumnWidth();
	System.out.println(defaultColumnWidth);

	
	
}
	

}

