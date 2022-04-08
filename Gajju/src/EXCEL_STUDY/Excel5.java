package EXCEL_STUDY;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream MyFile=new FileInputStream("D:\\excel\\book1.xlsx");
		Sheet mysheet = WorkbookFactory.create(MyFile).getSheet("sheet1");
		
		int totalRowCount = mysheet.getLastRowNum();
		int totalNoOfCell = mysheet.getRow(0).getLastCellNum()-1;
		
		for(int i=0;i<=totalRowCount;i++)
		{
			for(int j=0;j<=totalNoOfCell;j++)
			{
				Cell cellInfo = mysheet.getRow(i).getCell(j);
				CellType Type = cellInfo.getCellType();
				System.out.print(Type);
				
				if(Type==CellType.STRING)
				{
					String value = cellInfo.getStringCellValue();
					System.out.print(value+ " ");
				}
				else if(Type==CellType.NUMERIC)
				{
					double value1 = cellInfo.getNumericCellValue();
					System.out.print(value1+ " ");
				}
				else if(Type ==CellType.BOOLEAN)
				{
					boolean value3 = cellInfo.getBooleanCellValue();
					System.out.print(value3+ " ");
				}
			}
			System.out.println();
		}
	}

}
