package com.bah.poc.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.stereotype.Component;

@Retention(RetentionPolicy.RUNTIME) // Annotation will work at RUNTIME
@Target(value = {ElementType.TYPE, ElementType.FIELD }) // Annotation can be applied either on METHOD or on FIELD
//@Target(value = { ElementType.METHOD, ElementType.FIELD }) 
@Component
public @interface CustomForeinKey {
	String table();
	String column();
	String method() default "cascade";
}
