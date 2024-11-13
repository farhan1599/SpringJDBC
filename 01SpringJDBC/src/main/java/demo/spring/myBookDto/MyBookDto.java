package demo.spring.myBookDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class MyBookDto {

	int bookId;
	String bookName;
	double bookPrice;

}
