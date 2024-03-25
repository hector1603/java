package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private ArrayList<Celda> celdas;
	private double saldo;

	public MaquinaDulces() {
		celdas = new ArrayList<Celda>();
	}

	public void agregarCelda(Celda celda) {
		celdas.add(celda);
	}

	public void mostrarConfiguracion() {
		Celda elementoCelda;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			System.out.println("Celda " + (i + 1) + ": " + elementoCelda.getCodigoCelda());
		}
	}

	public Celda buscarCelda(String codigoCelda) {
		Celda celdaEncontrada = null;
		Celda elementoCelda;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);

			if (codigoCelda.equals(elementoCelda.getCodigoCelda())) {
				celdaEncontrada = elementoCelda;
			}
		}
		return celdaEncontrada;
	}

	public void cargarProducto(Producto producto, String codigoCelda, int stockInicial) {
		Celda celdaRecuperada = buscarCelda(codigoCelda);
		celdaRecuperada.ingresarProducto(producto, stockInicial);
	}

	public void mostrarProductos() {
		Celda elementoCelda;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			System.out.print("Codigo: " + elementoCelda.getCodigoCelda() + " Stock: " + elementoCelda.getStock());
			if (elementoCelda.getProducto() != null) {
				System.out.println(" Producto: " + elementoCelda.getProducto().getNombre()
						+ " Precio: " + elementoCelda.getProducto().getPrecio());
			} else {
				System.out.println(" Sin producto asignado");
			}
		}
		System.out.println("Saldo: " + saldo);
		
	}
	
	public Producto buscarProductoEnCelda(String codigoCelda) {
		Celda elementoCelda;
		Producto productoEncontrado = null;
		for(int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			if(codigoCelda == elementoCelda.getCodigoCelda()) {
				productoEncontrado = elementoCelda.getProducto();
			}
		}
		return productoEncontrado;
	}
	
	public double consultarPrecio(String codigoCelda) {
		Celda elementoCelda;
		double precio = 0;
		for(int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			if(codigoCelda.equals(elementoCelda.getCodigoCelda())) {
				precio = elementoCelda.getProducto().getPrecio();
			}
		}
		return precio;
	}
	
	public Celda buscarCeldaProducto(String codigoProducto) {
		Celda elementoCelda = null;
		for(int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			
			if(elementoCelda.getProducto() != null && codigoProducto == elementoCelda.getProducto().getCodigoProducto()) {
				return elementoCelda;
			}
		}
		return elementoCelda;
	}
	
	public void incrementarProductos(String codigoProducto, int cantidadItem) {
		Celda celdaEncontrada = buscarCeldaProducto(codigoProducto); 
		celdaEncontrada.setStock(cantidadItem + celdaEncontrada.getStock());;
	}
	
	public void vender(String codigoCelda) {
		Celda elementoCelda;
		for(int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			
			if(codigoCelda.equals(elementoCelda.getCodigoCelda())) {
				elementoCelda.setStock(elementoCelda.getStock()-1);
				double precio = elementoCelda.getProducto().getPrecio();
				saldo = saldo + precio;
				
			}
		}
	}
	
	public double venderConCambio(String codigoCelda, double valor) {
		Celda elementoCelda;
		double cambio = 0;
		for(int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			if(codigoCelda.equals(elementoCelda.getCodigoCelda())) {
				elementoCelda.setStock(elementoCelda.getStock()-1);
				cambio = elementoCelda.getProducto().getPrecio();
				cambio = valor - cambio;
			}
		}
		return cambio;
	}
	
	public ArrayList<Producto> buscarMenores(double limite) {
		ArrayList<Producto> menores = new ArrayList<Producto>();
		Celda elementoCelda;
		
		for(int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			if(elementoCelda.getProducto().getPrecio() <= limite) {
				menores.add(elementoCelda.getProducto());
				System.out.println("Nombre: " + elementoCelda.getProducto().getNombre() + " Precio: " + elementoCelda.getProducto().getPrecio());
			}
		}
		return menores;
	}
}
