
//CreaR un array o arreglo unidimensional con un tamaño de 5, asignale los
//valores numéricos ingresados por teclado y muestralos por pantalla.
package ejercicios.prácticos.u6;



public class Ejercicio1 {
    
    public static void main(String[] args) {
        int numeros[]={10,25,0,-4,28,-15,8,0,-1,0};
        int positivo=0;
        int negativo=0;
        int cero=0;
        
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]==0){
                cero+= cero;
                System.out.println("En el array hay "+cero +" ceros");
                             
        }
         if (numeros[i]>0){
                positivo+=positivo;
                System.out.println("En el array hay "+positivo+" números positivos");
        } 
          if (numeros[i]<0){
                negativo+=negativo;
                System.out.println("En el array hay "+negativo+ " números negativos");
    }
    }
}
}
