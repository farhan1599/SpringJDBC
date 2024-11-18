package demo.jdbc.product.dto;

import lombok.Data;

@Data
public class ProductDto {
	private Integer productId;
        private	String productName;
	private String productType;
	private Double productPrice;
	

}
