package eva2_7_while;
public class EVA2_7_WHILE {
    public static void main(String[] args) {
        int num = 1;
        while(num <= 10){
            System.out.println(num);
            num++;
        }
        num = 11;
        do{
            System.out.print(num+"-");
            num++;
        }while(num <=10);
    }
    
}
