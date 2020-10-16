
package primer_ejecutable;

import javax.swing.JOptionPane;


public class Primer_ejecutable {

    
    public static void main(String[] args) {
    
        //Pedir al usuario que ingrese un número del 1 al 7, y que el sistema muestre en pantalla a qué día de la semana corresponde ese número (Domingo a Sábado).
       int diaSemana=Integer.parseInt(JOptionPane.showInputDialog("digita un número de 1 a 7 y te digo el día de la semana :)"));
    
       switch(diaSemana){
          case 1: JOptionPane.showMessageDialog(null,"Hoy es lunes de empezar a programar!");    
              break;
          case 2: JOptionPane.showMessageDialog(null,"Hoy es martes de hacer ejercicio");
              break;
          case 3: JOptionPane.showMessageDialog(null,"Hoy es miércoles de comer arepas");
              break;
          case 4: JOptionPane.showMessageDialog(null,"Hoy es jueves de tomar una cerveza");
              break;
          case 5: JOptionPane.showMessageDialog(null,"Hoy es viernes y tu cuerpo lo sabe");
              break; 
          case 6: JOptionPane.showMessageDialog(null,"Hoy es sábado del curso de Java");
              break;  
          case 7: JOptionPane.showMessageDialog(null,"Hoy es domingo de asado");
              break;     
              
          default: JOptionPane.showMessageDialog(null,"la opción es incorrecta, regresa y verifica ");
    }
    }
}