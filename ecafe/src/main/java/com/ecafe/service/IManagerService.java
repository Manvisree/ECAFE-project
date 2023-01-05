package com.ecafe.service;

import com.ecafe.entity.CafeCombo;
import com.ecafe.entity.CafeItem;
import com.ecafe.entity.Offer;
import com.ecafe.exception.ComboNotFoundException;
import com.ecafe.exception.ItemNotFoundExcpetion;
import com.ecafe.exception.OfferNotFoundException;
import com.ecafe.model.CafeComboModel;
import com.ecafe.model.CafeItemModel;
import com.ecafe.model.OfferModel;

public interface IManagerService {
	public CafeItem addItem(CafeItem cafeitem);
	public CafeCombo addCombo(CafeCombo cafecombo);
	public Offer addOffer(Offer offer);
	public CafeItem updateItem(CafeItemModel cafeitemmodel) throws ItemNotFoundExcpetion;
	public CafeCombo updateCombo(CafeComboModel cafecombomodel) throws ComboNotFoundException ;
	public CafeItem deleteItem(CafeItem cafeItem)throws ItemNotFoundExcpetion;
	public CafeCombo deleteCombo(CafeCombo cafecombo) throws ComboNotFoundException;
	public Offer updateOffer(OfferModel offermodel) throws OfferNotFoundException;
	public Offer removeOffer(Offer removeoffer)throws OfferNotFoundException;
	

}
