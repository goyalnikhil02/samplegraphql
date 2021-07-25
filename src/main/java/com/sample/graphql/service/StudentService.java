package com.sample.graphql.service;

import com.sample.graphql.modal.Book;
import com.sample.graphql.modal.Student;

public interface StudentService {
	public Student getStudentDetailsByName(String name);

	public Student createStudentRecord(Student student);
	
	public String getHelloUser(String fname,String lname);
	
	public String getBooks(String author,String title);
	
	public Book bookDetails(Book book);
	

	
}
