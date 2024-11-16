package demo.jdbc.employee.excel;

import java.util.List;

import demo.jdbc.employeeDto.EmployeeDto;

public interface IExcelGenerator {
	public void generateExcel(List<EmployeeDto> employeeDto) throws Exception;

}
