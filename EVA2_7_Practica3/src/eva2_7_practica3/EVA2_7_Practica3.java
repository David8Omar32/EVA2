package eva2_7_practica3;

import java.util.Scanner;
public class EVA2_7_Practica3 {
    public static void main(String[] args) {
        String texto;
        Scanner cap = new Scanner(System.in);
        System.out.println("Introducir un texto");
        texto = cap.nextLine();
        
        for (int i = 0; i < texto.length(); i++) {
            System.out.println(texto.charAt(i));
        }
    }
    
}
