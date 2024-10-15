package eva2_9_practica5;

import java.util.Scanner;

public class EVA2_9_Practica5 {
    public static void main(String[] args) {
        int num;
        Scanner cap = new Scanner(System.in);
        System.out.println("Escribe un numero: ");
        num = cap.nextInt();
        String lun = "";
        for (int i = 1; i <= num; i++) {
            lun= lun + "*";
            System.out.println(lun);
        }
    }
    
}
