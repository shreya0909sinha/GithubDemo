package generic_library;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * It is a generic class containing generic methods to read data from property file
 * and excel file and write data into excel file
 */
public class FileLib {
	/**
	 * It is a generic method to read data from property file based on mentioned key
	 * @param key
	 * @return The value present in the property file associated 
	 * @throws IOException
	 */
public String readPropertyData(String key) throws IOException
{
	FileInputStream fis = new FileInputStream("./testdata/commondata.properties");
	Properties p = new Properties();
	p.load(fis);
	String data = p.getProperty(key);
	return data;
	
}
/**
 * It is generic method to read data from excel file
 * @param sheetName @param rowIndex @param cellIndex
 * @return It will return string value from mentioned sheetname , rowIndex , cellIndex
 * @throws IOException
 */
public String readExcelData(String sheetName,int rowIndex,int cellIndex) throws IOException
{
	FileInputStream fis = new FileInputStream("./testdata/testscript.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	String data = wb.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex).getStringCellValue();
	return data;
	
}
/**
 * It is a generic method method to write string data into excel file based on mentioned
 * parameters
 * @param sheetName @param rowIndex @param cellIndex @param value
 * @throws IOException
 */

public void writeDataIntoExcel(String sheetName,int rowIndex,int cellIndex, String value) throws IOException
{
	FileInputStream fis = new FileInputStream("./testdata/testscript.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	wb.getSheet(sheetName).getRow(rowIndex).createCell(cellIndex).setCellValue(value);
	FileOutputStream fos = new FileOutputStream("./testdata/testscript.xlsx");
	wb.write(fos);
	wb.close();
}

}
