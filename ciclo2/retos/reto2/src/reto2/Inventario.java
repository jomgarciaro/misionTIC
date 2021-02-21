package reto2;

import java.util.Scanner;
import java.util.ArrayList;

public class Inventario {
    private final ArrayList<Vehiculo> vehiculos;
    
    
    public Inventario() {
        vehiculos = new ArrayList<>();
    }
    
    public void agregarVehiculo(Vehiculo v){
        vehiculos.add(v);
        
    }
    public void listarVehiculos() {
        System.out.println("***Inventario de vehículos***");
        vehiculos.forEach((v) -> {              
            System.out.println(v.toString());
        });
    }
    public void pocesarComandos() {

        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int inventarioParticular = 100;
        int inventarioComercial = 100;
        
        while (flag) {
            String[] comandos = sc.nextLine().split("&");
            switch (comandos[0]) {
                case "1":
                    if (comandos[1].equals("Comercial")) {
                        agregarVehiculo(new Comercial(
                                Integer.parseInt(comandos[2]),
                                Integer.parseInt(comandos[3]),
                                comandos[4],
                                comandos[1],
                                Integer.parseInt(comandos[5])));
                    } else if (comandos[1].equals("Particular")){
                        agregarVehiculo(new Particular(
                                Integer.parseInt(comandos[2]),
                                Integer.parseInt(comandos[3]),
                                comandos[4],
                                comandos[1],
                                comandos[5]));
                    }
                    break;

                case "2":
                    listarVehiculos();
                    break;

                case "3":
                	int cantidadParticular = Integer.parseInt(comandos[2]);
                	int cantidadComercial = Integer.parseInt(comandos[4]);
                	String documentoIdentidad = comandos[5];

                	if (cantidadParticular <= inventarioParticular &&
                			cantidadComercial <= inventarioComercial) {
                		
                		inventarioParticular -= cantidadParticular;
                		inventarioComercial -= cantidadComercial;
                		
                		double subtotal = (cantidadParticular * 30000000) + (cantidadComercial * 40000000);
                		System.out.println(subtotal);
                		double porcentajeIva = (21 - (cantidadParticular + cantidadComercial)) * 0.01;
                		System.out.println(porcentajeIva);
                		int iva = 0;
                		
						if ((cantidadParticular + cantidadComercial) <= 20) {
							iva = (int) (subtotal * porcentajeIva);
						} 
						
						int total = (int) (subtotal + iva);

						System.out.println("CONCESIONARIO UNCAR");
						System.out.println("UNCAR - UNIVA");
						System.out.println("NIT: 899.999.063");
						System.out.println("Cliente: " + documentoIdentidad);
						System.out.println("Vehículo Cant Precio");
						System.out.println("Particular x" + cantidadParticular + " $30000000");
						System.out.println("Comercial x" + cantidadComercial + " $40000000");
						System.out.println("Iva: $" + iva);
						System.out.println("Total: $" + total);
						System.out.println("---");
						break;
                	} else {
                		System.out.println("Lo sentimos no tenemos stock suficiente");
                		System.out.println("---");
                	}
                	break;

                case "4":
                	System.out.println("Particular: " + inventarioParticular);
                	System.out.println("Comercial: " + inventarioComercial);
                	System.out.println("---");
                	break;
                	
                case "5":
                	flag = false;
                	break;
            }
            
        } 
    }
    
    public static void main(String[] args) {
        Inventario inv = new Inventario();
        inv.pocesarComandos();
    }
    
}
