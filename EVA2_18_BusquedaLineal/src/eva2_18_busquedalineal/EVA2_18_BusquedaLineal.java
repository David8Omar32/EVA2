package eva2_18_busquedalineal;

import java.util.Scanner;

public class EVA2_18_BusquedaLineal {
    public static void main(String[] args) {
        int[] datos = {10,50,2,235,230,234,2300,12,2350,425,143,5345,345,3450,34500,345000,3450000,45,120,31,6,16};
        int valor, posi=-1;
        
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Escriba un valor: ");
        valor = scn.nextInt();
        
        for (int i = 0; i < datos.length; i++) {
            if (valor == datos[i]){
                posi = i;
                break;
            }
        }
        
        if (posi ==-1) {
            System.out.println("Tu numero no esta en los datos");
        } else {
            System.out.println("Tu numero esta en la posicion: " + posi);
        }
    }
    
}
