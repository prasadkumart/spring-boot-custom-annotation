package com.bah.poc;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import com.bah.poc.model.Employee;

@RunWith(SpringRunner.class)
public class SpringCustomAnnotationTest {

	@Test
	public void testValidEmployee() throws Exception {
		Employee employee = new Employee();
		employee.setFirstName("Prasad");
		employee.setLastName("Thummalapalli");
		employee.setCourseCode("BAH-BD-Proposals-Basic1");

		// Inbuilt class that is used to validate data
		ValidatorFactory validator = Validation.buildDefaultValidatorFactory();
		Set<ConstraintViolation<Employee>> validationErrors = validator.getValidator().validate(employee);
		validateErrors(validationErrors, employee);
		Assert.assertTrue(validationErrors.isEmpty());
	}
	
	@Test
	public void testInvalidEmployee1() throws Exception {
		Employee employee = new Employee();
		employee.setFirstName("Prasad");
		employee.setLastName("");
		employee.setCourseCode("BAH-BD-Proposals-Basic1");

		// Inbuilt class that is used to validate data
		ValidatorFactory validator = Validation.buildDefaultValidatorFactory();
		Set<ConstraintViolation<Employee>> validationErrors = validator.getValidator().validate(employee);
		validateErrors(validationErrors, employee);
		Assert.assertTrue(!validationErrors.isEmpty());
	}
	
	@Test
	public void testInvalidEmployee2() throws Exception {
		Employee employee = new Employee();
		employee.setFirstName("Prasad");
		employee.setCourseCode("BAH-BD-Proposals-Basic1");

		// Inbuilt class that is used to validate data
		ValidatorFactory validator = Validation.buildDefaultValidatorFactory();
		Set<ConstraintViolation<Employee>> validationErrors = validator.getValidator().validate(employee);
		validateErrors(validationErrors, employee);
		Assert.assertTrue(!validationErrors.isEmpty());
	}
	
	@Test
	public void testInvalidEmployee3() throws Exception {
		Employee employee = new Employee();
		employee.setFirstName("Prasad");
		employee.setLastName("Thummalapalli");
		employee.setCourseCode("XYZ-Proposals-Basic1");

		// Inbuilt class that is used to validate data
		ValidatorFactory validator = Validation.buildDefaultValidatorFactory();
		Set<ConstraintViolation<Employee>> validationErrors = validator.getValidator().validate(employee);
		validateErrors(validationErrors, employee);
		Assert.assertTrue(!validationErrors.isEmpty());
	}
	
	private void validateErrors(Set<ConstraintViolation<Employee>> validationErrors, Employee employee) {
		if (!validationErrors.isEmpty()) { // If there are some errors then print those {
			for (ConstraintViolation<Employee> invalidObj : validationErrors) {
				System.out.println("============================================================");
				System.out.println(invalidObj.getMessage());
				System.out.println("============================================================");
			}
		} else {
			System.out.println("============================================================");
			System.out.println(employee.getCourseCode() + " is a Valid Course");
			System.out.println("============================================================");

		}
	}

}
