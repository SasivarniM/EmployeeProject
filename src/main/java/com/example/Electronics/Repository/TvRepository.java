package com.example.Electronics.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.Electronics.Entity.Tv;

public interface TvRepository extends JpaRepository<Tv, Integer> {
	
	@Query(value="select*from electronics.tvdetails where model=?",nativeQuery = true)
	public List<Tv> getbymodel(String a);
    
	@Query(value="select*from electronics.tvdetails where price=(select max(price) from tvdetails)",nativeQuery = true)
	public List<Tv> getprice();
    
	@Query(value="select*from electronics.tvdetails where brand=?",nativeQuery = true)
	public List<Tv> getbrand(String a);

	@Query(value ="select*from electronics.tvdetails where price=(select min(price) from tvdetails)",nativeQuery = true)
	public List<Tv> getminprice();

	@Query(value ="select*from electronics.tvdetails where inches=?",nativeQuery = true)
	public List<Tv> getinch(int a);

	@Query(value="select brand from tvdetails where length(brand)>?",nativeQuery = true)
	public List<String> getbrandlen(int a);

	@Query(value="select x from Tv x where x.price>:n1 and x.price<:n2")
	public List<Tv> getPriceRange(@Param("n1") int n1,@Param("n2") int n2);

	@Query(value="select c from Tv c where c.brand=:a ")
	public List<Tv> getBrandname(@Param("a") String a);

	@Query(value="select v from Tv v where v.model=:a")
	public List<Tv> getvalue(@Param("a") String a);

	@Query(value="select g from Tv g where g.price>:a")
	public List<Tv> getp(@Param("a") int a);

	@Query(value="select h from Tv h where h.brand like :a% ")
	public List<Tv> getname(@Param("a") String a);
     
	
}
