
package cursojava;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Actividad_4_1 {
    public static void main(String[] args) {
   //Realizar un programa que al ingresar 3 notas, muestre el promedio, también deberá mostrar si aprobó la cursada, se debe tener en cuenta que 
   //para aprobar debe tener un promedio mayor o igual a 7.   
   
   double nota1=Integer.parseInt(JOptionPane.showInputDialog("ingrese por favor la primera nota "));
   double nota2=Integer.parseInt(JOptionPane.showInputDialog("ingrese por favor la segunda nota "));      
   double nota3=Integer.parseInt(JOptionPane.showInputDialog("ingrese por favor la tercera nota "));
   double promedio=((nota1+nota2+nota3)/3);
   JOptionPane.showMessageDialog(null,"El promedio de sus notas es de "+promedio );
   
   if(promedio>=7){
       
       JOptionPane.showMessageDialog(null,"Ha aprobado la materia, puede celebrar!!!");
       
   }//cierre primer condicional
   else{
       
       JOptionPane.showMessageDialog(null,"No ha aprobado la materia, puede ir a casa a llorar :(");
   }//cierre sino

   //2.Pedir al usuario que ingrese un número. Sacar por pantalla/consola un mensaje que indique si el número ingresado es positivo, negativo
   int num=Integer.parseInt(JOptionPane.showInputDialog("Ingresa por favor un número "));
         if(num>0){
             
             JOptionPane.showMessageDialog(null, "El número es positivo");
         }//cierre condicional
         else{
             
             JOptionPane.showMessageDialog(null,"El número es negativo");
                          
         }//cierre sino
         
//   3.  Realizar un programa que calcule el importe total a abonar en una factura, teniendo en cuenta que si el importe total supera los 1000$  se aplica un descuento del 20%
   
         JOptionPane.showMessageDialog(null, "Ingrese a continuación los precios de los productos");
            double producto1=Integer.parseInt(JOptionPane.showInputDialog("ingrese por favor el valor del primer producto "));
            double producto2=Integer.parseInt(JOptionPane.showInputDialog("ingrese por favor el valor del segundo producto "));      
            double producto3=Integer.parseInt(JOptionPane.showInputDialog("ingrese por favor el valor del tercer producto "));
            double total=producto1+producto2+producto3;
         
         if(total>1000){             
             double descuento=((total*20)/100);
             double pagar=total-descuento;
             JOptionPane.showMessageDialog(null, " el cliente debe pagar $"+pagar);
         }//cierre if
         
         else{
             JOptionPane.showMessageDialog(null, " el cliente debe pagar $"+total);
             
         }//cierre sino
         
        //4.Un colegio desea saber qué porcentaje de niños y qué porcentaje de niñas
        //hay en el curso actual al ingresar los datos por teclado. Diseñar un programa para este propósito (recuerda que para calcular el porcentaje puedes hacer una regla de 3).
        double niñas=Integer.parseInt(JOptionPane.showInputDialog("Ingresa por favor el número de niñas "));
        double niños=Integer.parseInt(JOptionPane.showInputDialog("Ingresa por favor el número de niños "));
        double totalNiñes=niñas+niños;
        double porFem=((niñas*100)/totalNiñes);
        double porMas=((niños*100)/totalNiñes);
        JOptionPane.showMessageDialog(null, "El porcentaje de niñas es de "+porFem);
        JOptionPane.showMessageDialog(null, "El porcentaje de niños es de "+porMas);
     
     //4. Ingresar un número por teclado, para que el sistema nos indique si es par o impar.
       Scanner teclado=new Scanner(System.in);
       int num2=teclado.nextInt();
       
       if(num2%2==0){
           
           System.out.println("El número que digitaste es par");
           
       }//cierre if
       else{
           System.out.println("El numero que digitaste es impar");
       }//cierre sino
       
  //Pedir al usuario que ingrese dos números y una operación (+, -, * o /). Mostrar por pantalla el resultado de la operación solicitada entre los dos números ingresados.     
     double n1= Integer.parseInt(JOptionPane.showInputDialog("digite el primer número por favor"));
     double n2=Integer.parseInt(JOptionPane.showInputDialog("digite el segundo número por favor"));
     JOptionPane.showMessageDialog(null,"Digite la operación que desea realizar; 1. para sumar, 2. para restar"
             + "3. para multiplicar y 4. dividir");
     
     double operacion;
     Scanner entrada=new Scanner(System.in);
     operacion=teclado.nextDouble();
       if(operacion==1){
           System.out.println("La suma de los números es ="+(n1+n2));           
     }//cierre suma
       else if(operacion==2){
           System.out.println("La resta de los números es ="+(n1-n2));           
     }//cierre de la resta
       else if(operacion==3){
            System.out.println("La multiplicación de los numeros es ="+((n1*n2)));       
     }//cierre multiplicación
    if (operacion==4&&n1!=0&&n1<0){        
        System.out.println("La división de los números es ="+(n1/n2));      
    }//cierre división
    else{
        System.out.println("ERROR");  
       }// condicion cero 
    //Ingresar dos números por teclado y que el sistema indique cuál es el mayor y cuál es el menor, o si son iguales.
      double val1= Integer.parseInt(JOptionPane.showInputDialog("digite el primer número por favor"));
      double val2= Integer.parseInt(JOptionPane.showInputDialog("digite el primer número por favor"));
      
      if(val1<val2){
          System.out.println("El primer valor es menor que el segundo ");
      }//menor
      else if(val1>val2){
          System.out.println("El primer valor es mayor que el segundo");
      }//mayor
      else if(val1==val2){
          System.out.println("Los valores son iguales");
      }//igual 
     
       //Pedir al usuario que ingrese un número del 1 al 7, y que el sistema muestre en pantalla a qué día de la semana corresponde ese número (Domingo a Sábado).
       int diaSemana=Integer.parseInt(JOptionPane.showInputDialog("digita un número de 1 a 7 y te digo el día de la semana :)"));
    
       switch(diaSemana){
          case 1: System.out.println("Hoy es lunes de empezar a programar!");    
              break;
          case 2: System.out.println("Hoy es martes de hacer ejercicio");
              break;
          case 3: System.out.println("Hoy es miércoles de comer arepas");
              break;
          case 4: System.out.println("Hoy es jueves de tomar una cerveza");
              break;
          case 5: System.out.println("Hoy es viernes y tu cuerpo lo sabe");
              break; 
          case 6: System.out.println("Hoy es sábado del curso de Java");
              break;  
          case 7: System.out.println("Hoy es domingo de asado");
              break;     
              
          default: System.out.println("la opción es incorrecta, regresa y verifica ");
       }    
       //Hacer un programa que calcule el pago que hacen un grupo de personas para ver una película teniendo en cuenta que si el grupo es menor de 8 personas el pago es 
       //de 80 pesos por persona y para grupos de 8 personas o más el pago es 70 pesos por persona.
       int ticket1=80;
       int ticket2=70;
       int personas=entrada.nextInt();
        System.out.println("Ingrese el número de personas que ingresan");
        if(personas<=7){
            System.out.println("El valor a pagar es $"+(personas*ticket1));
        }//cierre menor7
        else{
            System.out.println("El valor a pagar es $"+(personas*ticket2)); 
        }
      }
    } 


    

  


    
  

