

package scannereje;

import java.util.Scanner;

public class Scannereje {

    
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int edad;
        String nombre;
        
        System.out.println("Ingrese su nombre ");
        nombre=sc.nextLine();
        System.out.println("Ingrese por favor su edad");
        edad=sc.nextInt();
        if (edad>=18)
        {
            System.out.println(nombre+" Puedes ingresar");
        }
        else
        {
           System.out.println(nombre+" no puedes ingresar"); 
        }
            
        System.out.println("suerte");
    }
   
}
