package david24550248_examen_evaluacion2;

import java.util.Scanner;

public class David24550248_Examen_Evaluacion2 {
    public static void main(String[] args) {
        Scanner cap = new Scanner(System.in);
        int decision;
        int ppt;
        for (int i = 0; i != 1; i++) {
            System.out.println("¿Quieres jugar piedra, papel o tijeras?");
            System.out.println("1: No");
            System.out.println("2: Si");
            decision = cap.nextInt();
            if (decision != 2) {
                i=2;
            } else if(decision == 2){
                i=0;
            } else{
                System.out.println("error");
            }
            
            if (decision == 2){
                for (int j = 0; j != 1; j++) {
                    System.out.println("1: piedra");
                    System.out.println("2: papel");
                    System.out.println("3: tijeras");
                    System.out.println("4: Dejar de jugar");
                    int tijera=0,papel=0,piedra=0;
                    ppt = cap.nextInt();
                    double valor = Math.random();
                    switch(ppt){
                        case 1:
                            System.out.println("Piedra");
                            if(valor>0 && valor<.33){
                                System.out.println("Maquina: piedra");
                                piedra++;
                            } else if(valor >.33 && valor <.66){
                                System.out.println("Maquina: papel");
                                papel++;
                            } else if(valor >.66 && valor < 1){
                                System.out.println("Maquina: tijera");
                                tijera++;
                            }
                            j=2;
                            break;
                        case 2:
                            System.out.println("papel");
                            if(valor>0 && valor<.33){
                                System.out.println("Maquina: piedra");
                                piedra++;
                            } else if(valor >.33 && valor <.66){
                                System.out.println("Maquina: papel");
                                papel++;
                            } else if(valor >.66 && valor < 1){
                                System.out.println("Maquina: tijera");
                                tijera++;
                            }
                            j=2;
                            break;
                        case 3:
                            System.out.println("tijeras");
                            if(valor>0 && valor<.33){
                                System.out.println("Maquina: piedra");
                                piedra++;
                            } else if(valor >.33 && valor <.66){
                                System.out.println("Maquina: papel");
                                papel++;
                            } else if(valor >.66 && valor < 1){
                                System.out.println("Maquina: tijera");
                                tijera++;
                            }
                            j=2;
                            break;
                        case 4:
                            j=0;
                            break;
                        default:
                            System.out.println("Error");
                            break;
                    }
                    
                }
            }
        }       
    }
    
}
