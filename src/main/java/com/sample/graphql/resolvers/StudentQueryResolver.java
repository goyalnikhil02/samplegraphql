package com.sample.graphql.resolvers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.sample.graphql.modal.Book;
import com.sample.graphql.modal.Student;
import com.sample.graphql.service.StudentService;

@Component
public class StudentQueryResolver implements GraphQLQueryResolver {
	@Autowired
	private StudentService studentService;

	public Student student(String name) {
		return studentService.getStudentDetailsByName(name);
	}

	public String helloStudent(String fname,String lname) {
		return studentService.getHelloUser(fname,lname);
	}
	
	public String listofBooks(Book book)
	{
		return studentService.getBooks(book.getAuthor(), book.getTitle());
	
	}
	
}
