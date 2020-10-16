
package cursojava;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Ejemplovariable {
    
    public static void main(String[] args) {
        //5. Pedir al usuario que ingrese 5 notas por teclado, al finalizar deberá mostrar el promedio general y la cantidad de notas que son menores a 7.      
          
       double sumN=0; //inicializamos acumulador de notas        
       int cantNotas=0; //inicializamos contador para sumar notas menores a 7  
        for (int c = 1; c < 6; c++) {
            double notas=Double.parseDouble(JOptionPane.showInputDialog (c +". Ingrese sus notas por favor ")); //pedimos notas
            sumN+=notas; //sumamos 
            if(notas<7){   //condición para detectar notas menores a 7            
             cantNotas++;  //contamos las notas menores a siete
                
            }//cierre de if
        }//cierre de for        
        System.out.println("Su promedio de notas es de "+(sumN/5));
        System.out.println("la cantidad de notas menores a 7 fueron: "+cantNotas);
    } 
    
    }
                 
           
        
    
