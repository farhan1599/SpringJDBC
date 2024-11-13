package demo.spring.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import demo.spring.myBookDao.IBookDao;
import demo.spring.myBookDto.MyBookDto;

public class BookService {

	IBookDao bookDao;

	public void setBookDao(IBookDao bookDao) {
		this.bookDao = bookDao;
	}

	public void fetchData(String filePath) {

		try {
			File file = new File(filePath);
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;

			while ((line = bufferedReader.readLine()) != null) {
				String[] values = line.split(",");
				MyBookDto myBookDto = new MyBookDto(Integer.parseInt(values[0]), values[1],
						Double.parseDouble(values[2]));
				
				bookDao.insert(myBookDto);
				
				System.out.println("Success...");
			}

		} catch (Exception e) {
e.printStackTrace();
		}

	}

}
