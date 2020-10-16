//Crea una función mayorDeTres, que reciba tres números enteros y
//devuelva el valor del mayor de ellos. Por ejemplo, para los números 5, 7
//y 5, devolvería el valor 7

package ejercicios.prácticos.u5;

import java.util.Scanner;


public class Ejercicio6 {
    
    public static void main(String[] args) 
    {
     Scanner sc=new Scanner(System.in);
     int num1;
     int num2;
     int num3;
     num1=sc.nextInt();
     num2=sc.nextInt();
     num3=sc.nextInt();
     
        System.out.println("El Número mayor es "+mayorDeTres(num1,num2,num3));
     
    }
    public static int mayorDeTres(int num1, int num2, int num3)
    {
        if(num1>num2 && num1>num3){
            System.out.println("el numero "+num1+ " es elmayor");
        }
        if(num2>num1 && num2>num3)
            System.out.println("el número "+ num2+" es el mayor"); 
    
        else
        {
            System.out.println("el número "+ num3+ " es el mayor");
        
        } 
        int resultado = 0;
        return resultado;
    }
}


