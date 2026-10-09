package org.example;

public  abstract class Vivienda {
    protected String codigoPropiedad;
    protected double metrosCuadrados;
    protected int numeroHabitacones;

    public Vivienda(String codigoPropiedad, double metrosCuadrados, int numeroHabitacones) {
        this.codigoPropiedad = codigoPropiedad;
        this.metrosCuadrados = metrosCuadrados;
        this.numeroHabitacones = numeroHabitacones;
    }

    public String getCodigoPropiedad() {
        return codigoPropiedad;
    }

    public void setCodigoPropiedad(String codigoPropiedad) {
        if (codigoPropiedad == null || codigoPropiedad.isEmpty()) {
            throw  new IllegalArgumentException("El codio no puede estar vacio");
        }
        this.codigoPropiedad = codigoPropiedad;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        try {if (metrosCuadrados < 20 || metrosCuadrados > 500) {
            throw new IllegalArgumentException("MetrosCuadrados no valido");
        }
            this.metrosCuadrados = metrosCuadrados;

        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }

    }

    public int getNumeroHabitacones() {
        return numeroHabitacones;
    }

    public void setNumeroHabitacones(int numeroHabitacones) {
        if (numeroHabitacones < 0) {
            throw new IllegalArgumentException("NumeroHabitacones no valido");
        }
        this.numeroHabitacones = numeroHabitacones;
    }

    @Override
    public String toString() {
        return "Vivienda{" +
                "metrosCuadrados=" + metrosCuadrados +
                ", codigoPropiedad='" + codigoPropiedad + '\'' +
                '}';
    }

    public abstract void costoDeArriendo();

}
