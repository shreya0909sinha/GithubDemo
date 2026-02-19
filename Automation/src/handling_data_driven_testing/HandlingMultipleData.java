package handling_data_driven_testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingMultipleData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./testdata/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		for(int i=0;i<=10;i++) {
			for(int j=0;j<=3;j++) {
				String data =wb.getSheet("multiProduct").getRow(i).getCell(j).getStringCellValue();
				System.out.print(data+" ");
			}System.out.println();
		}
		
	}

}
