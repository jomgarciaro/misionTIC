package reto2;

public class Particular extends Vehiculo {
    
    protected String color;
    
    public Particular(int pas, int velo, String placa, String tipo, String color){
        super(pas, velo, placa, tipo);
        this.color = color;
    }
    @Override
    public String toString() {
        return "\tVehiculo particular - Placa: " + placa + "\n" +
                "\tvelocidad: " + velo + " km/h\n" +
                "\tpasajeros: " + pas + "\n" +
                "\tcolor: " + color;
    }
}