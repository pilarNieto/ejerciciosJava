
package ejercicios.prácticos.u6;

//CreaR un array o arreglo unidimensional con un tamaño de 5, asignale los

import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

//valores numéricos ingresados por teclado y muestralos por pantalla.
public class Ejercicio1a {
    public static void main(String[] args) {
        
        int [] values = new int[5];
        Scanner teclado=new Scanner(System.in);
                
        for (int i = 0; i < values.length; i++) {
            System.out.print(" Digite por favor el numero "+(i+1)+" del arreglo ");
            values[i]=teclado.nextInt();
          
        }
        System.out.println(" ");
       System.out.println("el Arreglo es "+ Arrays.toString(values));  
    }
}