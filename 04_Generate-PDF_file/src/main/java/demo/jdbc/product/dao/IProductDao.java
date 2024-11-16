package demo.jdbc.product.dao;

import java.util.List;


import demo.jdbc.product.dto.ProductDto;

public interface IProductDao {

	public List<ProductDto> getProducts();

}
