package reto2;

public class Vehiculo {
    protected int velo;
    protected int pas;
    protected String placa;
    protected String tipo;
    
    public Vehiculo(int pas, int velo, String placa, String tipo) {
        this.velo = velo;
        this.pas = pas;
        this.placa = placa;
        this.tipo = tipo;
    }
    @Override
    public String toString() {
        return velo + "\t" + pas + "\t" + placa + "\t" + tipo;
    }
}
