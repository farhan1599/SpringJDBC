package demo.jdbc.employee.beans.service;

import java.util.List;

import demo.jdbc.employee.excel.IExcelGenerator;
import demo.jdbc.employeeDao.beans.IEmpDao;
import demo.jdbc.employeeDto.EmployeeDto;

public class EmpService {
	private IEmpDao empDao;
	private IExcelGenerator excelGenerator;
	
	
	//=======setter injection=============S
	public void setExcelGenerator(IExcelGenerator excelGenerator) {
		this.excelGenerator=excelGenerator;
	}

	
	//======setter injection=======
	public void setEmpDao(IEmpDao empDao) {
		this.empDao = empDao;
	}

	/*
	 * public EmpService(IEmpDao empDao) { this.empDao=empDao; }
	 */

	public void getEmp() throws Exception {
		List<EmployeeDto> empLst = empDao.getData();
		excelGenerator.generateExcel(empLst);
		empLst.forEach(emp -> {
			System.out.println(emp);
		});

	}

}
