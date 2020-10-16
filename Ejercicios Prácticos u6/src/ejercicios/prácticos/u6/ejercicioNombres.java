
package ejercicios.prácticos.u6;
//crear un arreglo de n posiciones y llenarlo con nombres de personas

import javax.swing.JOptionPane;


public class ejercicioNombres {
    public static void main(String[] args)
    {
        
      int n= Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de alumnos "));
      String [] nombres= new String[n];  
        for (int i = 0; i < nombres.length; i++) 
        {
           nombres[i]= JOptionPane.showInputDialog((i+1)+" Escriba nombre: ");
            System.out.println("Los nombres de la lista son "+nombres[i]);
        }
    }
    
}
