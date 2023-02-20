package com.spring.spring.Model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UrunService {
	
	@Autowired
	private UrunRepository repo;
	
	
	public List<Urun> urunleriGetir(){
		return repo.findAll();
	}
	
	public void kaydet(Urun urun) {
		repo.save(urun);
	}
	
	public Urun urunGetir(Long id) {
		return repo.findById(id).get();
	}
	
	
	public void urunSil(Long id) {
		repo.deleteById(id);
	}
	
	
	public void urunDuzenle(Long id) {
		repo.deleteById(id);
		
	}

}
