package eva2_2_promedio;

import java.util.Scanner;

public class EVA2_2_Promedio {  
    public static void main(String[] args) {
        double cali,sum;
        sum = 0;
        Scanner cap = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.println("Estudiante - "+i);
            System.out.println("¿Cual es la calificación?");
            cali = cap.nextDouble();
            cap.nextLine();
            sum = sum + cali;
            if (i==10) {
                double pro;
                pro = sum/i;
                System.out.println("El promedio es " + pro);
            }
        }
    }
    
}
