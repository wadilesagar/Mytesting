package EXCEL_STUDY;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelstudy {
//static coding read only single cell
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

     FileInputStream MyFile= new FileInputStream("D:\\excel\\book1.xlsx");
     
      String value = WorkbookFactory.create(MyFile).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
      String value1 = WorkbookFactory.create(MyFile).getSheet("sheet1").getRow(0).getCell(1).getStringCellValue();
      String value2 = WorkbookFactory.create(MyFile).getSheet("sheet1").getRow(0).getCell(2).getStringCellValue();
      System.out.print(value);
      System.out.print(value1);
      System.out.print(value2);
     
	}

}
