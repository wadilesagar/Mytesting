package EXCEL_STUDY;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelTest3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		 FileInputStream MyFile= new FileInputStream("D:\\excel\\book1.xlsx");
		 Sheet MySheet = WorkbookFactory.create(MyFile).getSheet("sheet2");
		
		
		 for(int i=0;i<=1;i++) //outer for loop for row
		 {
			 for(int  j=0;j<=3;j++) //inner for loop for cell
			 {
				String value = MySheet.getRow(i).getCell(j).getStringCellValue();
			   System.out.print(value +"  ");
			 }
			 System.out.println();
		 }
		
	}

}
