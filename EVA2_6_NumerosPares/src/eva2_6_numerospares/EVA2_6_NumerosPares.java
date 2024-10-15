package eva2_6_numerospares;

import java.util.Scanner;

public class EVA2_6_NumerosPares {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num,num2;
        System.out.println("Escriba el inicio");
        num = scn.nextInt();
        
        System.out.println("Escriba el final");
        num2 = scn.nextInt();
        System.out.println("Pares");
        for (int i = num; i <= num2; i++) {
            int modulo = i%2;
            if (modulo != 0)
                continue;
            System.out.print(i+"-");
            
        }
        System.out.println("Impares");
        for (int i = num; i <= num2; i++) {
            int modulo = i%2;
            if (modulo == 0)
                continue;
            System.out.print(i+"-");
            
        }
    }
    
}
