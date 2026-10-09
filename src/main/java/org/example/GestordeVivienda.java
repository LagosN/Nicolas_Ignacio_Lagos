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
        this.viviendas.add(vivienda);
    }

    public void cargarViviendas() {
        Departamentos depto1 = new Departamentos("PROP-DO1", 65,3,8);
        Departamentos depto2 = new Departamentos("PROP-DO2", 48,2,3);
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

    public String buscadorVivienda(Vivienda vivienda) {
        for (Vivienda listaViviedas : viviendas) {
            if (listaViviedas.equals(vivienda)) {
                return listaViviedas.toString();
            }
        }
        return "Vienda no encontrado";
    }

    @Override
    public String toString() {
        return "GestordeVivienda{" + // Al no tener terminada la lista, no puedo acceder a getCodigoPropiedad()  para CODIGO y getSuperficie().
                "viviendas=" + viviendas +
                '}';
    }
}
