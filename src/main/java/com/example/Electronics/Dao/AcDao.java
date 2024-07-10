package com.example.Electronics.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Electronics.Entity.Ac;
import com.example.Electronics.Repository.AcRepository;

@Repository
public class AcDao {
	
	@Autowired
	AcRepository r;
	
	public String postac(Ac a) {
		r.save(a);
		return "Saved Sucessfully";
	}
	
	public List<Ac> getac(){
		return r.findAll();
		}
	
	public Ac getid(int id) {
		return r.findById(id).get();
	}
	
	public String deleteid(int a) {
		r.deleteById(a);
		return "Deleted Sucessfully";
	}
	
	public String putac(int id,Ac a) {
		Ac x=r.findById(id).get();
		x.setBrand(a.getBrand());
		x.setModel(a.getModel());
		x.setPrice(a.getPrice());
		
		r.save(x);
		return "Updated Sucessfully";
	}


	

}
