package eva2_6_practica2;

import java.util.Scanner;

public class EVA2_6_Practica2 {
    public static void main(String[] args) {
        int num,num2,val,val2,val3,val4;
        Scanner cap = new Scanner(System.in);
        
        System.out.println("Introduzca un numero");
        num = cap.nextInt();
        System.out.println("Introduzca otro numero");
        num2 = cap.nextInt();
        val = num -1;
        val2 = num2 +1;
        val3 = num2 +1;
        val4 = num -1;
        if(num<num2){
            for (int i = val + 1; i <= num2; i++) {
                System.out.println(i);
            }
            for (int i = val2 - 1; i >= num; i--) {
                System.out.println(i);
            }
        } else if(num>num2){
            for (int i = val4 + 1; i >= num2; i--) {
                System.out.println(i);
            }
            for (int i = val3 - 1; i <= num; i++) {
                System.out.println(i);
            }
        }
            
        
    }
    
}
