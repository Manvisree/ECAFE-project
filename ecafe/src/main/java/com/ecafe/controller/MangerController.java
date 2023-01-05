package com.ecafe.controller;


//import java.util.logging.Logger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecafe.entity.CafeCombo;
import com.ecafe.entity.CafeItem;
import com.ecafe.entity.Offer;
import com.ecafe.exception.ComboNotFoundException;
import com.ecafe.exception.ErrorDetails;
import com.ecafe.exception.ItemNotFoundExcpetion;
import com.ecafe.exception.OfferNotFoundException;
import com.ecafe.model.CafeComboModel;
import com.ecafe.model.CafeItemModel;
import com.ecafe.model.OfferModel;
import com.ecafe.service.IManagerService;

@RestController
@RequestMapping("/manager")
public class MangerController {
	@Autowired
	private IManagerService service;
	final Logger logger=LoggerFactory.getLogger(ErrorDetails.class);
	
	@PostMapping("/add")
	public CafeItem addCafeItem(@RequestBody CafeItem cafeitem) {
		CafeItem additem=this.service.addItem(cafeitem);
		return additem;
		}
	
	
	
	@PutMapping("/update")
	public CafeItem updateItem(@RequestBody CafeItemModel cafeitemmodel){
		CafeItem updateitem = null;
		try {
			updateitem = this.service.updateItem(cafeitemmodel);
		} catch (ItemNotFoundExcpetion e) {
			// TODO Auto-generated catch block
			logger.info(e.getMessage());
		}
		return updateitem;
		}
	

	@DeleteMapping("/delete")
	public CafeItem deleteCafeItem(@RequestBody CafeItem cafeitem)  {
		CafeItem deleteitem=null;
		try {
			deleteitem = this.service.deleteItem(cafeitem);
		} catch (ItemNotFoundExcpetion e) {
			// TODO Auto-generated catch block
			logger.info(e.getMessage());
		}
		return deleteitem;
		
	}
	
	@PostMapping("/addcombo")
	public CafeCombo addCafeCombo(@RequestBody CafeCombo cafecombo) {
		CafeCombo addcombo=this.service.addCombo(cafecombo);
		return addcombo;
		}
	
	@PutMapping("/updatecombo")
	public CafeCombo updateCafeCombo(@RequestBody CafeComboModel cafecombomodel) {
		CafeCombo updatecombo=null;
		try {
			updatecombo = this.service.updateCombo(cafecombomodel);
		} catch (ComboNotFoundException e) {
			// TODO Auto-generated catch block
			logger.info(e.getMessage());
		}
		return updatecombo;
		}
	
	@DeleteMapping("/deletecombo")
	public CafeCombo deleteCafeCombo(@RequestBody CafeCombo cafecombo) {
		CafeCombo deletecombo=null;
		try {
			deletecombo = this.service.deleteCombo(cafecombo);
		} catch (ComboNotFoundException e) {
			// TODO Auto-generated catch block
			logger.info(e.getMessage());
		}
		return deletecombo;
		
	}
	
	
	@PostMapping("/addoffer")
	public Offer addOffer(@RequestBody Offer offer) {
		Offer addoffer=this.service.addOffer(offer);
		return offer;
		
	}
	
	
	@PutMapping("/updateoffer")
	public Offer  updateOffer(@RequestBody OfferModel offermodel) {
		Offer updateoffer=null;
		try {
			updateoffer = this.service.updateOffer(offermodel);
		} catch (OfferNotFoundException e) {
			// TODO Auto-generated catch block
			logger.info(e.getMessage());
		}
		return updateoffer;
	}
	
	
	@DeleteMapping("/deleteoffer")
	public Offer removeOffer(@RequestBody Offer offer) {
		Offer removeoffer=null;
		try {
			removeoffer = this.service.removeOffer(offer);
		} catch (OfferNotFoundException e) {
			// TODO Auto-generated catch block
			logger.info(e.getMessage());
		}
		return removeoffer;
		
	}

}
