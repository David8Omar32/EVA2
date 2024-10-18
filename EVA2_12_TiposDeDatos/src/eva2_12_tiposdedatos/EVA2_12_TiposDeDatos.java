package eva2_12_tiposdedatos;
public class EVA2_12_TiposDeDatos {
    public static void main(String[] args) {
        byte valor = -128;
        byte valor2 = 127;
        
        System.out.println("Valor= " + (valor));
        System.out.println("Valor2= " + (valor2));
        
        short val = -32768;
        short val2 = 32767;
        
        System.out.println("val= " + val);
        System.out.println("val2= " + val2);
        
        int x = -2147483648;
        int y = 2147483647;
        
        System.out.println("x= " + x);
        System.out.println("y= " + y);
        
        long xy= -9223372036854775808L;
        long yx= 9223372036854775807L;
        
        System.out.println("xy= " + xy);
        System.out.println("yx= " + yx);
    }
    
}
