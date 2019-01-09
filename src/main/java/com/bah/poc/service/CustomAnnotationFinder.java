package com.bah.poc.service;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.bah.poc.annotations.CustomForeinKey;
import com.bah.poc.dto.CustomAnnotationDTO;

@Service
public class CustomAnnotationFinder {

	@Autowired
	private ApplicationContext appContext;
	
	@SuppressWarnings("rawtypes")
	public Map<String, CustomAnnotationDTO> getAnnotationClasses() {

		Map<String, CustomAnnotationDTO> entitiesWithCustAnnotations = new HashMap<>();

		try {
			String[] allBeanNames = appContext.getBeanDefinitionNames();
			for (String beanName : allBeanNames) {

				Class clazz = appContext.getBean(beanName).getClass();

				for (Field field : clazz.getDeclaredFields()) {
					if (field.isAnnotationPresent(CustomForeinKey.class)) {
						CustomAnnotationDTO custAnnotationDto = new CustomAnnotationDTO();
						custAnnotationDto.setTable(field.getAnnotation(CustomForeinKey.class).table());
						custAnnotationDto.setColumn(field.getAnnotation(CustomForeinKey.class).column());
						custAnnotationDto.setMethod(field.getAnnotation(CustomForeinKey.class).method());
						entitiesWithCustAnnotations.put(beanName, custAnnotationDto);
					}
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		return entitiesWithCustAnnotations;
	}
}
