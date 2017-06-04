package pl.lhsystems.successFactors.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class MyExcelReader 
{
	private String fileName;
	private String sheetName;
	
	public MyExcelReader(String fileName, String sheetName){
		this.fileName = StringUtils.replace("src/test/resources/" + fileName + ".xlsx",sheetName + ".", "");
		this.sheetName = sheetName;
	}
	
	//TODO: zmienne do tej metody
	public Map<String, String> fillSubstitutionsMap(){ //String filename, String sheetname, String language){
		Map<String, String> substitutions = null;
		
		String fieldColumnHeaderName = System.getProperty("fieldColName");
		
		String language = System.getProperty("language");
		
	      try{
	          FileInputStream file = new FileInputStream(new File(fileName));
	          XSSFWorkbook workbook = new XSSFWorkbook(file);
	          XSSFSheet sheet = workbook.getSheet(sheetName);
	          
	          int colsNr = sheet.getRow(0).getLastCellNum();
	          int rowsNr = sheet.getPhysicalNumberOfRows();
	          
	          XSSFRow headerRow = sheet.getRow(0);
	          	          
	          substitutions = new HashMap<String, String>(); 
	          
	          List<String> headerNames = new ArrayList<String>();
	          
	          for (int i = 0; i < colsNr; i++){
	        	  headerNames.add(headerRow.getCell(i).getStringCellValue()); //fieldNAme, eng, ger, ameri
	          }
	          
	          for (int i = 1; i < rowsNr; i++) {
	        	  substitutions.put(sheet.getRow(i).getCell(headerNames.indexOf("FieldName")).getStringCellValue(), sheet.getRow(i).getCell(headerNames.indexOf("English")).getStringCellValue());
	          }
	          
	          file.close();
	      } 
	      catch (Exception e) 
	      {
	          e.printStackTrace();
	      }
		return substitutions;
	}	
}