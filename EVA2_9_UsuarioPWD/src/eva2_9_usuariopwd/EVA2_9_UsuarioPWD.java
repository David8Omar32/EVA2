package eva2_9_usuariopwd;

import java.util.Scanner;

public class EVA2_9_UsuarioPWD {
    public static void main(String[] args) {
        String user,pwd;
        Scanner scn = new Scanner(System.in);
        
        do{
            System.out.println("Introduzca el usuario");
            user = scn.nextLine();
        
            System.out.println("Introduzca el la contraseña");
            pwd = scn.nextLine();
        }while(!user.equals("admin") || !pwd.equals("1234"));
        System.out.println("Bienvenido");
    }
    
}
