package com.example.Electronics.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Electronics.Entity.Tv;
import com.example.Electronics.Repository.TvRepository;

@Repository
public class TvDao {
	@Autowired
	TvRepository r;
	
	public String posttv(Tv t) {
		r.save(t);
		return "Saved Sucessfully";
	}
	
	public List<Tv> gettv(){
		return r.findAll();
	}
	
	public Tv getid(int a) {
		return r.findById(a).get();
	}
	
	public String deleteid(int id) {
		 r.deleteById(id);
		 return "Deleted Sucessfully";
		
	}
	
	public String putid(int id, Tv v) {
		Tv s=r.findById(id).get();
		s.setBrand(v.getBrand());
		s.setModel(v.getModel());
		s.setInches(v.getInches());
		s.setPrice(v.getPrice());
		
		r.save(s);
		return "Updated Sucessfully";
	}

	public List<Tv> getbymodel(String a) {
		return r.getbymodel(a);
	}

	public List<Tv> getprice() {
		
		return r.getprice();
	}

	public List<Tv> getbrand(String a) {
		
		return r.getbrand(a);
	}

	public List<Tv> getminprice() {
		
		return r.getminprice();
	}

	public List<Tv> getinch(int a) {
		
		return r.getinch(a);
	}

	public List<String> getbrandlen(int a) {
		
		return r.getbrandlen(a);
	}

	public List<Tv> getPriceRange(int n1, int n2) {
		return r.getPriceRange(n1,n2);
	}

	public List<Tv> getBrandname(String a) {
		
		return r.getBrandname(a);
	}

	public List<Tv> getvalue(String a) {
		
		return r.getvalue(a);
	}

	public List<Tv> getp(int a) {
		
		return r.getp(a);
	}

	public List<Tv> getname(String a) {
		
		return r.getname(a);
	}

}
