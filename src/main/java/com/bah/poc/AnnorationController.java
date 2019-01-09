package com.bah.poc;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bah.poc.dto.CustomAnnotationDTO;
import com.bah.poc.service.CustomAnnotationFinder;

@RestController
public class AnnorationController {

	Logger logger = LoggerFactory.getLogger(AnnorationController.class);
	
	@Autowired
	private CustomAnnotationFinder customAnnotationFinder;
	
	@RequestMapping("/annotations")
	public Map<String, CustomAnnotationDTO> getCustomAnnotations() {
		return customAnnotationFinder.getAnnotationClasses();
	}
}