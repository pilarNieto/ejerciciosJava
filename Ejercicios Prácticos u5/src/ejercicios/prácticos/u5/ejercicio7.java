//Escribir el procedimiento imprimirSimbolo, que imprima por consola n
//veces un carácter en la misma línea. Tanto n como el caracter se reciben
//como parámetro. Ejemplo: Se invoca imprimirSimbolo(5,’#’) →
//imprime “#####

package ejercicios.prácticos.u5;

import javax.swing.JOptionPane;



public class ejercicio7 {
    public static void main(String[] args) {
     int num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese por favor un numero entero positivo"));
     String simbol=JOptionPane.showInputDialog("Ingrese un simbolo");
     
        System.out.print(imprimirSimbolo(num,simbol));
    }
       
   
    
    public static int imprimirSimbolo(int num, String simb)
    {
        for (int i = 0; i < num; i++) 
        {
            System.out.print(simb);
        }
        return 0;
        
    }
}
