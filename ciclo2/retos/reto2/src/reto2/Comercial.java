package reto2;

public class Comercial extends Vehiculo {
    
    protected int cargaM;
    
    public Comercial(int pas, int velo, String placa, String tipo, int cargaM){
        super(pas, velo, placa, tipo);
        this.cargaM = cargaM;
    }
    @Override
    public String toString() {
        return "\tVehiculo comercial - Placa: " + placa + "\n" +
                "\tvelocidad: " + velo + " km/h\n" +
                "\tpasajeros: " + pas + "\n" +
                "\tCarga máxima: " + cargaM + "kg";
    }
}