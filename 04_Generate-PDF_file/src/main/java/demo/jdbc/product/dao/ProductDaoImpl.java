package demo.jdbc.product.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import demo.jdbc.product.dto.ProductDto;

public class ProductDaoImpl implements IProductDao {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<ProductDto> getProducts() {
		String query = "select *from products";
		RowMapper<ProductDto> rowMapper = (rs, rowNum) -> {
			ProductDto productDto = new ProductDto();
			productDto.setProductId(rs.getInt("productId"));
			productDto.setProductName(rs.getString("productName"));
			productDto.setProductType(rs.getString("productType"));
			productDto.setProductPrice(rs.getDouble("productPrice"));

			return productDto;
		};
		return jdbcTemplate.query(query, rowMapper);
	}
}
