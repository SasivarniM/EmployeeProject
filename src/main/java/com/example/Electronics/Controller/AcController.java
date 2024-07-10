package com.example.Electronics.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.Electronics.Entity.Ac;
import com.example.Electronics.Service.AcService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@RequestMapping(value="/AC")
@RestController

public class AcController {
	@Autowired
	AcService ac;
	
	@PostMapping(value="/post")
	public String postac(@RequestBody  Ac a) {	
		return ac.postac(a);
	}
	
	@GetMapping(value="getAll")
	public List<Ac> getac(){
		return ac.getac();
	}
	
	@GetMapping("/getid/{id}")
	public Ac getid(@PathVariable int id) {
		return ac.getid(id);
	}
	
	@DeleteMapping("/deleteac/{a}")
	public String deleteid(@PathVariable int a) {
		return ac.deleteid(a);
	}
	
	@PutMapping("putac/{id}")
	public String putac(@PathVariable int id, @RequestBody Ac a) {
		return ac.putac(id,a);
	}
	
	@GetMapping(value="/getAllBrands")
	public List<String> getBrands(){
		return ac.getBrands();
	}
	
	@GetMapping("/getAcPrice")
	public List<Integer> getPrice(){
		return ac.getPrice();
	}
	
	
	@GetMapping("/getBrand/{a}")
	public List<Ac> getBrand(@PathVariable String a){
		return ac.getBrand(a);
	}
	
	@GetMapping("/getlist/{a}/{b}")
	public List<Ac> getList(@PathVariable long a,@PathVariable long b){
		return ac.getList(a, b);
	}
	
	@GetMapping("/getAll/{a}")
	public List<Ac> getModel(@PathVariable String a){
		return ac.getModel(a);
	}
	@GetMapping("/getdis/{b}")
	public List<Ac> getdis(@PathVariable int b){
		return ac.getdis(b);
		
	}
	@GetMapping("/gettax/{c}")
	public List<Ac>getTax(@PathVariable int c){
		return ac.getTax(c);
	}
	@GetMapping("/getdisbrand/{h}")
	public List<Ac> getdisbrand(@PathVariable String h) {
		return ac.getdisbrand(h);
	}
	
	
	
	
	
	
	
}
