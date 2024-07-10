package com.example.Electronics.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.Electronics.Entity.Tv;
import com.example.Electronics.Service.TvService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;



@RequestMapping(value="/TV")
@RestController
public class TvController {

	@Autowired
	TvService tv;
	
	@PostMapping(value= "/posttv")
	public String posttv(@RequestBody Tv t) {
		
		return tv.posttv(t);
	}
		
	@GetMapping(value="/gettv")
	public List<Tv>gettv(){
		return tv.gettv();
	}
	
	@GetMapping("/getid/{a}")
	public Tv getid(@PathVariable int a) {
		return tv.getid(a);
	}
	
	@DeleteMapping(value="/deleteid/{id}")
	public String deleteid(@PathVariable int id) {
		return tv.deleteid(id);
	}
	
	@PutMapping("putvalue/{id}")
	public String putid(@PathVariable int id, @RequestBody Tv v) {
		
		return tv.putid(id, v);
	}
	@GetMapping("/getTvBrands")
	public List<String> getBrand(){
		return tv.getBrand();
	}
	@GetMapping("/getModel/{a}")
	public List<Tv> getbymodel(@PathVariable String a){
		return tv.getbymodel(a);
	}
	@GetMapping("/getmax")
	public List<Tv> getprice(){
		return tv.getprice();
	}
	@GetMapping("/getbrand/{a}")
	public List<Tv> getbrand(@PathVariable String a){
		return tv.getbrand(a);
	}
	
	@GetMapping("/getmin")
	public List<Tv> getminprice(){
		return tv.getminprice();
	}
	
	@GetMapping("/getinch/{a}")
	public List<Tv> getinch(@PathVariable int a) {
		return tv.getinch(a);
	}
	
	@GetMapping("/getlength/{a}")
	public List<String> getbrandlen(@PathVariable int a) {
		return tv.getbrandlen(a);
	}
	
	//<--------------jQuery---------------------->
	
	@GetMapping(value="/getPriceRange/{n1}/{n2}")
	public List<Tv> getPriceRange(@PathVariable int n1,@PathVariable int n2){
		return tv.getPriceRange(n1,n2);
	}
	
	@GetMapping("/Brand/{a}")
	public List<Tv> getBrandname(@PathVariable String a) {
		return tv.getBrandname(a);
	}
	
	@GetMapping("/getval/{a}")
	public List<Tv> getvalue(@PathVariable String a){
		return tv.getvalue(a);
	}
	@GetMapping("/price/{a}")
	public  List<Tv> getp(@PathVariable int a) {
		return tv.getp(a);
	}
	@GetMapping("/brandname/{a}")
	public List<Tv> getname(@PathVariable String a){
		return tv.getname(a);
	}
	
	
	
	
}
