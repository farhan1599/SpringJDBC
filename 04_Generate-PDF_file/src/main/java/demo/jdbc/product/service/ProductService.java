package demo.jdbc.product.service;

import java.util.List;

import demo.jdbc.product.dao.IProductDao;
import demo.jdbc.product.dto.ProductDto;
import demo.jdbc.product.pdf.PdfGenerator;

public class ProductService {

	IProductDao productDao;
	PdfGenerator pdfGenerator;

	public void setPdfGenerator(PdfGenerator pdfGenerator) {
		this.pdfGenerator = pdfGenerator;
	}

	public void setProductDao(IProductDao productDao) {
		this.productDao = productDao;
	}

	public void getProducts() throws Exception {
		List<ProductDto> products = productDao.getProducts();
		
		pdfGenerator.generatePDF(products, "product.pdf");

		/*
		 * products.forEach(product -> { System.out.println(product); });
		 */

		for (ProductDto p : products) {
			System.out.println(p);

		}

	}

}
