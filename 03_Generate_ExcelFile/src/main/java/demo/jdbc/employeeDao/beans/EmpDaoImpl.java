package demo.jdbc.employeeDao.beans;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import demo.jdbc.employee.mapper.EmpRowMapper;
import demo.jdbc.employeeDto.EmployeeDto;

public class EmpDaoImpl implements IEmpDao {

	private JdbcTemplate jdbcTemplate;

	//setter injection
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	/*
	 * public EmpDaoImpl(JdbcTemplate jdbcTemplate) {
	 * this.jdbcTemplate=jdbcTemplate; }
	 */
	@Override
	public List<EmployeeDto> getData() {
		String query = "select *from emp";

		List<EmployeeDto> employeeDto = jdbcTemplate.query(query, new EmpRowMapper());

		return employeeDto;
	}

}
