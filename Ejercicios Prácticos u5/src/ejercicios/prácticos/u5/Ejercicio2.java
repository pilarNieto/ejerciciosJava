/*
 Codifique un programa en Java que permita ingresar dos números. Se le
preguntará al usuario si dichos números quiere sumarlos o restarlos. Si el
usuario ingresa ‘S’ dichos números se sumarán; si ingresa ‘R’, se restará.
La suma y la resta de dichos números debe realizarse con dos funciones.
En el caso de la suma, dicho método recibirá como parámetros los dos
números ingresados y devolverá la suma de los dos números. En el caso
de la resta se procederá de la misma manera, pero el método devolverá
la resta de los mismos.

 */

package ejercicios.prácticos.u5;


import javax.swing.JOptionPane;



public class Ejercicio2
{
  int s;
  int r;
  int m;
  int d;  
  public static int s(int a,int b)
    {
        int s=a+b;
        return s;
        
    }
    public static int r (int a, int b)
    {
        int r=a-b;
        return r;
    }
    public static int m (int a, int b)
    {
        int m=a*b;
        return m;
    }
    public static float d (float a, float b)
    {
        float d=a/b;
        return d;
    } 
public static void main(String[] args)
{
  
  int n1= Integer.parseInt(JOptionPane.showInputDialog("digite dos numeros por favor"));
  int n2=Integer.parseInt(JOptionPane.showInputDialog("digite dos numeros por favor"));
  String sumar,restar,multiplicar,dividir= JOptionPane.showInputDialog("Digite la operación que desea realizar");
  String operacion = null;
  switch(operacion){
          case "sumar": System.out.println(" la suma de los dos números es "+s(n1,n2));    
              break;
          case "restar": System.out.println(" la resta de los dos números es "+r(n1,n2));
              break;
          case "multiplicar": System.out.println("la multiplicación de los dos números es "+m(n1,n2));
              break;
          case "dividir": System.out.println("la suma de los dos números es "+d(n1,n2));
              break;
          default: System.out.println("la opción es incorrecta");
  
 
  
  
  } 
  
  
  }
    
   
}