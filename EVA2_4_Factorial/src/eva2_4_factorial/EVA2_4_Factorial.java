package eva2_4_factorial;

import java.util.Scanner;

public class EVA2_4_Factorial {
    public static void main(String[] args) {
        int nu,n1;
        Scanner cap = new Scanner(System.in);
        System.out.println("Numero: ");
        nu = cap.nextInt();
        int res=1;
        n1 = nu;
        for (int i = 1; i <= n1; i++) {
            res= res*nu;
            nu--;
        }
        System.out.println("El factorial es: "+res);
    }
    
}
