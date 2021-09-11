package week5.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readFile(String fileName) throws IOException {
		// TODO Auto-generated method stub
		XSSFWorkbook wb = new XSSFWorkbook("./excelwb/"+fileName+".xlsx");
		XSSFSheet ws = wb.getSheet("Sheet1");
		int lastRowNum = ws.getLastRowNum();
		int lastCellNum = ws.getRow(0).getLastCellNum();
		String[][] data = new String[lastRowNum][lastCellNum];
		for (int i = 1; i <= lastRowNum; i++) {
			for (int j = 0; j < lastCellNum; j++) {
				String Value = ws.getRow(i).getCell(j).getStringCellValue();
				data[i-1][j]=Value;
			}
		}

		wb.close();
		return data;
	}

}
