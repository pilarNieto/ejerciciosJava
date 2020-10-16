
package cursojava;

import java.util.Scanner;

public class Actividad_3_3 {
    public static void main(String[] args) {
//1) System.out.println(25>15);
//True: mayor 25.
System.out.println(25<15);
//2) System.out.println(0>15);
//False: 0 no es mayor a 15
System.out.println(0<15);
//3) System.out.println(5<5);
//False: 5 es igual a 5 
System.out.println(5==5);
//4) System.out.println(5>=15);
//False: 5 no es mayor o igual.
System.out.println(5<=15);
//5) System.out.println(8!=15);
//Veradero: 8 distinto a quince.
System.out.println(8==15);
//6) System.out.println(4==4);
//Verdadero: 4 igual a 4.
System.out.println(4!=4);
//7) System.out.println(10>(3+4));
//Verdadero: 10 mayor a 7;
System.out.println(10<(3+4));
//8) System.out.println("casa"=="casa");
//dos Strings no se pueden relacionar con ==.
System.out.println("casa".equals("casa"));
//9) System.out.println("casa"=="Casa");
//ídem
//10) System.out.println(true==true);
//Verdadero: trur igual a true.
System.out.println(true!=true);
//11) System.out.println(false!=true);
//Verdadero: false distinto a true.
System.out.println(false==true);
//12) System.out.println(false==true);
//Falso: no es igual falso a verdadero.
System.out.println(false!=true);
//13) Dado las siguientes variables hacer una comparación de alguno tipo (<,>,==) 
//y comentar porque da el resultado
int edad = 19;
int mayoredad = 18;
System.out.println("Ya pasé la mayoría de edad? "+(edad>mayoredad));
//A la pregunta si pasó la mayoría de edad es verdadero da True dado
//que comparamos los valores de las variables y 19 supero y es mjayor que 18.
//14) Hacer un programa que me permita ingresar dos valores de tipo entero,
//luego hacer una comparación entre ellos y que muestre por consola el resultado de dicha comparación

int valorOne;
int valorTwo;
 Scanner teclado=new Scanner(System.in);
        System.out.println("Ingresa primer valor a comparar");
        valorOne=teclado.nextInt();
        System.out.println("Ingresa el seggundo valor a comparar");
        valorTwo=teclado.nextInt();
        
      System.out.println("Comparación: "+(valorOne<valorTwo)+" ó "+(valorOne>valorTwo));
    }
    
}
