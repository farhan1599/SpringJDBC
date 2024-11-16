package demo.jdbc.employeeDto;

import lombok.Data;

@Data
public class EmployeeDto {
  Integer empId;
  String empName;
  Double sal;
  String hireDate;
}
