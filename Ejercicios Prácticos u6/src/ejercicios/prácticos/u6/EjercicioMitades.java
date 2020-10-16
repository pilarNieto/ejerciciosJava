
package ejercicios.prácticos.u6;
//Desarrollar un algoritmo que permita mostrar un arreglo de enteros con
//sus valores a la mitad. Ejemplo: Arreglo {1,2,3,4}, la computadora



//muestra: 0.5 1.0 1.5 2.0. 

public class EjercicioMitades {
    public static void main(String[] args) {
       double [] mitades= {1,2,3,4};
       double mit;
      
        for (int i = 0; i < mitades.length; i++){
            mit=mitades[i]/2;
            mitades[i]= mit;
            System.out.println(mitades[i]);              
        }
        
    }

}