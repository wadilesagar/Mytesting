package EXCEL_STUDY;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelTest4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream MyFile= new FileInputStream("D:\\excel\\book1.xlsx");
		 Sheet MySheet = WorkbookFactory.create(MyFile).getSheet("sheet2");
		 
		 //for getting row from excel
		 int lastRow = MySheet.getLastRowNum();
//		 System.out.println("last row num "+lastRow);
		 int totalnoOfRows=lastRow;
		 System.out.println("Last row value " +totalnoOfRows);
		
		 short lastCell = MySheet.getRow(0).getLastCellNum();
//		 System.out.println(" last cell "+lastCell);
		 short totalNoOfcells = lastCell;
		 System.out.println("Last cell value " +totalNoOfcells);
		 
//		 for(int i=0;i<=1;i++)//outer loop for row
//		 {
//			 for(int j=0;j<=3;j++)//inner loop for cells
//			 {
//				 String value = MySheet.getRow(i).getCell(j).getStringCellValue();
//				 System.out.print(value + " ");
//			}
//			 System.out.println();
//		 }
		  
	}

}
