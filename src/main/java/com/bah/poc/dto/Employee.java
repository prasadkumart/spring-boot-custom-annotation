
package com.bah.poc.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.bah.poc.annotations.CourseCode;

public class Employee {

	private String firstName;

	@NotNull(message = "LastName is must not be null")
	@Size(min = 1, message = "LastName is required")
	private String lastName;

	@CourseCode(value = "BAH", message = "CouseCode must start with BAH")
	private String courseCode;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
}