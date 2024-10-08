package eva2_3_potencia;

import java.util.Scanner;

public class EVA2_3_Potencia {
    public static void main(String[] args) {
        int n1,n2;
        Scanner cap = new Scanner(System.in);
        System.out.println("Numero base: ");
        n1 = cap.nextInt();
        cap.nextLine();
        System.out.println("Numero exponencial: ");
        n2 = cap.nextInt();
        cap.nextLine();
        int res = 1;
        for (int i = 1; i <= n2; i++) {
            res= res*n1;
        }
        System.out.println("El resultado es: "+res);
    }
    
}
