package org.maven;

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

public class DateFormat {

	public static void main(String[] args) throws IOException {
		 File file=new File("C:\\Users\\spark\\Documents\\prem java\\poi-ooxml\\target\\Book1.xlsx");
	     FileInputStream stream=new FileInputStream(file);
	     Workbook work=new XSSFWorkbook(stream);
	     Sheet sh=work.getSheet("adactin");
	     for(int i=1;i<sh.getPhysicalNumberOfRows();i++) {
	    	 Row r = sh.getRow(i);
	    	 for(int j=0;j<r.getPhysicalNumberOfCells();j++) {
	    		 Cell c = r.getCell(j);
	    		 int cellType = c.getCellType();
	    	
	    	 
	    	 if (cellType==1) {
	    		 String stringCellValue = c.getStringCellValue();
	    		 System.out.println(stringCellValue);
	    		 	 }
	    	 if (cellType==0) {
	    		 if(DateUtil.isCellDateFormatted(c)) {
	    			 Date dateCellValue = c.getDateCellValue();
	    			 SimpleDateFormat sd=new SimpleDateFormat("dd-MM-yy");
	    			 String format = sd.format(dateCellValue);
	    			 System.out.println(format);
	    		 }
	    		 else {
	    			 double numericCellValue = c.getNumericCellValue();
	    			 long l=(long)numericCellValue;
	    			 String valueOf = String.valueOf(l);
	    			 System.out.println(valueOf);
	    			 
	    		 }
	    	 }
	    	 
	     }
	     
	   
	}

}
}