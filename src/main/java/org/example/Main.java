package org.example;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
         GestordeVivienda gestor  = new GestordeVivienda( );


        try {

            Departamento depto1 = new Departamento("PROP-D01", 65, 3, 8);

            Departamento depto2 = new Departamento("PROP-D02", 48, 2, 3);

            Casa casa1 = new Casa("PROP-C01", 120, 4, true);

            Casa casa2 = new Casa("PROP-C02", 90, 3, false);

            gestor.agregarVivienda(depto1);
            gestor.agregarVivienda(depto2);
            gestor.agregarVivienda(casa1);
            gestor.agregarVivienda(casa2);
            depto1.asignarEstacionamiento(true);

        } catch (IllegalArgumentException error) {
            System.out.println("Error" +error);
        }



        System.out.println();
        System.out.println();
        System.out.println();



        System.out.println("Busqueda por Codigo: PROP-001 ");

        System.out.println(gestor.buscadorVivienda("PROP-D01"));

        System.out.println();
        System.out.println();
        System.out.println();


        System.out.println("Listado de Viviendas");
        for (Vivienda vivienda: gestor.getViviendas())
            System.out.println(vivienda);
            System.out.println();













    }

}