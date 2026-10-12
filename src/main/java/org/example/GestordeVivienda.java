package org.example;

import java.util.ArrayList;
import java.util.List;

public class GestordeVivienda {
    private List<Vivienda> viviendas = new ArrayList<>();

    public GestordeVivienda(List<Vivienda> viviendas) {
        if (viviendas == null) {
            throw new IllegalArgumentException("Viviendas no valido");
        }
        this.viviendas.add((Vivienda) viviendas);
    }

    public GestordeVivienda() {
    }


    public void agregarVivienda(Vivienda vivienda) {
        if (vivienda == null){
            throw new IllegalArgumentException("Error, vivienda con un dato erroneo.");
        }

        this.viviendas.add(vivienda);
        System.out.println( vivienda.getCodigoPropiedad() + " "+vivienda.getClass().getSimpleName()+" " +"registrada correctamente.");
    }
    /* Metodo no es usado */
    public void cargarViviendas() {
        Departamento depto1 = new Departamento("PROP-DO1", 65,3,8);
        Departamento depto2 = new Departamento("PROP-DO2", 48,2,3);
        Casa casa1 =  new Casa("PROP-C01", 120, 4,true);
        Casa casa2 =  new Casa("PROP-C02", 90, 3,false);
    }

    public List<Vivienda> getViviendas() {

        return viviendas;
    }

    public void setViviendas(List<Vivienda> viviendas) {
        if (viviendas == null) {
            throw new IllegalArgumentException("Viviendas no valido");
        }
        this.viviendas = viviendas;
    }

    public String buscadorVivienda(String codigo) {

        for (Vivienda listaViviedas : viviendas) {

            if (listaViviedas.getCodigoPropiedad().equals(codigo) ) {
                if (listaViviedas instanceof  Departamento departamentos) {

                    String dato;
                    dato = "Tipo: " + listaViviedas.getClass().getSimpleName()+ "|" + "Código: " + codigo+ "|" + "Superficie: " + listaViviedas.getMetrosCuadrados()+ "|" + "Habitaciones: " + listaViviedas.getNumeroHabitacones()+ "|" + '\''
                            + "Piso: " + departamentos.getNumeroDePisos() + "|" + "Gasto común al día: " + (departamentos.isGastoComunAlDia() ? "Si" : "No")+ "|"
                            + "Estacionamiento asignado: "+ (departamentos.estacionamientoAsignado() ? "Si" : "No")+ "|" + "Costo Arriendo: " + departamentos.costoDeArriendo();
                    return dato;
                }
            }
        }
        return "Vivienda no encontrado";
    }


}
