
import java.util.Scanner;


public class contador_con_for {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese por favor un valor entero positivo");
        int num;
        int acum;
        num=sc.nextInt();
        
            
        for (int i = 0; i < num; i++) {
             System.out.println("mensaje "+ i + " de "+num);
        }
        System.out.println("Hasta aquí llegó la iteración");        
        
    }
 
}
