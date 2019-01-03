package com.bah.poc;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@RestController
public class Application { // implements CommandLineRunner {

	/*
	 * @RequestMapping("/") public String home() { return "Hello Docker World"; }
	 */

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	/*
	 * public static void main(String[] args) {
	 * SpringApplication.run(SpringBootMain.class, args); }
	 */
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