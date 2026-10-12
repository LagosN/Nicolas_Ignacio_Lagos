package org.example;

public class Casa extends Vivienda {

    private boolean conPatio;

    public Casa(String codigoPropiedad, double metrosCuadrados, int numeroHabitacones, boolean conPatio) {
        super(codigoPropiedad, metrosCuadrados, numeroHabitacones);
        setConPatio(conPatio);
    }

    public boolean isConPatio() {
        return conPatio;
    }

    public void setConPatio(boolean conPatio) {
        this.conPatio = conPatio;
    }

    @Override
    public double costoDeArriendo() {
        double costo = 250000;
        if (isConPatio()) {
            costo =  (costo * 1.15);
            System.out.println("Casa cuenta con patio " + costo);
            return costo;
        }
        System.out.println("Casa no cuenta con patio: " + costo);
        return  costo;


    }

}
