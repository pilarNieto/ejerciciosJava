//Desarrollar un algoritmo que permita mostrar un arreglo de caracteres de
//atrás para adelante. Ejemplo: Arreglo {‘A’,’V’,’A’,’J’}, la computadora
//muestra: ‘J’ ‘A’ ‘V’ ‘A’. 
package ejercicios.prácticos.u6;


import java.util.Arrays;
import javax.swing.JOptionPane;


public class EjercicioJAVA {
    public static void main(String[] args) {
        int num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de letras "
                + "que llevará la palabra"));
        String[]let=new String[num];
       int inv;
        for (int i = 0; i < let.length; i++) {
            let[i] =JOptionPane.showInputDialog("Ingrese la letra numero "+(i+1));
                      
            System.out.print(Arrays.toString(let));
            for (int j = 0; j < 10; j++) {
                
            }
            
        }
        System.out.println(" ");
              
             
        }
        }
    
    
   