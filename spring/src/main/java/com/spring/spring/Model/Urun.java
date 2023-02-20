package com.spring.spring.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Urun {
	
	private Long id;
	private String ad;
	private String marka;
	private String uretimyeri;
	private float fiyat;
	
	
	public Urun() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getAd() {
		return ad;
	}


	public void setAd(String ad) {
		this.ad = ad;
	}


	public String getMarka() {
		return marka;
	}


	public void setMarka(String marka) {
		this.marka = marka;
	}


	public String getUretimyeri() {
		return uretimyeri;
	}


	public void setUretimyeri(String uretimYeri) {
		this.uretimyeri = uretimYeri;
	}


	public float getFiyat() {
		return fiyat;
	}


	public void setFiyat(float fiyat) {
		this.fiyat = fiyat;
	}
	
	
	
	

}
