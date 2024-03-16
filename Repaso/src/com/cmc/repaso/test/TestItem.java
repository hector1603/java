package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {
	public static void main(String [] args) {
		Item item1 = new Item("Galleta");
		Item item2 = new Item("Pollo");
		
		item1.setProductosActuales(20);
		item1.imprimir();
		
		item1.vender(9);
		item1.devolver(8);
		
		item1.imprimir();
		
		System.out.println("------ Item 2 " + item2.getNombre() + " ------");
		item2.setProductosActuales(35);
		item2.imprimir();
		
		item2.vender(20);
		item2.devolver(5);
		
		item2.imprimir();
	}
}
