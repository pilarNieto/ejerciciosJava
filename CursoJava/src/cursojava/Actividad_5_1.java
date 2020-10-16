
package cursojava;

import javax.swing.JOptionPane;
public class Actividad_5_1 {   
    public static void main(String[] args) {     
    
  //1. Escribir un programa que imprima la palabra “Hola Java” 10 veces
        System.out.print("1. ");
    int i =1; //inicializa variable
    while(i<=10){
            System.out.println("Hola Java ."+i);
    i++; //contador
    }  
    
 //2. Mostrar por pantalla los siguientes patrones://********** (10 asteriscos)
    int ast=1; //inicializa la variable
    System.out.print("2. ");
     while(ast<=10){
         
         System.out.print("*");
    ast++; //contador
        
     } //cierra while
        System.out.println(" ");//separador
    

  //3. Escribir un programa que muestre: todos los números enteros entre 1 y 100.
       int numE=1;
        System.out.print("3. ");//número del ejercicio
        while(numE<=100){
            System.out.print(numE+"-");
            numE++;
   } //cierra while
        System.out.println(" "); // separador
    //4. Escribir un programa que muestre: todos los números enteros entre 100 y 1 (descendente).
        int numN=100;
        System.out.print("4. ");//número del ejercicio
        do{
            System.out.print(numN+"-");
            --numN;
        }
       while(numN>=0);
       System.out.println(" "); // separador
      //5. Pedirle al usuario la temperatura promedio de los últimos 7 días y mostrar el promedio semanal.
       System.out.print("5. ");//número del ejercicio
       int dias=0;
       double temperatura=0; //inicializa acumulador
       
       while(dias<=6){
           dias++;
        temperatura = temperatura+Double.parseDouble(JOptionPane
                                        .showInputDialog(dias+". Introduce  la temperatura:"));      
        
      
        }
        System.out.println("el promedio de temperatura de esta semana fue de "+(temperatura/7)+" grados"); 
    //6. Idem anterior, pidiéndole al usuario la cantidad de días que quiere promediar.  
    System.out.print("6. ");//número del ejercicio
       int cont=0; //inicializa contador
       int numUsuario=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de días a promediar la temperatura"));
       double tempe=0; //inicializa acumulador       
       while(cont<numUsuario){
           cont++;
       tempe = tempe+Double.parseDouble(JOptionPane
                                        .showInputDialog(cont+". Introduce  la temperatura:"));      
             
        }
        System.out.println("el promedio de temperatura de los días que solicitó fueron "+(tempe/cont)+" grados");
     //7. Se ingresan un conjunto de n alturas de personas por teclado. Mostrar la altura promedio de las personas.
     System.out.print("76. ");//número del ejercicio
     int con=0; //inicializa contador
     double alturas=0; //inicializa acumulador
     int per=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de personas que mediremos"));
        
      while(con<per){
          con++;
          alturas=alturas+Double.parseDouble(JOptionPane.showInputDialog(con+". Ingrese las alturas a promediar"));
      }
      System.out.println("el promedio de altura de las personas es "+(alturas/per));
    }
            
}   
  

    
      
    

