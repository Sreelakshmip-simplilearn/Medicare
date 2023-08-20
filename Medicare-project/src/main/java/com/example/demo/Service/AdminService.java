package com.example.demo.Service;

import java.util.List;

import com.example.demo.model.Admin;


public interface AdminService {
Admin SaveAdmin(Admin admin);
List<Admin> getallAdmins();
}
