package com.example.demo.Service;


import java.util.List;


import com.example.demo.model.Listofitems;

public interface Listofitemservice {
	Listofitems  saveListofItems(Listofitems listofitems);
	List<Listofitems> getallListofitems();
	public Listofitems getitemsby(String itemname);
	Listofitems updateListofitems(Listofitems listofitems,String itemname);
	void deleteListofitem(String itemname);
}
