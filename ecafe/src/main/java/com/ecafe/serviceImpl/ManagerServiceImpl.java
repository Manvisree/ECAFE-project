package com.ecafe.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecafe.entity.CafeCombo;
import com.ecafe.entity.CafeItem;
import com.ecafe.entity.Offer;
import com.ecafe.exception.ComboNotFoundException;
import com.ecafe.exception.ItemNotFoundExcpetion;
import com.ecafe.exception.OfferNotFoundException;
import com.ecafe.model.CafeComboModel;
import com.ecafe.model.CafeItemModel;
import com.ecafe.model.OfferModel;
import com.ecafe.repository.CafeComboRepository;
import com.ecafe.repository.CafeItemRepository;
import com.ecafe.repository.ManagerRepository;
import com.ecafe.repository.OfferRepository;
import com.ecafe.service.IManagerService;

@Service
public class ManagerServiceImpl  implements IManagerService{
	
	@Autowired
	private CafeItemRepository repo;
	@Autowired
	private CafeComboRepository comborepo;
	@Autowired
	private OfferRepository offerrepo;

	@Override
	public CafeItem addItem(CafeItem cafeitem) {
		// TODO Auto-generated method stub
		CafeItem save=this.repo.save(cafeitem);
		return save;
	}
	
	@Override
	public CafeCombo addCombo(CafeCombo cafecombo) {
		// TODO Auto-generated method stub
		CafeCombo save=this.comborepo.save(cafecombo);
		return save;
	}
	
	@Override
	public Offer addOffer(Offer offer) {
		// TODO Auto-generated method stub
		Offer save=this.offerrepo.save(offer);
		return save;
	}

	@Override
	public CafeItem updateItem(CafeItemModel cafeitemmodel) throws ItemNotFoundExcpetion{
		// TODO Auto-generated method stub
		Optional<CafeItem> cafeItem1=this.repo.findById(cafeitemmodel.getItemId());
		if(cafeItem1.isPresent()){
		CafeItem cafeItem=new CafeItem();
		cafeItem.setItemId(cafeitemmodel.getItemId());
		cafeItem.setName(cafeitemmodel.getName());
		cafeItem.setImageUrl(cafeitemmodel.getImageUrl());
		cafeItem.setDetail(cafeitemmodel.getDetail());
		cafeItem.setType(cafeitemmodel.getType());
		cafeItem.setAmount(cafeitemmodel.getAmount());
		return this.repo.save(cafeItem);
		}
		else {
			throw new ItemNotFoundExcpetion("Item you are trying to update is not found");
		}
		
	}
	@Override
	public CafeCombo updateCombo(CafeComboModel cafecombomodel) throws ComboNotFoundException {
		// TODO Auto-generated method stub
		Optional<CafeCombo> cafecombo1=this.comborepo.findById(cafecombomodel.getComboId());
		if(cafecombo1.isPresent()) {
		CafeCombo cafecombo=new CafeCombo();
		cafecombo.setComboId(cafecombomodel.getComboId());
		cafecombo.setName(cafecombomodel.getName());
		cafecombo.setType(cafecombomodel.getType());
		cafecombo.setDetail(cafecombomodel.getDetail());
		cafecombo.setAmount(cafecombomodel.getAmount());
		cafecombo.setType(cafecombomodel.getType());
		return this.comborepo.save(cafecombo);
		}
		else {
			throw new ComboNotFoundException("Combo you are trying to update is not found");
		}
		
	}
	
	@Override
	public CafeItem deleteItem(CafeItem cafeItem) throws ItemNotFoundExcpetion {
		// TODO Auto-generated method stub
		Optional<CafeItem> cafeItem1=this.repo.findById(cafeItem.getItemId());
		if(cafeItem1.isPresent()) {
		this.repo.deleteById(cafeItem.getItemId());
		return cafeItem;
		}
		else {
			throw new ItemNotFoundExcpetion("Item you are trying to delete is not present");
		}
	}


	@Override
	public CafeCombo deleteCombo(CafeCombo cafecombo) throws ComboNotFoundException {
		// TODO Auto-generated method stub
		Optional<CafeCombo> cafecombo1=this.comborepo.findById(cafecombo.getComboId());
		if(cafecombo1.isPresent()) {
		this.comborepo.deleteById(cafecombo.getComboId());
		return cafecombo;
		}
		else {
			throw new ComboNotFoundException("Combo you are trying to delete is not present");
		}
	}
	


	@Override
	public Offer updateOffer(OfferModel offermodel) throws OfferNotFoundException{
		// TODO Auto-generated method stub
		Optional<Offer> offer1=this.offerrepo.findById(offermodel.getOfferId());
		if(offer1.isPresent()) {
		Offer offer=new Offer();
		offer.setOfferId(offermodel.getOfferId());
		offer.setDetial(offermodel.getDetial());
		offer.setEnables(offermodel.isEnables());
		offer.setOfferCode(offermodel.getOfferCode());
		offer.setOffertype(offermodel.getOffertype());
		offer.setOfferValue(offermodel.getOfferValue());
		offer.setValidTill(offermodel.getValidTill());
		return this.offerrepo.save(offer);
		}
		else {
			throw new OfferNotFoundException("Offer you are trying to update is not found");
		}
	}

	@Override
	public Offer removeOffer(Offer removeoffer) throws OfferNotFoundException{
		// TODO Auto-generated method stub
		Optional<Offer> offer=this.offerrepo.findById(removeoffer.getOfferId());
		if(offer.isPresent()) {
		this.offerrepo.deleteById(removeoffer.getOfferId());
		return removeoffer;
		}
		else {
			throw new OfferNotFoundException("Offer you are trying to delete is not present");
		}
	}

	

	

	


	

}
