package cursojava;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Actividad_5_2 {
    public static void main(String[] args) {
   //1. Escribir un programa que imprima la palabra “Hola” 10 veces utilizando Ciclo For
        System.out.println("1. Diez holas! "); // numero de ejercicio
        for (int i = 1; i < 11; i++) {
            System.out.println("Hola ."+i); //i para indicar # de iteración.
        }//cierre for
    //2. Mostrar por pantalla el siguiente patron: cuadro *
    System.out.println("2. Patrón "); // numero de ejercicio
        for (int i = 0; i < 5; i++) {
            System.out.print(" *");//asterisco con eespacio para que se vea más etetico
            
            for (int j = 0; j < 10; j++) {
                System.out.print(" *"); 
            }
            System.out.println(" "); // separador cierre
        }
        System.out.println("3. Patrón");
        int contador=0; //inicializa contador
        for (int i = 0; i < 5; i++) {
            contador++;
            System.out.println(""); //salto de linea
            for (int j = 0; j < contador; j++) {
                System.out.print("*");
            }  //cierre for
 //4. Sumar una serie de números (positivos o negativos) ingresados por teclado hasta que el usuario ingrese un 0.
        System.out.println("4. Suma #");
        Scanner obtener = new Scanner(System.in);
        int total=0,nuevoNumero;    //inicializamos variables       
 
        do
        {
            System.out.print("Ingrese el numero .");//pedimos valores
            nuevoNumero = obtener.nextInt();  //lee valores         
            total=total+nuevoNumero;  //sumamos los valores ingresados
        }
 
        while(nuevoNumero!=0);  //paramos cuando ingresa cero
        System.out.println("La suma de número es "+total); //mostramos suma por consola
             
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
            
}


