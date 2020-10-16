
package ejercicios.prácticos.u6;


public class EjercicioJAVA1 {
    public static void main(String[] args) {
        String [] palabra={"A","V","A","J"};
        int n=4;
        System.out.println("Array al derecho");
           for (int i = 0; i < palabra.length; i++) {
               System.out.print(palabra[i]+"\t");
            
        }
           System.out.println(" ");
           System.out.println("Array al revez");
          for (int i = 0; i < palabra.length; i++) {
               System.out.print(palabra[n-1-i]+"\t");//tabulador espacio largo           
            
        }
          System.out.println(" ");
    }
}

