package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class EXCELSHEET {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream MyFile=new FileInputStream("D:\\excel\\Book1.xlsx");
	
	Sheet mySheet = WorkbookFactory.create(MyFile).getSheet("sheet2");
//	String value = mySheet.getRow(0).getCell(0).getStringCellValue();
	CellType type1 = mySheet.getRow(0).getCell(1).getCellType();
	CellType type2=mySheet.getRow(0).getCell(2).getCellType();
    CellType type3 = mySheet.getRow(1).getCell(3).getCellType();
    System.out.print(type1 +" " );
    System.out.print(type2 +" ");
    System.out.print(type3 +" ");
  

}
}
