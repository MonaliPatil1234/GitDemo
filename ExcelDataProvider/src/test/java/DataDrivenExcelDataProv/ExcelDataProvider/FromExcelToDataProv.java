package DataDrivenExcelDataProv.ExcelDataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class FromExcelToDataProv {
	DataFormatter formatter = new DataFormatter();

	// HERE WE WILL FETCH TEST DATA FROM EXCEL AND STORE IN DATA PROVIDER ARRAY
	@Test(dataProvider = "driveTest")
	public void testCaseData(String greetings, String communication, int id) {
		System.out.println(greetings + " " + communication + " " + id);
	}

	@DataProvider(name = "driveTest")
		public Object[][] getData() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\madhu\\Documents\\ExcelToDataArrayDemo.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis); // grab the entire workbook
		XSSFSheet sheet = workbook.getSheetAt(0);
		int numOfRows = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[numOfRows - 1][colCount];
		for (int i = 0; i < numOfRows - 1; i++) 
		{
			System.out.println("Outer Loop Started...");
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++)
			{
				System.out.println(row.getCell(j));
				XSSFCell cell  = row.getCell(j);
				data[i][j] = formatter.formatCellValue(cell);
			}
			System.out.println("Outer Loop Ended...");
		}

		return data;

	}
}