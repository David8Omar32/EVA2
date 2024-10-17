package eva2_10_validar2;

import java.util.Scanner;

public class EVA2_10_Validar2 {
    public static void main(String[] args) {
        int dia;
        Scanner scn = new Scanner(System.in);
        while(true){
            System.out.println("Numero correspondiente al día (1-7)");
            dia = scn.nextInt();
            if(dia<=7 && dia>=1)
                break;
        }
    }
    
}
