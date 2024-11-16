package demo.jdbc.employee.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import demo.jdbc.employeeDto.EmployeeDto;

public class EmpRowMapper implements RowMapper<EmployeeDto>{
	@Override
	public EmployeeDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		EmployeeDto employeeDto= new EmployeeDto();
		employeeDto.setEmpId(rs.getInt(1));
		employeeDto.setEmpName(rs.getString(2));
		employeeDto.setSal(rs.getDouble(3));
		employeeDto.setHireDate(rs.getString(4));
		
		return employeeDto;
	}

}