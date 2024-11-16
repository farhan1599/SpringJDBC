package demo.jdbc.product.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.jdbc.product.service.ProductService;

public class MyApp {

	public static void main(String[] args) throws Exception {
ApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");
ProductService productService = context.getBean(ProductService.class);
productService.getProducts();
	}

}
