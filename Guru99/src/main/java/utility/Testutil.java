package utility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Testutil {
	static Workbook book;
	static Sheet sheet;
	public static String test_data_path="E:\\QaWork\\Guru99\\src\\main\\java\\data\\testdataGuru.xlsx";
	
	
	public static Object[][]  getExcelTestdata(String sheetname)
	{
		FileInputStream file=null;
		try {
			file=new FileInputStream(test_data_path);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
		//	book=WorkbookFactory.create(file);
			book=WorkbookFactory.create(file);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		sheet=book.getSheet(sheetname);
		int rowcount=sheet.getLastRowNum();   // count total no of rows in sheet
		System.out.println("total no of row :"+rowcount);        
		int cellcount=sheet.getRow(0).getLastCellNum();  //total no column in sheet
		System.out.println("total no of cloumn in row :"+cellcount);
	
		
		Object[][] data= new Object [rowcount][cellcount];
		for(int i=0;i<sheet.getLastRowNum();i++)
		{
			for(int k=0;k<sheet.getRow(0).getLastCellNum();k++)
			{
				data[i][k]=sheet.getRow(i+1).getCell(k).toString();
			}
		}return data;
	}

}
