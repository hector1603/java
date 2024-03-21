package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;

	public void configurarMaquina(String cod1, String cod2, String cod3, String cod4) {
		celda1 = new Celda(cod1);
		celda2 = new Celda(cod2);
		celda3 = new Celda(cod3);
		celda4 = new Celda(cod4);
	}

	public void mostrarConfiguracion() {
		System.out.println("Celda 1: " + celda1.getCodigo());
		System.out.println("Celda 2: " + celda2.getCodigo());
		System.out.println("Celda 3: " + celda3.getCodigo());
		System.out.println("Celda 4: " + celda4.getCodigo());
		//System.out.println("Saldo actual: " + saldo);
	}

	public Celda buscarCelda(String codigo) {
		if (codigo == celda1.getCodigo() && celda1 != null) {
			return celda1;
		} else if (codigo == celda2.getCodigo() && celda2 != null) {
			return celda2;
		} else if (codigo == celda3.getCodigo() && celda3 != null) {
			return celda3;
		} else if (codigo == celda4.getCodigo() && celda4 != null) {
			return celda4;
		} else {
			return null;
		}
	}

	public void cargarProducto(Producto producto, String codigo, int stock) {

		Celda celdaRecuperada = buscarCelda(codigo);
		if (celdaRecuperada != null) {
			celdaRecuperada.ingresarProducto(producto, stock);
		} else {
			System.out.println("La celda no tiene producto");
		}
	}

	public void mostrarProductos() {
		if (celda1 != null && celda1.getProducto() != null) {
			System.out.println("*****CELDA A1 ");

			System.out.println("Stock: " + celda1.getStock());
			System.out.println("Nombre: " + celda1.getProducto().getNombre());
			System.out.println("Precio: " + celda1.getProducto().getPrecio());
			System.out.println("Codigo Producto: " + celda1.getProducto().getCodigo());

		} else {
			System.out.println("*****CELDA A1 ");
			System.out.println("Stock: " + celda1.getStock());
			System.out.println("La celda no tiene producto");
		}

		if (celda2 != null && celda2.getProducto() != null) {
			System.out.println("*****CELDA A2 ");
			System.out.println("Stock: " + celda2.getStock());
			System.out.println("Nombre: " + celda2.getProducto().getNombre());
			System.out.println("Precio: " + celda2.getProducto().getPrecio());
			System.out.println("Codigo Producto: " + celda2.getProducto().getCodigo());
		} else {
			System.out.println("*****CELDA A2 ");
			System.out.println("Stock: " + celda2.getStock());
			System.out.println("La celda no tiene producto");
		}

		if (celda3 != null && celda3.getProducto() != null) {
			System.out.println("*****Celda B1 ");
			System.out.println("Stock: " + celda3.getStock());
			System.out.println("Nombre: " + celda3.getProducto().getNombre());
			System.out.println("Precio: " + celda3.getProducto().getPrecio());
			System.out.println("Codigo Producto: " + celda3.getProducto().getCodigo());
		} else {
			System.out.println("*****Celda B1 ");
			System.out.println("Stock: " + celda3.getStock());
			System.out.println("La celda no tiene producto");

		}

		if (celda4 != null && celda4.getProducto() != null) {
			System.out.println("*****Celda B2 ");
			System.out.println("Stock: " + celda4.getStock());
			System.out.println("Nombre: " + celda4.getProducto().getNombre());
			System.out.println("Precio: " + celda4.getProducto().getPrecio());
			System.out.println("Codigo Producto: " + celda4.getProducto().getCodigo());
		} else {
			System.out.println("*****Celda B2 ");
			System.out.println("Stock: " + celda4.getStock());
			System.out.println("La celda no tiene producto");
		}
		System.out.println("Saldo: " + saldo);
	}

	public Producto buscarProductoEnCelda(String codigoCelda) {
		Celda celda = buscarCelda(codigoCelda);
		if (celda != null) {
			return celda.getProducto();
		}
		return null;
	}

	public double consultarPrecio(String codigoCelda) {
		Producto producto = buscarProductoEnCelda(codigoCelda);
		if (producto != null) {
			return producto.getPrecio();
		}
		return 0.0;
	}

	public Celda buscarCeldaProducto(String codigo) {
		if (celda1 != null && celda1.getProducto() != null && celda1.getProducto().getCodigo() == codigo) {
			return celda1;
		} else if (celda2 != null && celda2.getProducto() != null && celda2.getProducto().getCodigo() == codigo) {
			return celda2;
		} else if (celda3 != null && celda3.getProducto() != null && celda3.getProducto().getCodigo() == codigo) {
			return celda3;
		} else if (celda4 != null && celda4.getProducto() != null && celda4.getProducto().getCodigo() == codigo) {
			return celda4;
		} else {
			return null;
		}
	}

	public void incrementarProductos(String codigo, int stock) {
		Celda celdaEncontrada = buscarCeldaProducto(codigo);
		celdaEncontrada.setStock(stock);
	}

	public void vender(String codigo) {
		Celda celda = buscarCelda(codigo);

		if (celda.getCodigo() != null && celda.getStock() > 0) {
			int stock = celda.getStock();
			celda.setStock(stock - 1);
			double precio = celda.getProducto().getPrecio();
			saldo += precio;
			mostrarProductos();
		}
	}

	public double venderConCambio(String codigo, int valor) {
		double cambio = 0;
		if (celda1 != null && celda1.getProducto() != null && celda1.getProducto().getCodigo() == codigo) {
			cambio = celda1.getStock()-1;
		} else if (celda2 != null && celda2.getProducto() != null && celda2.getProducto().getCodigo() == codigo) {
			cambio = celda2.getStock()-1;
		} else if (celda3 != null && celda3.getProducto() != null && celda3.getProducto().getCodigo() == codigo) {
			cambio = celda3.getStock()-1;
		} else if (celda4 != null && celda4.getProducto() != null && celda4.getProducto().getCodigo() == codigo) {
			cambio = celda4.getStock()-1;
		} else {
			return 0;
		}
		return cambio;
	}
}
