package com.bah.poc.service;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.List;

import com.bah.poc.annotations.CustomForeinKey;

public class PersistenceManager {
	@CustomForeinKey(table="product", column="sku", method="cascade")
	List<String> products;
	
	private int productPrice;
	
	
	private void deleteProductPrice(String sku) {
		System.out.println("Deleted entiry from ProductPrice");
	}
	
	private void deleteProduct(String sku) {
		System.out.println("Deleted entiry from Product");
	}
	
	//	@CustomForeinKey(table="product", column="sku", method="cascade")
	public void deleteEntity(String sku) {
		
		for (Field field : this.getClass().getDeclaredFields()) {
			if (field.isAnnotationPresent(CustomForeinKey.class)) {
				String method = field.getAnnotation(CustomForeinKey.class).method();
				
				System.out.println("=========================" + method);
			}
		}
		
		/*
		 * AnnotationConfigApplicationContext ctx = null; try { ctx = new
		 * AnnotationConfigApplicationContext(); ctx.refresh(); Map<String, Object>
		 * beans = ctx.getBeansWithAnnotation( CustomForeinKey.class );
		 * System.out.println(beans); } catch(Exception e) { System.out.println(e); }
		 * finally { ctx.close(); }
		 */
		
		/*
		 * //String method =
		 * this.getClass().getAnnotation(CustomForeinKey.class).method(); String method
		 * = null; String table = null; try { //method =
		 * this.getClass().getMethod("deleteEntity",
		 * String.class).getAnnotation(CustomForeinKey.class).method(); //table =
		 * this.getClass().getMethod("deleteEntity",
		 * String.class).getAnnotation(CustomForeinKey.class).table(); Annotation[] ann
		 * = this.getClass().getDeclaredFields() System.out.println("================" +
		 * ann); } catch (Exception e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
		
		/*
		 * if (null != method && "cascade".equalsIgnoreCase(method)) {
		 * 
		 * if ("product".equalsIgnoreCase(table)) { deleteProductPrice(sku); // HTTPDEL
		 * "hard coded baseuri for product"/ - dynamically del API call on sku
		 * 
		 * 
		 * deleteProduct(sku); } }
		 */
	}
}
 