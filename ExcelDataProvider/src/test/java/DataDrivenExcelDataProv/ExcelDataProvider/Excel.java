package DataDrivenExcelDataProv.ExcelDataProvider;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel {
	@Test
	public void getExcel() throws IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\madhu\\Documents\\ExcelToDataArrayDemo.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis); // grab the entire workbook
		XSSFSheet sheet = workbook.getSheetAt(0);
		int numOfRows = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data =new Object[numOfRows-1][colCount];
		for(int i = 0; i<numOfRows-1;i++)
		{
			System.out.println("Outer Loop Started...");
			row = sheet.getRow(i+1);
			for(int j = 0; j<colCount;j++)
			{
				System.out.println(row.getCell(j));
				data[i][j] = row.getCell(j);
			}
			System.out.println("Outer Loop Ended...");
		}
	//	return data;
	}
	}


