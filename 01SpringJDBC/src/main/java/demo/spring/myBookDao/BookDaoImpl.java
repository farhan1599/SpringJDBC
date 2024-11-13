package demo.spring.myBookDao;

import org.springframework.jdbc.core.JdbcTemplate;

import demo.spring.myBookDto.MyBookDto;

public class BookDaoImpl implements IBookDao {

	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void insert(MyBookDto myBookDto) {
		String query = "INSERT INTO mybook (id,name,price) values (?,?,?)";
		int update = jdbcTemplate.update(query, myBookDto.getBookId(), myBookDto.getBookName(),
				myBookDto.getBookPrice());
		if (update >= 1) {
			System.out.println("Book inserted into table.." + myBookDto);
		} else {
			System.out.println("Book data is updated..." + myBookDto);
		}
	}

}
