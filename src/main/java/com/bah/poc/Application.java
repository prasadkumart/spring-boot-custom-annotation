package com.bah.poc;

import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bah.poc.annotations.CustomForeinKey;

@SpringBootApplication
public class Application{ // implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

/*	@Override
	public void run(String... args) throws Exception {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		Map<String, Object> beans = ctx.getBeansWithAnnotation( CustomForeinKey.class );
		System.out.println(beans);
	}*/

	/*
	 * @Override public void run(String... args) throws Exception { Employee
	 * employee = new Employee(); employee.setFirstName("Prasad");
	 * employee.setLastName("Thummalapalli");
	 * employee.setCourseCode("BAH-BD-Proposals-Basic1");
	 * 
	 * // Inbuilt class that is used to validate data ValidatorFactory validator =
	 * Validation.buildDefaultValidatorFactory(); Set<ConstraintViolation<Employee>>
	 * validationErrors = validator.getValidator().validate(employee);
	 * 
	 * if (!validationErrors.isEmpty()) { // If there are some errors then print
	 * those { for (ConstraintViolation<Employee> invalidObj : validationErrors) {
	 * System.out.println(
	 * "===================================================================================="
	 * ); System.out.println(invalidObj.getMessage()); System.out.println(
	 * "===================================================================================="
	 * ); } } else {
	 * 
	 * System.out.println(
	 * "===================================================================================="
	 * ); System.out.println("Valid Employee Object"); System.out.println(
	 * "===================================================================================="
	 * );
	 * 
	 * } }
	 */

}