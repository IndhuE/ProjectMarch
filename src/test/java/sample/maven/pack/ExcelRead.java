package sample.maven.pack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelRead {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Indhu\\eclipse-workspace\\SampleMaven\\excel\\Data driven.xlsx");
		FileInputStream stream = new FileInputStream(file);
//		Workbook b = new XSSFWorkbook(stream);
//		Sheet sheet = b.getSheet("Sheet1");
//		for (int i = 0; i <sheet.getPhysicalNumberOfRows(); i++) {
//			Row row = sheet.getRow(i);
//			for (int j = 0; j<row.getPhysicalNumberOfCells(); j++) {
//				Cell cell = row.getCell(j);
//				int cellType = cell.getCellType();
//				if(cellType==1) {
//					String stringCellValue = cell.getStringCellValue();
//					System.out.println(stringCellValue);
//				}	
//				else if(DateUtil.isCellDateFormatted(cell)){
//					Date dateCellValue = cell.getDateCellValue();
//					SimpleDateFormat date = new SimpleDateFormat("d-MM-YYYY");
//					String format = date.format(dateCellValue);
//					System.out.println(format);
//				}
//				else {
//					double n = cell.getNumericCellValue();
//					long l = (long) n;
//					System.out.println(l);
//				}
//			}
//			
//		}
		
		Workbook book = new XSSFWorkbook(stream);
		Sheet createSheet = book.createSheet("Amazon11");
		Row row = createSheet.createRow(0);
		Cell one1 = row.createCell(1);
		one1.setCellValue("java");
		FileOutputStream stream2= new FileOutputStream(file);
		book.write(stream2);
			System.out.println("donee");
		
	}
	
}
