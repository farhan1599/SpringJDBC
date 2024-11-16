package demo.jdbc.employee.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.jdbc.employee.beans.service.EmpService;

public class MyApp {

	public static void main(String[] args) throws Exception {
ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
EmpService empService = context.getBean(EmpService.class);
empService.getEmp();
	}

}
