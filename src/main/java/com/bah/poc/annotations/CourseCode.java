package com.bah.poc.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RetentionPolicy.RUNTIME) // Annotation will work at RUNTIME
@Target(value = { ElementType.METHOD, ElementType.FIELD }) // Annotation can be applied either on METHOD or on FIELD
@Constraint(validatedBy = CourseCodeConstraintValidator.class) // CustomValidator class will validate the values
//@interface - is an annotation to make current interface an a custom annotation
public @interface CourseCode {
	String message() default "must start with ABC";

	String value() default "ABC";

	Class<?>[] groups() default {}; // Required by Constraint

	Class<? extends Payload>[] payload() default {}; // Required by Constraint
}
