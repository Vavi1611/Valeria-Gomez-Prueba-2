/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba2.Dto;

import Modelos.Avion;
import Modelos.VEHICULOAEREO;
import java.time.LocalDate;

/**
 *
 * @author 56955
 */
public class Dto {
    
    public void avionesDTO(){
        Avion Avion = new Avion();
        VEHICULOAEREO Avioneta = new Avioneta();
        VEHICULOAEREO Carguero = new Carguero();
    }
    
    public void pasajesDTO(){
        Pasaje pasaje = new Pasaje();
        Pasajero pasajero = new Pasajero();
    }
    
    public void testToString()
    {
        VEHICULOAEREO Avion = new Avion("El veloz del cielo", 100, true, LocalDate.of(2022, 05, 23), 44,"Vuela muy mal");
        String expected = "El veloz del cielo, #100, ultimo vuelo: 23/05/2022, total de horas: 44, Vuela muy mal";
        System.out.println("==================");
        System.out.println("Entregaste: "+Avion.toString());
        System.out.println("Debe ser  : "+expected);
        System.out.println("==================");
        
    }
}
