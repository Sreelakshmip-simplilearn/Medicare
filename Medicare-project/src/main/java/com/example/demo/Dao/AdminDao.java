package com.example.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Admin;


public interface AdminDao extends JpaRepository<Admin, Integer>{

}