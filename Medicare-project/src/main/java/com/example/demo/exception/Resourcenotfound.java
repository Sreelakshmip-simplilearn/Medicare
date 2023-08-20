package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class Resourcenotfound extends RuntimeException {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public Resourcenotfound(String resourcename, String fieldname, Object fieldvalue) {
		super(String.format( "%s notfound %s: '%s'",resourcename,fieldname,fieldvalue));
		this.resourcename = resourcename;
		this.fieldname = fieldname;
		this.fieldvalue = fieldvalue;
	}
private String resourcename;
private String fieldname;
private Object fieldvalue;
public String getResourcename() {
	return resourcename;
}
public String getFieldname() {
	return fieldname;
}
public Object getFieldvalue() {
	return fieldvalue;
}

}
