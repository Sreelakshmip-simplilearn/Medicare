package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.Listofitemservice;

import com.example.demo.model.Listofitems;

@RequestMapping("/api/Listofitems")
@CrossOrigin (origins="http://localhost:4200")
@RestController
public class ListofItemscontroller {
	public Listofitemservice listofitemservice;
public ListofItemscontroller(Listofitemservice listofitemservice) {
		super();
		this.listofitemservice = listofitemservice;
	}



@PostMapping
public ResponseEntity<Listofitems> SaveListofitems(@RequestBody Listofitems listofitems)
{
	return new ResponseEntity<Listofitems>(listofitemservice.saveListofItems(listofitems),HttpStatus.CREATED);
}

@GetMapping
public List<Listofitems> getallListofitems()
{
	return listofitemservice.getallListofitems();
}
@GetMapping("{itemname}")
public ResponseEntity<Listofitems> getitemsby(@PathVariable("itemname") String itemname)
{
	return new ResponseEntity<Listofitems> (listofitemservice.getitemsby(itemname),HttpStatus.OK);
}

@PostMapping("{itemname}")
public ResponseEntity<Listofitems> updateListofitems(@PathVariable("itemname") String itemname
		                                 ,@RequestBody Listofitems listofitems)
{
	return new ResponseEntity<Listofitems>(listofitemservice.updateListofitems(listofitems, itemname),HttpStatus.OK);
}
@DeleteMapping("{itemname}")
public ResponseEntity <String> deleteListofitems(@PathVariable("itemname") String itemname){
	listofitemservice.deleteListofitem(itemname);
	return new ResponseEntity<String> ("item deleted successfully",HttpStatus.OK);
}
}
