package eva2_14_ciclosarreglos;
public class EVA2_14_CiclosArreglos {
    public static void main(String[] args) {
        int dato,valores[];
        int[] datos,x,y,z;
        int[] arreglo = new int[500];
        
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random() * 100);
            System.out.println(arreglo[i]);
        }
    }
    
}
