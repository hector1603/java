package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.utils.Convertidor;

public class TestActualizar {

    public static void main(String[] args) {
        try {
             //Crear una instancia de Persona con los datos a actualizar
            Persona persona = new Persona();
            persona.setCedula("94801580");
            persona.setNombre("Daniel");
            persona.setApellido("Salamanca");

            // Convertir fecha y hora a objetos Date
            Date fechaNacimiento = Convertidor.convertirFecha("1994/03/16");
            Date horaNacimiento = Convertidor.convertirHora("09:26");
            persona.setFechaNacimiento(fechaNacimiento);
            persona.setHoraNacimiento(horaNacimiento);
            persona.setEstatura(1.55);
            persona.setNumeroHijos(2);
            persona.setCantidadAhorrada(new BigDecimal(3241.51));

            // Crear una instancia de EstadoCivil y establecer el código
            EstadoCivil estadoCivil = new EstadoCivil();
            estadoCivil.setCodigo("C");
            persona.setEstadoCivil(estadoCivil);

            // Llamar al método actualizar en AdminPersonas con la instancia de Persona
            AdminPersonas.actualizar(persona);

            System.out.println("Persona actualizada exitosamente.");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}

