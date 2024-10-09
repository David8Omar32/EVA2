package eva2_5_practica1;

import java.util.Scanner;

public class EVA2_5_Practica1 {
    public static void main(String[] args) {
        int num;
        String text;
        Scanner cap = new Scanner(System.in);
        System.out.println("Introduzca un texto");
        text = cap.nextLine();
        System.out.println("Introduzca un numero");
        num = cap.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println(text);
        }
    }
    
}
