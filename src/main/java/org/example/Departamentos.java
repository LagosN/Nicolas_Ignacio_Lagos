package org.example;

public class Departamentos extends Vivienda implements ConEstacionamiento{
    private int numeroDePisos;
    private boolean gastoComunAlDia;
    private boolean estacionamientoAsignado;

    public Departamentos(String codigoPropiedad, double metrosCuadrados, int numeroHabitacones, int numeroDePisos, boolean gastoComunAlDia, boolean estacionamientoAsignado) {
        super(codigoPropiedad, metrosCuadrados, numeroHabitacones);
        this.numeroDePisos = numeroDePisos;
        this.gastoComunAlDia = gastoComunAlDia;
        this.estacionamientoAsignado = estacionamientoAsignado;
    }
    public Departamentos(String codigoPropiedad, double metrosCuadrados, int numeroHabitacones, int numeroDePisos) {
        super(codigoPropiedad, metrosCuadrados, numeroHabitacones);
        this.numeroDePisos = numeroDePisos;

    }


    public boolean isGastoComunAlDia() {
        return gastoComunAlDia;
    }

    public void setGastoComunAlDia(boolean gastoComunAlDia) {
        this.gastoComunAlDia = true;
    }

    public boolean isEstacionamientoAsignado() {
        return estacionamientoAsignado;
    }

    public void setEstacionamientoAsignado(boolean estacionamientoAsignado) {
        this.estacionamientoAsignado = estacionamientoAsignado;
    }

    public int getNumeroDePisos() {
        return numeroDePisos;
    }

    public void setNumeroDePisos(int numeroDePisos) {
        if (numeroDePisos < 0) throw new IllegalArgumentException("NumeroDePisos no valido");
        this.numeroDePisos = numeroDePisos;
    }

    @Override
    public void costoDeArriendo() {
        double costo = 180000;
        if (isGastoComunAlDia()) {
            costo = (costo * 1.15);
            System.out.println("Gasto comun al día, costo de Arriendo: " + costo);
        }
        System.out.println("Costo de Arriendo: " + costo);
    }

    @Override
    public boolean estacionamientoAsignado(boolean estacionamientoAsignado) {
        if (isEstacionamientoAsignado()){
            return isEstacionamientoAsignado();}
        return false;
    }

    @Override
    public boolean asignarEstacionamiento() {
        this.estacionamientoAsignado = true;
        return isEstacionamientoAsignado();

    }

}
