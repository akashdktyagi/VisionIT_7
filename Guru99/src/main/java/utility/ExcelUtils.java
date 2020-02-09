package utility;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	
	public static void  SetExcelFile(String Filepath,String Sheetname)
	{
		try {
			//open excel file
			FileInputStream excelfile= new FileInputStream(Filepath);
			wb=new XSSFWorkbook(excelfile);
			
			//access required test data sheet
			sheet=wb.getSheet(Sheetname);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	// Read test data from excel sheet
	
	public static String getCellData(int rowNo,int colno)
	{
		try {
			
			cell=sheet.getRow(rowNo).getCell(colno);
			String celldata=cell.getStringCellValue();
			return celldata;
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "";
	}
    
	
	
	
	
}
