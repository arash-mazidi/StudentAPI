package com.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "stutab")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sid")
	private Integer studentId;

	@Column(name = "sname")
	private String studentName;

	@Column(name = "sadd")
	private String studentAddress;

	@Column(name = "is_Admin")
	private Boolean admin = false;

	public Student() {

	}

	public Student(Integer studentId, String studentName, String studentAddress, Boolean admin) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.admin = admin;

	}

	public Student(String studentName, String studentAddress, Boolean admin) {
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.admin = admin;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public Boolean getadmin() {
		return admin;
	}

	public void setadmin(Boolean admin) {
		this.admin = admin;
	}
}
