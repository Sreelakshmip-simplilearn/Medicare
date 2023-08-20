package com.example.demo.Service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Dao.AdminDao;
import com.example.demo.Service.AdminService;
import com.example.demo.model.Admin;

@Service

public class AdminServiceimpl implements AdminService{
   public AdminDao admindao;
	public AdminServiceimpl(AdminDao admindao) {
	super();
	this.admindao = admindao;
}
	@Override
	public Admin SaveAdmin(Admin admin) {
		return admindao.save(admin);
	}
	@Override
	public List<Admin> getallAdmins() {
		return admindao.findAll();
	}

}
