package com.example.Electronics.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.Electronics.Dao.AcDao;
import com.example.Electronics.Entity.Ac;

@Service
public class AcService {
	@Autowired
	AcDao d;
	
	public String postac(Ac a) {
		return d.postac(a);
	}
	
	public List<Ac> getac(){
		return d.getac();
	}
	
	public Ac getid(@PathVariable int id) {
		return d.getid(id);
	}
	
	public String deleteid(int a) {
		return d.deleteid(a);
	}
	public String putac(int id,Ac a) {
		return d.putac(id,a);
	}

	public List<String> getBrands(){
		List<Ac> x= d.getac();
		List<String> s=x.stream().map(q->q.getBrand()).collect(Collectors.toList());
		List<String> p=x.stream().filter(r->r.getBrand().equalsIgnoreCase("cromaa")).map(e->e.getBrand()).collect(Collectors.toList());
		return p;
	}
	
	
	public List<Integer> getPrice(){
		
		List<Ac> w=d.getac();
		List<Integer> j=w.stream().map(h->h.getPrice()).collect(Collectors.toList());
		List<Integer> f=w.stream().filter(b->b.getPrice()>50000).map(p->p.getPrice()).collect(Collectors.toList());
			return f;
	}

	public List<Ac> getBrand(String a) {
		List<Ac> c=d.getac();
		List<Ac> compare=c.stream().filter(k->k.getBrand().equalsIgnoreCase(a)).collect(Collectors.toList());
		return compare;
	}

	

	public List<Ac> getList(long a, long b) {
		List<Ac> t=d.getac();
		List<Ac> find=t.stream().filter(q->q.getPrice()>a&&q.getPrice()<b).collect(Collectors.toList());
		return find;
	}

	public List<Ac> getModel(String a) {
		List<Ac> u=d.getac();
		List<Ac> get=u.stream().filter(j->j.getModel().startsWith(a)).collect(Collectors.toList());
		return get;
	}

	public List<Ac> getdis(int b) {
		List<Ac> r=d.getac();
		List<Ac>dis=r.stream().map(z->{ int disprice=z.getPrice()-(z.getPrice()*b/100);
		z.setPrice(disprice);
		return z;}).collect(Collectors.toList());
		return dis;
		
	}

	public List<Ac> getTax(int c) {
		List<Ac>a=d.getac();
		List<Ac>tax=a.stream().map(h->{int taxprice=h.getPrice()+(h.getPrice()*c/100);
		h.setPrice(taxprice);
		return h;}).collect(Collectors.toList());
		return tax;
	}

	public List<Ac>getdisbrand(String h){
		List<Ac> w=d.getac();
		List<Ac>disbrand=w.stream().filter(f->f.getBrand().equalsIgnoreCase(h)).
				map(j->{int disprice=j.getPrice()-(j.getPrice()*8/100);
		j.setPrice(disprice);
		return j;}).collect(Collectors.toList());
		return disbrand;
	}

}

