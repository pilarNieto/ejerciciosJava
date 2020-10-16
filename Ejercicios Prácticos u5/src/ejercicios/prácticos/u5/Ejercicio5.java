//Crea una función cantidadDeDivisores, que reciba un número entero y
//devuelva la cantidad de divisores (por ejemplo, para el número 16, sus
//divisores son 1, 2, 4, 8, 16, por lo que la respuesta debería ser 5). Ayuda:
//un número es múltiplo de otro cuando al dividir los números obtengo resto
//0 (cero)

package ejercicios.prácticos.u5;

import javax.swing.JOptionPane;

class Ejercicio5 
{
    
    public static void main(String[] args) 
    {
      int num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese por favor un numero entero positivo"));
        System.out.println("los divisores del numeros son "+ cantidadDivisores(num));
    }
    public static int cantidadDivisores(int num)
    {
        for (int i = 1; i <=num ; i++)
        {
          if(num%i==0){
             System.out.println("Elnúmero es "+i+ " divisor de "+num);
        }
         
        }
        return num;
 
        
            
    }
}  
  
       
       
    
    
    
    
