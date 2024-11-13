package demo.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.spring.service.BookService;

public class MyApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		BookService bookService = context.getBean(BookService.class);
		bookService.fetchData("C:\\Users\\DELL\\Desktop\\SpringDemo.txt");
	}

}
