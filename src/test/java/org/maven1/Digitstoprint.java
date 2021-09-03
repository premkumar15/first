package org.maven1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Digitstoprint {
	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\spark\\Documents\\prem java\\poi-ooxml\\target\\Book1.xlsx");
		FileInputStream input=new FileInputStream(file);
		Workbook book=new XSSFWorkbook(input);
		Sheet sheet = book.getSheet("Sheet2");
		for(int i=0;i<sheet.getPhysicalNumberOfRows();i++) {
			Row row = sheet.getRow(i);
			for(int j=0;j<row.getPhysicalNumberOfCells();j++) {
				Cell cell = row.getCell(j);
				int type = cell.getCellType();
				if(type==1) {
					String ss= cell.getStringCellValue();
					System.out.println(ss);
				}
				else if(DateUtil.isCellDateFormatted(cell)){
					Date dd = cell.getDateCellValue();
					SimpleDateFormat df=new SimpleDateFormat("MMM-dd-YYYY");
					String format = df.format(dd);
					System.out.println(format);
					
				}
				else{
					double nnv = cell.getNumericCellValue();
					System.out.println(nnv);
					String v = String.valueOf(nnv);
					System.out.print(v);
				}
			}}
		
		}

		
	}
		
	

