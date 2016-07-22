package Utilities;
import java.io.FileInputStream;

import java.io.FileOutputStream;

import org.apache.jasper.tagplugins.jstl.core.Catch;
import org.apache.poi.xssf.usermodel.XSSFCell;

import org.apache.poi.xssf.usermodel.XSSFRow;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelUtil {
	private static XSSFSheet ExcelWSheet;
	 
	private static XSSFWorkbook ExcelWBook;

	private static XSSFCell Cell;

	private static XSSFRow Row;
	
	public static void SetExcelFile(String path, String sheet)throws Exception{
		try{
		FileInputStream ExcelFile = new  FileInputStream(path);
		ExcelWBook = new XSSFWorkbook(ExcelFile);
		ExcelWSheet = ExcelWBook.getSheet(sheet);
	}
	catch(Exception e){
		throw(e);
	}
	
	
}
	public static String getcelldata(int row, int col)throws Exception{
		
		Cell = ExcelWSheet.getRow(row).getCell(col);
		String Celldata = Cell.getStringCellValue();
		return Celldata;
	}
}
