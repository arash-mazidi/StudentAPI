package com.app.service;

import java.util.List;

import com.app.entity.Student;

public interface IStudentService {

	// Save student
	Integer saveStudent(Student std);

	// get all student
	List<Student> getAllStudents();

	// get student by id
	Student getStudentById(Integer id);

	// delete student by id
	void deleteStudentById(Integer id);

	// update
	void updateStudent(Student std);

}
