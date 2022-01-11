package com.greedy.music.controller;

import java.util.ArrayList;
import java.util.List;

import com.greedy.music.model.dto.ShoppingBasketDTO;

public class BasketController {

	private List<ShoppingBasketDTO> basketList = new ArrayList<>(); 
	
	//장바구니 상품 추가
	public void addList(ShoppingBasketDTO basket) {
		basketList.add(basket);
	}
	
	
	//장바구니 전체 상품 조회
	public List<ShoppingBasketDTO> selectList() {
		return basketList;
	}
	
	
	//상품명 조회
	public List<ShoppingBasketDTO> searchProduct(String product) {
		
		List<ShoppingBasketDTO> searchList = new ArrayList<>();
		
		for(ShoppingBasketDTO basket : basketList) {
			
			if(basket.getProduct().contains(product)) {
				searchList.add(basket);
			}
		}
		return searchList;
	}
	
	
	//상품 삭제
	public int removeBasket(String product) {
		ShoppingBasketDTO old = null;
		for(int i = 0; i <basketList.size(); i++) {
			
			if(basketList.get(i).getProduct().equals(product)) {
				
				old = basketList.remove(i);
			}
		}
		return old != null ? 1 : 0;
	}



		
	}
	
	
	
	
	

