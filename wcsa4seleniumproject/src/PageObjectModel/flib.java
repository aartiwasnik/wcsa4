package PageObjectModel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class flib {
	public String readPropertyData(String excelpath, String sheetName,int rowcount,int cellcount) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowcount);
		Cell cell = row.getCell(0);
		String data = cell.getStringCellValue();
		return data;
		
	}
	// to get last rowcount
	public int rowCount(String excelpath,String sheetName) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		int rc = sheet.getLastRowNum();
		return rc;
	}
	//write excel data
	public void writeExcelData(String excelpath,String sheetName,int rowcount,int cellcount,String data) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		 Row row = sheet.getRow(rowcount);
		 //-------------------------------------------------------------------------------------------------
		 Cell cell = row.createCell(cellcount);
		 cell.setCellValue(data);
		 
  FileOutputStream fos = new FileOutputStream(excelpath);
  wb.write(fos);
	}
	
//read the data from property file
	public String readPropertyData(String excelpath,String keyValue) throws IOException {
		FileInputStream fis = new FileInputStream(excelpath);
		Properties prop = new Properties();
		prop.load(fis);
		  String data = prop.getProperty(keyValue);
		  return data;
	}
}
