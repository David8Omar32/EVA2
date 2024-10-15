package eva2_8_practica4;

import java.util.Scanner;

public class EVA2_8_Practica4 {
    public static void main(String[] args) {
        String texto,h;
        Scanner cap = new Scanner(System.in);
        System.out.println("Escribir un texto");
        texto = cap.nextLine();
        
        for (int i = 0; i < texto.length(); i++) {
            switch (texto.charAt(i)) {
                case 'a':
                    System.out.println("a");
                    break;
                case 'e':
                    System.out.println("e");
                    break;
                case 'i':
                    System.out.println("i");
                    break;
                case 'o':
                    System.out.println("o");
                    break;
                case 'u':
                    System.out.println("u");
                    break;
                case 'A':
                    System.out.println("A");
                    break;
                case 'E':
                    System.out.println("E");
                    break;
                case 'I':
                    System.out.println("I");
                    break;
                case 'O':
                    System.out.println("O");
                    break;
                case 'U':
                    System.out.println("U");
                    break;
            }
        }
    }
    
}

