package eva2_17_arreglos;

import java.util.Scanner;

public class EVA2_17_Arreglos {
    public static void main(String[] args) {
        int cantidad;
        int calificacion[];
        String nombres[];
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Cantidad de calificaciones a capturar: ");
        cantidad = scn.nextInt();
        scn.nextLine();
        
        calificacion = new int[cantidad];
        nombres = new String[cantidad];
        for (int i = 0; i < calificacion.length; i++) {
            System.out.println("Insertar el nombre del alumno #" + (i+1));
            nombres[i] = scn.nextLine();
            
            System.out.println("Insertar la calificación del alumno #" + (i+1));
            calificacion[i] = scn.nextInt();
            scn.nextLine();
        }
        
        for (int i = 0; i < calificacion.length; i++) {
            System.out.println("");
            System.out.println("Alumno: " + nombres[i]);
            System.out.println("Calificacion del alumno #" + (i+1)+ ": " + calificacion[i]);
        }
    }
    
}
