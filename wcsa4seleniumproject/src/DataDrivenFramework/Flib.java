package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
//use to store only the generic reusable method
	public String readExcelData(String excelpath,String sheetName,int rowcount,int cellcount) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		 Sheet sheet = wb.getSheet(sheetName);
		 Row row = sheet.getRow(rowcount);
		  Cell cell = row.getCell(cellcount);
		  String data = cell.getStringCellValue();
		  return data;
	}
		  
		  //to get lastRowcount
		  public int rowCount(String excelpath,String sheetName,int rowcount,int cellcount) throws EncryptedDocumentException, IOException {
			 FileInputStream fis = new FileInputStream(excelpath);
			 Workbook wb = WorkbookFactory.create(fis);
			 Sheet sheet = wb.getSheet(sheetName);
			  int rc = sheet.getLastRowNum();
			  return rc;
			  
		  }
		  
		  //to get write excel data
		  public void writeExcelData(String excelpath,String sheetName,int rowcount,int cellcount,String cellvalue) throws EncryptedDocumentException, IOException {
			  FileInputStream fis = new FileInputStream(excelpath);
			  Workbook wb = WorkbookFactory.create(fis);
			    Sheet sheet = wb.getSheet(sheetName);
			    Row row = sheet.getRow(rowcount);
			      Cell cell = row.createCell(cellcount);
			      FileOutputStream fos = new FileOutputStream(excelpath);
			      wb.write(fos);
		
		}

		
			
		}
		


		

	
		

		
	

		
		

	
		
		  
	

	



