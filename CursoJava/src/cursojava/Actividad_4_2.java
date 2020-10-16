
package cursojava;

import javax.swing.JOptionPane;

public class Actividad_4_2 {
    public static void main(String[] args) {
   //Pedir al usuario que ingrese un número del 1 al 7, y que el sistema muestre en pantalla a qué día de la semana corresponde ese número (Domingo a Sábado).
   
   int diaSemana=Integer.parseInt(JOptionPane.showInputDialog("digita un número de 1 a 7 y te digo el día de la semana :)"));
    
       switch(diaSemana){
          case 1: JOptionPane.showMessageDialog(null,"Hoy es domingp de empezar a programar!");    
              break;
          case 2: JOptionPane.showMessageDialog(null,"Hoy es lunes de hacer ejercicio");
              break;
          case 3: JOptionPane.showMessageDialog(null,"Hoy es martes de comer arepas");
              break;
          case 4: JOptionPane.showMessageDialog(null,"Hoy es miércoles de tomar una cerveza");
              break;
          case 5: JOptionPane.showMessageDialog(null,"Hoy es jueves y tu cuerpo lo sabe");
              break; 
          case 6: JOptionPane.showMessageDialog(null,"Hoy es viernes del curso de Java");
              break;  
          case 7: JOptionPane.showMessageDialog(null,"Hoy es sábado de asado");
              break;     
              
          default: System.out.println("la opción es incorrecta, regresa y verifica ");  
       }   
//Desarrollar un programa que pida al usuario un número entre 1 y 12. La computadora muestra por pantalla el mes al que pertenece tal número. Si se ingresa un número fuera de rango, mostrar un error. Ejemplo: se ingresa un 4, la computadora muestra: “ABRIL”.       
       int mesAno=Integer.parseInt(JOptionPane.showInputDialog("digita un número de 1 al 12 y te digo a que mes corresponde :)"));
    
       switch(mesAno){
          case 1: JOptionPane.showMessageDialog(null,"ENERO");    
              break;
          case 2: JOptionPane.showMessageDialog(null,"FEBRERO");
              break;
          case 3: JOptionPane.showMessageDialog(null,"MARZO");
              break;
          case 4: JOptionPane.showMessageDialog(null,"ABRIL");
              break;
          case 5: JOptionPane.showMessageDialog(null,"MAYO");
              break; 
          case 6: JOptionPane.showMessageDialog(null,"JUNIO");
              break;  
          case 7: JOptionPane.showMessageDialog(null,"JULIO");
              break;  
          case 8: JOptionPane.showMessageDialog(null,"AGOSTO");
              break;
          case 9: JOptionPane.showMessageDialog(null,"SEPTIEMRE");
              break;
          case 10: JOptionPane.showMessageDialog(null, "OCTURE");
              break;
          case 11: JOptionPane.showMessageDialog(null, "NOVIEMRE");
              break;
          case 12: JOptionPane.showMessageDialog(null, "DICIEMRE");
              break;
          default: JOptionPane.showMessageDialog(null,"ERRROR");  
       }
    //Desarrollar un programa que permita el ingreso de una letra, correspondiente a un dígito del sistema de numeración romano. La computadora muestra su correspondiente valor decimal. Si se ingresa una letra inexistente, computadora informa que no existe tal dígito
    String numeroRomano= JOptionPane.showInputDialog("Ingresa por favor una letra correspondite al sistema de numeración romano");
    
    switch(numeroRomano){
        
        case "I": JOptionPane.showMessageDialog(null,1.0);    
              break;
          case "V": JOptionPane.showMessageDialog(null,5.0);
              break;
          case "X": JOptionPane.showMessageDialog(null,10.0);
              break;
          case "L": JOptionPane.showMessageDialog(null,50.0);
              break;
          case "C": JOptionPane.showMessageDialog(null,100.0);
              break; 
          case "D": JOptionPane.showMessageDialog(null,500.0);
              break;  
          case "M": JOptionPane.showMessageDialog(null,1000.0);
              break;  
          default: JOptionPane.showMessageDialog(null, "INGRESA UN DIGITO VALIDO");
         
    }
    
    //Desarrollar un programa que simule una calculadora básica que realice operaciones de suma, resta, multiplicación. Se pedirá al usuario que ingrese dos números y luego elegir la la operación correspondiente (+,-,*,/)
   
        int val1= Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer digito"));
        int val2=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo digito"));
        String operacion=JOptionPane.showInputDialog(null, "Ingresa la operación que deseas realizar");
    
    switch (operacion){
        case "sumar": JOptionPane.showMessageDialog(null, val1+val2);
        break;
        case "restar": JOptionPane.showMessageDialog(null, val1-val2);
        break;
        case "multiplicar": JOptionPane.showMessageDialog(null, val1*val2);
        break;
        case "dividir": JOptionPane.showMessageDialog(null, val1/val2);
        break;
        default: JOptionPane.showMessageDialog(null,"ERROR, INGRESA DIGITOS VALIDOS");   
         
    }
    //Realizar un programa que al ingresar un numero de lados, muestre por pantalla que figura geométrica se puede interpretar. EJ: si se ingresa 3 lados.. es un triangulo
    int figuraGeometrica=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa los lados para decirte que figura geométrica es ;)"));
    
    switch (figuraGeometrica){
        case 3: JOptionPane.showMessageDialog(null, "TRIÁNGULO");
        break;
        case 4: JOptionPane.showMessageDialog(null, "CUADRILÁTERO");
        break;
        case 5: JOptionPane.showMessageDialog(null, "PENTÁGONO");
        break;
        case 6: JOptionPane.showMessageDialog(null, "HEXÁGONO");
        break;
        case 7: JOptionPane.showMessageDialog(null, "HEPTÁGONO");
        break;
        case 8: JOptionPane.showMessageDialog(null, "OCTÁGONO");
        break;
        case 9: JOptionPane.showMessageDialog(null, "ENEÁGONO");
        break;
        case 10: JOptionPane.showMessageDialog(null, "DECÁGONO");
        break;
        default: JOptionPane.showMessageDialog(null, "No tenemos más figuras geométricas");
    }
    //Calcular el importe a pagar en un estacionamiento según los siguientes datos:
    //- Para autos: la hora cuesta $100, hasta media hora extra se cobra $50. Más de media hora se cobra la hora completa.
    //- Para motos: la hora cuesta $25, hasta media hora extra se cobra $12. Más de media hora se cobra la hora completa.
    //-También se debe elegir si se cobra en efectivo o tarjeta de débito
    int vehiculo = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el tipo de vehículo a estacionar:/n1.auto/n2.moto"));
    int timeA=Integer.parseInt(JOptionPane.showInputDialog("Ingrese por favor el tiempo en minutos que estaciono el vehículo"));
    double pagarA=1.667*timeA;
    double pagarM=0.417*timeA;
    
    switch(vehiculo){
        case 1:   
        if(timeA<=30)  
        JOptionPane.showMessageDialog(null,"abona $50");  
        else{
        JOptionPane.showMessageDialog(null,pagarA);
        }
        break;
        
        case 2:                                      
        if(timeA<=30)   
        JOptionPane.showMessageDialog(null,"abona $12");  
        else{
        JOptionPane.showMessageDialog(null,pagarM);
        break;
        }
    }
     String formaPago=JOptionPane.showInputDialog("Cual es la forma de pago");   
        if(formaPago.equals("tarjeta")){
            JOptionPane.showMessageDialog(null, "Desliza tarjeta por favor");
        }
        else{
         JOptionPane.showMessageDialog(null,"Ingresa el efectivo a la ranura por favor");            
        }
           
        }
    }
       
