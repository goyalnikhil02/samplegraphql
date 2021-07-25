package com.sample.graphql.service;

import com.sample.graphql.modal.Book;
import com.sample.graphql.modal.Student;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class StudentServiceImpl implements StudentService {
	private Map<String, Student> map = new HashMap<>();

	@Override
	public Student getStudentDetailsByName(String name) {
		return null != name ? map.get(name) : null;
	}

	@Override
	public Student createStudentRecord(Student student) {
		if (null != student) {
			map.put(student.getName(), student);
		}
		return student;
	}

	@Override
	public String getHelloUser(String fname, String lname) {

		return "Hello" + fname + "::" + lname;
	}

	@Override
	public String getBooks(String author, String title) {
		// TODO Auto-generated method stub
		return author + "::" + title;
	}

	@Override
	public Book bookDetails(Book book) {
		Book book1 = new Book();
		book1.setAuthor(book.getAuthor());
		book1.setTitle(book.getTitle());
		return book1;
	}
}
