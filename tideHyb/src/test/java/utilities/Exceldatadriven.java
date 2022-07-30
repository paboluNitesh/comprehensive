package utilities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldatadriven {
XSSFWorkbook workbook;
	public Exceldatadriven() {
		File source = new File("./testdata/tide.xlsx");
		try {
			FileInputStream file = new FileInputStream(source);
			try {
				workbook = new XSSFWorkbook(file);

			} catch (Exception e) {
				e.printStackTrace();

			}
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public String StringData(String sheetname, int row, int column) {
		return workbook.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
	}

	public int NumericData(String sheetname, int row, int column) {
		return (int) workbook.getSheet(sheetname).getRow(row).getCell(column).getNumericCellValue();
	}
}
