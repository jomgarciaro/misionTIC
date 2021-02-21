
package sesion6;

import java.util.Scanner;
import java.util.Arrays;

public class ListaEstudiantes {
    final private Estudiante[] estudiantes;
    private int n;
    
    public ListaEstudiantes() {
        //Soporta hasta 10000 estudiantes
        estudiantes = new Estudiante[10000];
    }
    public void agregarEstudiante(Estudiante e) {
        estudiantes[n] = e;
        n++;
    }
    public void promedio() {
        double prom = 0;
        for (int i = 0; i < n; i++) {
            prom += estudiantes[i].getNota();
        }
        System.out.println("El promedio de los estudiantes es:");
        System.out.println(prom / n);
    }
    public void ordenar() {
        Arrays.sort(estudiantes, 0, n, 
                (e1, e2) -> e1.getNombre().compareTo(e2.getNombre()));
    }
    public void consultar(String nombre) {
        boolean encontrado = false;
        for (int i = 0; i < n; i++) {
            if(estudiantes[i].getNombre().equals(nombre)) {
                System.out.println(estudiantes[i].getNota());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Estudiante no encontrado");
        }
    }
    public void visualizar() {
        System.out.println("****Lista de Estudiantes****");
        for (int i = 0; i < n; i++) {
            System.out.println(estudiantes[i]);
        }
    }
    public void mostrarMenu() {
        System.out.println("Seleccione una opción:");
        System.out.println("Comando 1: Agregar estudiante y nota " +
                "1&nombre_estudiante&nota");
        System.out.println("Comando 2: Calcular promedio de los estudiantes " +
                "en un momento dado.");
        System.out.println("Comando 3: Ordenar estudiantes agregados por nombre");
        System.out.println("Comando 4: Consultar la nota de un estudiante " + 
                "4&nombre_estudiante");
        System.out.println("Comando 5: Visualizar.");
        System.out.println("Comando 6: Salir.");
    }
    public void procesarComandos() {
        String[] comando;
        Scanner sc = new Scanner(System.in);
        do {
            mostrarMenu();
            comando = sc.nextLine().split("&");
            switch (comando[0]) {
                case "1":
                    agregarEstudiante(new Estudiante(comando[1],
                            Double.parseDouble(comando[2])));
                    break;
                case "2":
                    promedio();
                    break;
                case "3":
                    ordenar();
                    break;
                case "4":
                    consultar(comando[1]);
                    break;
                case "5":
                    visualizar();
                    break;
                    
            }
        } while (!comando[0].equals("6"));
    }
    public static void main(String[] args) {
        ListaEstudiantes e = new ListaEstudiantes();
        e.procesarComandos();
    }
}
