package poi;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createAndWrite("E:\\java\\API\\TestData.xlsx");
	}
	//Q: Create a new excel sheet & write to it?
		static void createAndWrite(String filePath) {
			Workbook wb = null;
			Sheet sh = null;
			Row row = null;
			Cell cell = null;
			FileOutputStream fout = null;
			try {
				wb = new XSSFWorkbook();  //Creating a new excel workbook
				sh = wb.createSheet("Data");
				
				row = sh.createRow(0);
				cell = row.createCell(0);
				cell.setCellValue("SG Testing");
				
				row = sh.createRow(1);
				cell = row.createCell(1);
				cell.setCellValue("Vijaynagar");
				
				row = sh.createRow(2);
				cell = row.createCell(2);
				cell.setCellValue("Bangalore");
				
				fout = new FileOutputStream(filePath);
				wb.write(fout);
			}catch(Exception e) {
				e.printStackTrace();
			}
			finally
			{
				try {
					fout.flush();
					fout.close();
					fout = null;
					cell = null;
					row = null;
					sh = null;
					wb.close();
					wb = null;
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}


