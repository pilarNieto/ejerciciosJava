
package ejercicios.prácticos.u6;

//crear un array de n posiciones de numeros ingresados por el usuario y luego busuqe en el 

import java.util.Scanner;
import javax.swing.JOptionPane;

//array un numero también ingresado por el mismo
public class EjercicioBusqueda {
    
    public static void main(String[] args) {
        
        int num= Integer.parseInt(JOptionPane.showInputDialog("Digit por favor la cantidad numeros que "
                                                                 + "va a tener el Array"));
        int [] busqueda=new int[num];
        
        for (int i = 0; i < busqueda.length; i++) {
               Scanner entrada=new Scanner(System.in);
               System.out.println("Ingrese el elemento número "+(i+1)+" . del Array");
               busqueda[i]=entrada.nextInt();
              
        }
        System.out.println(busqueda[num]);
    }
    
    
}
