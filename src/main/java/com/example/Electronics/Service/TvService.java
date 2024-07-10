package com.example.Electronics.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.Electronics.Dao.TvDao;
import com.example.Electronics.Entity.Tv;

@Service
public class TvService {
	
	@Autowired
	TvDao d;
	
	public String posttv(Tv t) {
		return d.posttv(t);
	}
	
	public List<Tv>gettv(){
		return d.gettv();
	}
	
	public Tv getid(@PathVariable int a) {
		return d.getid(a);
		
	}
	
	public String deleteid(int id) {
		return d.deleteid(id);
	}
	
	public String putid(int id,Tv v) {
		return d.putid(id,v);
	}

	public List<String> getBrand() {
		List<Tv>x=d.gettv();
		List<String>y=x.stream().map(v->v.getBrand()).collect(Collectors.toList());
		return y;
	}

	
	public List<Tv> getbymodel(String a) {
		
		return d.getbymodel(a);
	}

	public List<Tv> getprice() {
		
		return d.getprice();
	}

	public List<Tv> getbrand(String a) {
		
		return d.getbrand(a);
	}

	public List<Tv> getminprice() {
		
		return d.getminprice();
	}

	public List<Tv> getinch(int a) {
		
		return d.getinch(a);
	}

	public List<String> getbrandlen(int a) {
		
		return d.getbrandlen(a);
	}

	public List<Tv> getPriceRange(int n1, int n2) {
		return d.getPriceRange(n1,n2);
	}

	public List<Tv> getBrandname(String a) {
		
		return d.getBrandname(a);
	}

	public List<Tv> getvalue(String a) {
		
		return d.getvalue(a);
	}

	public List<Tv> getp(int a) {
		
		return d.getp(a);
	}

	public List<Tv> getname(String a) {
		 return d.getname(a);
	}

	
}
