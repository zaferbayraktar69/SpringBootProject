package com.spring.spring.ModelController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.spring.Model.Urun;
import com.spring.spring.Model.UrunService;

@Controller
public class AppController {

	@Autowired
	private UrunService service;
	
	@RequestMapping("/")
	public String anaSayfaGoster(Model model) {	
		List<Urun> urunleriGetir = service.urunleriGetir();
		model.addAttribute("urunleriGetir",urunleriGetir);
		return "AnaSayfa";
	}
	
	@RequestMapping("/yenikayit")
	public String yeniUrunEkle(Model model) {	
		Urun urun = new Urun();
		model.addAttribute("urun",urun);
		return "urunEkle";
	}
	
	@RequestMapping("/kaydet")
	public String kaydetUrun(@ModelAttribute("urun") Urun urun) {
		service.kaydet(urun);
		return "redirect:/";
	}


	
	@RequestMapping("/duzenle/{id}")
	public ModelAndView urunDuzenle(@PathVariable(name="id") Long id) {	
		ModelAndView mav = new ModelAndView("duzenle");
		
		Urun urun = service.urunGetir(id);
		mav.addObject("urun", urun);
		return mav;
	}
	
	@RequestMapping("/sil/{id}")
	public String silUrun(@PathVariable("id") Long id,Model	model) {
		service.urunSil(id);
		return "redirect:/";
	}
	

}
