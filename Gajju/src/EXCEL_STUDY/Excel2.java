package EXCEL_STUDY;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel2 {
//static coding read all  cell
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream MyFile= new FileInputStream("D:\\excel\\book1.xlsx");
		
		Workbook test = WorkbookFactory.create(MyFile);
		Sheet mySheet = test.getSheet("sheet2");
	    Row myRow = mySheet.getRow(0);
		Cell myCell = myRow.getCell(0);
		String value = myCell.getStringCellValue();
		System.out.print(" " +mySheet.getRow(0).getCell(0).getStringCellValue());
		System.out.print(" " +mySheet.getRow(0).getCell(1).getStringCellValue());
		System.out.print(" "+mySheet.getRow(0).getCell(2).getNumericCellValue());
		System.out.println(" ");
		System.out.print(" " +mySheet.getRow(1).getCell(0).getStringCellValue());
		System.out.print("" +mySheet.getRow(1).getCell(1).getStringCellValue());
		System.out.print(" "+mySheet.getRow(1).getCell(2).getNumericCellValue());
		
	}

}
