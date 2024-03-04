package com.infomatech.projet.ProjetRestauration.ApiRest;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infomatech.projet.ProjetRestauration.Entities.Famille;
import com.infomatech.projet.ProjetRestauration.Entities.Produit;
import com.infomatech.projet.ProjetRestauration.Service.IserviceFamille;
import com.infomatech.projet.ProjetRestauration.Service.IserviceProduit;

import lombok.AllArgsConstructor;

@CrossOrigin("*")
@RestController
@AllArgsConstructor
@RequestMapping("/apicaisse")
public class restcontroller {
	private IserviceProduit sp;
	private IserviceFamille sf;
	@GetMapping("/produits")
		public List<Produit> getProduct(){
	
		return sp.getAllProduits();
	}
	@GetMapping("/familles")
	public List<Famille> getFamille(){
	return sf.getAllFamilles();
}
	@GetMapping("/hello")
	public String sayhello() {
		return "hello";
	}
	
	
	 

}
