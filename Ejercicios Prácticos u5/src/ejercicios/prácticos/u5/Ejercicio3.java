//Crea una función esPar que devuelva el valor lógico true o false según
//si el número que se indique como parámetro es par o no lo es

package ejercicios.prácticos.u5;

import javax.swing.JOptionPane;

public class Ejercicio3 { 
    
    public static void main(String[] args) {
 
     int num1= Integer.parseInt(JOptionPane.showInputDialog("Ingrese número"));
        System.out.println(esPar(num1));
    }
    public static boolean esPar(int num){
        return num%2==0;
    }
}
  


