

package ejercicios.prácticos.u5;

import java.util.Scanner;



public class NewClass {
    public static void main(String[] args) {
        
        Scanner lector= new Scanner(System.in);
        int num;
        num=lector.nextInt();
        for (int i = 1; i <=num ; i++)
        {
          if(num%i==0){
             System.out.println("Elnúmero es "+i+ " divisor de "+num);
        }
         
    }
}
}