package com.example.demo.Service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.Dao.ListofItemsDao;
import com.example.demo.Service.Listofitemservice;
import com.example.demo.exception.Resourcenotfound;
import com.example.demo.model.Listofitems;
@Service

public class Listofitemserviceimpl implements Listofitemservice{
	 public ListofItemsDao listofitemsdao;

	@Override
	public Listofitems saveListofItems(Listofitems listofitems) {
		return listofitemsdao.save(listofitems);
	}

	public Listofitemserviceimpl(ListofItemsDao listofitemsdao) {
		super();
		this.listofitemsdao = listofitemsdao;
	}

	@Override
	public List<Listofitems> getallListofitems() {
		return listofitemsdao.findAll();
	}

	@Override
	public Listofitems getitemsby(String itemname) {
		
		Optional<Listofitems> listofitems=listofitemsdao.findById(itemname);
		if(listofitems.isPresent())
		{
		return listofitems.get();
		}
		else 
			throw new Resourcenotfound("Listofitems","itemname",itemname);
		
		
	}

	@Override
	public Listofitems updateListofitems(Listofitems listofitems, String itemname) {
		Listofitems exsistinglistofitems=listofitemsdao.findById(itemname).orElseThrow(
				() -> new Resourcenotfound("Listofitems","itemname",itemname)
				
				);
		exsistinglistofitems.setItemname(listofitems.getItemname());
		exsistinglistofitems.setItemid(listofitems.getItemid());
		exsistinglistofitems.setPrize(listofitems.getPrize());
		listofitemsdao.save(exsistinglistofitems);
		return exsistinglistofitems;
	}

	@Override
	public void deleteListofitem(String itemname) {
		listofitemsdao.findById(itemname).orElseThrow(() -> new Resourcenotfound("Listofitems","itemname",itemname));
	listofitemsdao.deleteById(itemname);
		
	}

	

}
