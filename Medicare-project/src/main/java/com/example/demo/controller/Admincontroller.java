package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.AdminService;
import com.example.demo.model.Admin;
import com.example.demo.model.Listofitems;
@CrossOrigin (origins="http://localhost:4200")
@RequestMapping("/api/Admin")
@RestController
public class Admincontroller {
public AdminService adminservic;

public Admincontroller(AdminService adminservic) {
	super();
	this.adminservic = adminservic;
}
@PostMapping
public ResponseEntity<Admin> SaveAdmin(@RequestBody Admin admin)
{
	return new ResponseEntity<Admin>(adminservic.SaveAdmin(admin),HttpStatus.CREATED);
}
@GetMapping
public List<Admin> getallAdmins()
{
	return adminservic.getallAdmins();
}
}
