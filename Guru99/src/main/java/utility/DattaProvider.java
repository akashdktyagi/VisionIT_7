package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DattaProvider {
  
  public static XSSFWorkbook workbook;
  public  static XSSFSheet sheet ;
  public  static XSSFRow row;
  public  static XSSFCell  cell;
  public  static  FileInputStream fis = null;
  public static String path="C:\\Users\\satyam\\git\\InnoVation\\DataDrivenApproch\\src\\dataprovider\\hashdata.xlsx";
   public static String testdatapath="E:\\QaWork\\Guru99\\src\\main\\java\\data\\Wbook1.xlsx";
  
  
  

	
	@DataProvider(name="logindata")
	public static Object[][] Datasupplier() throws FileNotFoundException
	{
		
		
			
	   fis= new FileInputStream(path);
	   
	   try {
		workbook= new XSSFWorkbook(fis);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	   sheet=workbook.getSheetAt(0);
	  
	   
	   System.out.println("total no of rows: " +sheet.getLastRowNum());
	   
	   int rowcount=sheet.getLastRowNum();
	   
	   int cellcount= sheet.getRow(0).getLastCellNum();
	   
	   System.out.println("totakl no of cell" +cellcount);
	   
	   Object[][] data =new Object[rowcount][1];
		
	 
	   	for(int i=0;i<rowcount;i++)
		{
			Map<Object, Object> hashdatamap= new HashMap<Object,Object>();
			
			for(int j=0;j<cellcount;j++)
			{
			
				hashdatamap.put(sheet.getRow(0).getCell(j).toString(),sheet.getRow(i+1).getCell(j).toString());
				
			//	hashmap	.put(sheet.getRow(0).getCell(j).toString(), sheet.getRow(i+1).getCell(j).toString());
				
				
					
			}		
			
			data[i][0]= hashdatamap;
			
			System.out.println("List of user credentilas"+hashdatamap.entrySet());
			
			System.out.println("all keys in hashmap : "+hashdatamap.keySet());
			
		    }
		
		
		
		return data;
	 
		}
	
	
	@Test(dataProvider="logindata")
	public void checkloginwithhashmap(Map mymap)
	{
		String uname=mymap.get("username").toString();
		System.out.println("uanme:" + uname);
		
	}
	
	
	
	
	
	


	
	
	public static Object[][] datasupply(String Sheetname)
	{
		try {
			fis= new FileInputStream(testdatapath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			workbook= new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sheet=workbook.getSheet(Sheetname);
		
		int rowcount =sheet.getLastRowNum();
		int cellcount = sheet.getRow(0).getLastCellNum();
		
		//String cell=sheet.getRow(0).getCell(0).getStringCellValue();
		
		Object[][]data= new Object[rowcount][cellcount];
		
		for(int i=0;i<rowcount;i++)
		{
			for(int j=0;j<cellcount;j++)
			{
				data[i][j]=sheet.getRow(i+1).getCell(j).toString();// we can deside from  which is starting row 
			}
		}
		return data;
		
		
		
		
		
		
		
		
		
	}
	
	
}
