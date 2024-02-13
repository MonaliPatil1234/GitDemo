package DataDrivenExcel.DataDrivenApachePOI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {

	public ArrayList<String> getData(String testCaseName) throws IOException {
		ArrayList<String> a = new ArrayList<String>();

		FileInputStream fis = new FileInputStream("C:\\Users\\madhu\\Documents\\SelDataDrivenPOIDemo.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis); // grab the entire workbook
		int numOfSheets = workbook.getNumberOfSheets();// check no of worksheets in that workbook

		for (int i = 0; i < numOfSheets; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase("testdata"))// we are looking for worksheet named testdata
																		// from grabbed worksheets, if its testdata,
																		// then
			{
				XSSFSheet sheet = workbook.getSheetAt(i);
				// Identify testcases named column by scanning entire 1st row
				Iterator<Row> rows = sheet.rowIterator();// this is row iterator
				Row firstRow = rows.next();// this is how we move to next row
				Iterator<Cell> cell = firstRow.cellIterator();// this is cell iterator
				int column = 0, k = 0;
				while (cell.hasNext())// if there are still rows
				{
					Cell value = cell.next();// go to next row
					if (value.getStringCellValue().equalsIgnoreCase("Testcases"))// check if its a cell named testcases
					{
						// desired column
						column = k;
					}
					k++;
				}
				System.out.println(column);
				while (rows.hasNext()) {
					Row r = rows.next();// go to next row
					if (r.getCell(column).getStringCellValue().equalsIgnoreCase(testCaseName))// check if its a cell
																								// named testcases
					{
						// after you have got the purchase testcase row, grab all cell data in that row
						// and feed into test
						Iterator<Cell> cv = r.cellIterator();
						while (cv.hasNext()) {
							Cell c = cv.next();
							if (c.getCellType() == CellType.STRING) {
								// System.out.println(c.getStringCellValue());
								a.add(c.getStringCellValue());
							} else {
								a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
							}
						}
					}
				}
			}
		}
		return a;
	}
}