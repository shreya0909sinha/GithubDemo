package handling_data_driven_testing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataInExcelByCreatingCell {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./testdata/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet("searchProduct").getRow(0).getCell(5).setCellValue("Shreya");
		FileOutputStream fos = new FileOutputStream("./testdata/testscript.xlsx");
		wb.write(fos);
	}

}
