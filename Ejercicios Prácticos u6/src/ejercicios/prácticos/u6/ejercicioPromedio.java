
package ejercicios.prácticos.u6;


public class ejercicioPromedio {
    public static void main(String[] args) {
         int [] promedio={5,6,8,9,5,2,-9,7,5,0};
        int acum=0;
         for (int i = 0; i < promedio.length; i++) {
             acum+=promedio[i];
             System.out.println("LA SUMA DE LOS NUMEROS DEL ARRAY ES "+acum); 
        }
         System.out.println("EL PROMEDIO ES DE  "+(acum/promedio.length));
    }
   
    
    
}
