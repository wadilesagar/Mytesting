package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class EXCEL {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

     FileInputStream MyFile =new FileInputStream("D:\\excel\\Book1.xlsx");
     
        Sheet MySheet = WorkbookFactory.create(MyFile).getSheet("sheet1");
     
    for(int i=0;i<=2;i++)//outer loop for row
    {
    	for(int j=0;j<=3;j++)//inner loop for cell
    	{
    		String value = MySheet.getRow(i).getCell(j).getStringCellValue();
    		System.out.print(value +" ");
    	}
    	System.out.println();
    }
	  
	}

}
