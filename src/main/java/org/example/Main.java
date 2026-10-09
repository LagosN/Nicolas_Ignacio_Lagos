package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        GestordeVivienda gestor  = new GestordeVivienda( );
        List<Vivienda> viviendas = new ArrayList<>();

        gestor.cargarViviendas();

        // Profe intente usar la lista pre cargada en la clase gestor, no puede e intete agregar por gestor.//
        Departamentos depto1 = new Departamentos("PROP-DO1", 65,3,8);
        Departamentos depto2 = new Departamentos("PROP-DO2", 48,2,3);
        Casa casa1 =  new Casa("PROP-C01", 120, 4,true);
        Casa casa2 =  new Casa("PROP-C02", 90, 3,false);


        gestor.agregarVivienda(depto1);
        gestor.agregarVivienda(depto2);
        gestor.agregarVivienda(casa1);
        gestor.agregarVivienda(casa2);


        System.out.println(gestor.buscadorVivienda(depto1));
        System.out.println(gestor.buscadorVivienda(depto2));
        System.out.println(gestor.buscadorVivienda(casa1));
        System.out.println(gestor.buscadorVivienda(casa2));













    }

}