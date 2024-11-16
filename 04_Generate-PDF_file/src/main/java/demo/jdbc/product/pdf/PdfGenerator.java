package demo.jdbc.product.pdf;

import java.io.FileOutputStream;
import java.util.List;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import demo.jdbc.product.dto.ProductDto;

public class PdfGenerator {

	public void generatePDF(List<ProductDto> productDto, String fileName) throws Exception {

		// step 1 : create document instance
		Document document = new Document();

		// step 2 :create PdfWriter instance
		PdfWriter.getInstance(document, new FileOutputStream(fileName));

		// step 3 :open document to write content
		document.open();

		// step 4 : add content to the document (a table with products data)
		PdfPTable table = new PdfPTable(4); // 4 (productId,productName,productType,productPrice)

		// add header row
		table.addCell("productId");
		table.addCell("productName");
		table.addCell("productType");
		table.addCell("productPrice");

		// add product data row
		productDto.forEach(product -> {
			table.addCell(String.valueOf(product.getProductId()));
			table.addCell(product.getProductName());
			table.addCell(product.getProductType());
			table.addCell(String.valueOf(product.getProductPrice()));
		});
		
		//add table into the document
		document.add(table);
		
		//step 5 : close the document
		document.close();
	}
}
