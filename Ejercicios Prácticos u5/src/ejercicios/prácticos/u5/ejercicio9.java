//Escribir la función esVocal, que devuelva true o false según si un
//caracter recibido como parámetro es vocal (contemplar mayúsculas y
//minúsculas). Ejemplo: Se invoca esVocal(‘a’) → devuelve true.


package ejercicios.prácticos.u5;

import java.util.Scanner;


public class ejercicio9 {
    public static void main(String[] args) {
       System.out.println("Ingrese por favor una letra");
        Scanner sc=new Scanner(System.in);
        String vocal;
        vocal=sc.nextLine();
        
        
    }
    public static boolean esVocal(int vocal)
    {
        int a=1;
        int e=2;
        int i=3;
        int o=4;
        int u=5;
        return (((vocal == a || vocal == e) || vocal == 3) || vocal == 4) || vocal==5;
    
 }
}  

