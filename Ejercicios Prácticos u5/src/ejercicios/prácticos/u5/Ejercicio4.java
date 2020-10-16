//Crea una función cubo, que reciba un número y lo devuelva elevado al
//cubo.

package ejercicios.prácticos.u5;

import javax.swing.JOptionPane;


public class Ejercicio4 {

    public static void main(String[] args) {
        int num1;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese por favor numero a elevar al cubo"));
        
        System.out.println("el cubo de este numero es "+funcionCubo(num1,3.0));
        
    }
    public static double funcionCubo(double num1, double num2 ){
          
          double num=Math.pow(num1, num2);
           
            return num;    
        }
    
    }
    


    

