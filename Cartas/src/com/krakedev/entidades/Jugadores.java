package com.krakedev.entidades;

import java.util.ArrayList;

import com.krakedev.servicios.Juego;

public class Jugadores {
	ArrayList<String> jugadores;
	
	public Jugadores() {
        this.jugadores = new ArrayList<>();
    }

	public ArrayList<String> getJugadores() {
		return jugadores;
	}
	public void setJugadores(ArrayList<String> jugadores) {
		this.jugadores = jugadores;
	}
	
	
	public void jugar() {
        jugadores.add("Jugador 1");
        jugadores.add("Jugador 2");
        jugadores.add("Jugador 3");

        Juego juego = new Juego(jugadores);
        juego.entregarCartas(5);

        int total = 0;
        for (int i = 0; i < jugadores.size(); i++) {
            total += i;
            System.out.println("Jugador " + (i + 1) + ": " + i);
        }

    }

}
