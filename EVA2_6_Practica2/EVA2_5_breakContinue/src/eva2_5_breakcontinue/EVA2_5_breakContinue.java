package eva2_5_breakcontinue;
public class EVA2_5_breakContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i==8) {
                break;
            }
            System.out.print(i + "-");
        }
        
        for (int i = 1; i <= 10; i++) {
            if (i==8) 
                continue;
                System.out.println(i + "-");
            
        }
    }
    
}
