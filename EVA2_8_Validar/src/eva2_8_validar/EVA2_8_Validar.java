package eva2_8_validar;

import java.util.Scanner;

public class EVA2_8_Validar {
    public static void main(String[] args) {
        int dia;
        Scanner scn = new Scanner(System.in);
        do{
            System.out.println("Numero correspondiente al día (1-7)");
            dia = scn.nextInt();
        }while(dia < 1 || dia > 7);
        
        switch(dia){    
        case 1:
            System.out.println("Domingo");
            break;
        case 2:
            System.out.println("Lunes");
            break;
        case 3:
            System.out.println("Martes");
            break;
        case 4:
            System.out.println("Miercoles");
            break;
        case 5:
            System.out.println("Jueves");
            break;
        case 6:
            System.out.println("Viernes");
            break;
        case 7:
            System.out.println("Sabado");
            break;
        default:
            System.out.println("Numero no valido");
        }
    }
    
}
