package com.krakedev.servicios;

import java.util.ArrayList;

import com.krakedev.entidades.Carta;
import com.krakedev.entidades.Naipe;

public class Juego {
	private Naipe naipe;
	private ArrayList<ArrayList<Carta>> cartasJugador;
	private ArrayList<Carta> naipeBarajado;
	
	public Juego(ArrayList<String> idJugadores) {
        cartasJugador = new ArrayList<>();
        
        Naipe naipe = new Naipe();
        naipeBarajado = naipe.barajar();

        for (String idJugador : idJugadores) {
            ArrayList<Carta> cartasJugador = new ArrayList<>();
            this.cartasJugador.add(cartasJugador);
        }
    }

	public ArrayList<ArrayList<Carta>> getCartasJugador() {
		return cartasJugador;
	}

	public void entregarCartas(int cartasPorJugador) {
        for (int i = 0; i < cartasPorJugador; i++) {
            for (int j = 0; j < cartasJugador.size(); j++) {
                ArrayList<Carta> manoJugador = cartasJugador.get(j);
                if (manoJugador == null) {
                    manoJugador = new ArrayList<>();
                    cartasJugador.add(manoJugador);
                }
                if (!naipeBarajado.isEmpty()) {
                    manoJugador.add(naipeBarajado.remove(0));
                }
            }
        }
    }
	
	public int devolverTotal(int idJugador) {
        if (idJugador < 0 || idJugador >= cartasJugador.size()) {
            return -1;
        }
        int total = 0;
        ArrayList<Carta> manoJugador = cartasJugador.get(idJugador);
        for (Carta carta : manoJugador) {
            total += carta.getNumero().getValor();
        }
        return total;
    }
	
	public int determinarGanador() {
        if (cartasJugador.isEmpty()) {
            return -1;
        }
        int idGanador = 0; 
        int sumaGanador = devolverTotal(0);
        for (int i = 1; i < cartasJugador.size(); i++) {
            int sumaJugadorActual = devolverTotal(i);
            if (sumaJugadorActual > sumaGanador) {
                idGanador = i;
                sumaGanador = sumaJugadorActual;
            }
        }
        return idGanador;
    }
}
