package com.greedy.music.view;

import java.util.List;
import java.util.Scanner;

import com.greedy.music.controller.BasketController;
import com.greedy.music.model.dto.ShoppingBasketDTO;



public class BasketMenu {

	private BasketController basketController = new BasketController();
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		
		mainMenu:
		while (true) {
			System.out.println("========메뉴==========");
			System.out.println("1.장바구니 상품 추가");
			System.out.println("2.장바구니 전체 상품 조회");
			System.out.println("3.상품명 조회");
			System.out.println("4.상품 삭제");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch (menu) {
			
			case 1 :
				addList();
				break;
			case 2 :
				selectList();
				break;
			case 3 :
				searchProduct();
				break;
			case 4 :
				removeBasket();
				break;
			case 0 :
				System.out.println("프로그램을 종료합니다.");
				break mainMenu;
	
			}
			
	}
		

	
	}

	public void addList() {
		System.out.println("====상품 추가====");
		System.out.print("상품 이름 입력 : ");
		String product = sc.next();
		System.out.print("가격 입력 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		basketController.addList(new ShoppingBasketDTO(product, price));
		
	}

	public void selectList() {
		System.out.println("=====상품 전체 조회====");
		List<ShoppingBasketDTO> basketList = basketController.searchProduct("");
		
		
		if(!basketList.isEmpty()) {
			for(ShoppingBasketDTO product : basketList){
				System.out.println(product);
			}
		} else {
			System.out.println("목록이 존재하지 않습니다.");
		}
	}

	public void searchProduct() {
		System.out.println("===상품명으로 검색====");
		System.out.print("상품명 입력 : ");
		List<ShoppingBasketDTO> searchList = basketController.searchProduct(sc.next());
	
		if(!searchList.isEmpty()) {
			for(int i = 0; i < searchList.size(); i++) {
				System.out.println(searchList.get(i));
			} 
		} else {
			System.out.println("검색 결과가 없습니다.");
		}
	
	}

	public void removeBasket() {
		System.out.println("====상품 삭제====");
		System.out.print("삭제 할 곡의 제목 : ");
		int result = basketController.removeBasket(sc.nextLine());
		
		if(result > 0) {
			System.out.println("성공적으로 삭제 되었습니다.");
		} else {
			System.out.println("삭제할 곡을 찾지 못했습니다.");
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
