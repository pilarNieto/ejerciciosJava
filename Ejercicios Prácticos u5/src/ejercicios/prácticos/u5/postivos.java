/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios.prácticos.u5;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author GATICOS
 */
public class postivos {
    
    public static void main(String[] args) {
           System.out.println("Este es el arreglo");
           llenarArreglo();
        
             
         }
         public static int [] llenarArreglo(){
         int num= Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño del arreglo"));
        int numeros[]=new int[num];
         for (int i = 0; i < numeros.length; i++) {
             System.out.println("Ingrese el dato número "+(i+1)+" del arreglo");
             Scanner sc=new Scanner(System.in);
             numeros[i]=sc.nextInt();
             System.out.println(numeros);
             
    }
        return numeros;
    
    }
}
    

