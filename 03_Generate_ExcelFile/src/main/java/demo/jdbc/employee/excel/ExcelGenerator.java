package demo.jdbc.employee.excel;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import demo.jdbc.employeeDto.EmployeeDto;

public class ExcelGenerator implements IExcelGenerator{

	@Override
	public void generateExcel(List<EmployeeDto> employeeDto) throws Exception {
		Workbook empBook = new XSSFWorkbook();
		Sheet sheet = empBook.createSheet("emp-data");

		// ========== headerRow==============
		Row headerRow = sheet.createRow(0);

		headerRow.createCell(0).setCellValue("Id");
		headerRow.createCell(1).setCellValue("Name");
		headerRow.createCell(2).setCellValue("Salary");
		headerRow.createCell(3).setCellValue("HireDate");

		// ============data row=============
		int dataRowIndex = 1;
		for (EmployeeDto emp : employeeDto) {
			Row dataRow = sheet.createRow(dataRowIndex);
			dataRow.createCell(0).setCellValue(emp.getEmpId());
			dataRow.createCell(1).setCellValue(emp.getEmpName());
			dataRow.createCell(2).setCellValue(emp.getSal());
			dataRow.createCell(3).setCellValue(emp.getHireDate());

			dataRowIndex++;
		}

		File file = new File("Emp.xlsx");
		FileOutputStream fos = new FileOutputStream(file);
		empBook.write(fos);
		fos.close();
		empBook.close();

	}
}
