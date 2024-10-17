package eva2_11_numeromayor;

import java.util.Scanner;

public class EVA2_11_NumeroMayor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num,mayor;
        mayor = 0;
        do {
            System.out.println("Escribe un numero positivo: ");
            num = scn.nextInt();
            if (num < 1) 
                break;
            if (num > mayor) 
                mayor = num;
            
        } while (true);
            System.out.println("El numero mas grande fue " + mayor);
        
    }
    
}
