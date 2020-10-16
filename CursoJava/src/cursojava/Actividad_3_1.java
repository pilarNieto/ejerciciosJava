//
//1.    Declarar 2 variables:
//
//o    miAnioDeNacimiento y asignarle el valor de tu año de nacimiento.
//
//o    meGustariaTener80Anios y asignarle el número 80.
//
//Mostrar por consola el año en el que vas a cumplir 80 años.
//
//2.    Declarar 2 variables:
//
//o    variable costoDeUnaTele y asignarle el valor 10000.
//
//o    variable ahorros y asignarle el valor 9000.
//
//Mostrar por consola cuanto dinero te falta para comprar la tele.
//
//3.    Declarar 2 variables:
//
//o    diasPorAnio y asignarle el número 365
//
//o    cantidadDeAniosEnUnaDecada y asignarle el número 10
//
//Mostrar por consola cuantos días hay en una década.
//
//4. Teniendo en cuenta que una pizza siempre tiene 8 porciones, mostrar por la consola cuantas pizzas tengo en la mesa si conté 24 porciones.
//
//5. Se deberá crear un programa que haga la conversión de dolares a pesos. La cantidad en pesos que se quiere convertir deberá estar almacenada en una variable. 
//
//6. Se deberá crear un programa que al brindar 2 datos numéricos muestre por consola la superficie del cuadrado, rectángulo, triangulo y circulo. 
//
//7. Se deberá crear un programa que al brindar los datos personales de un estudiante (nombre, apellido, dni, curso, turno) y las notas de un trimestre (a elección) que muestre por consola el promedio.
//
//8. Realizar un programa que calcule la siguiente compra:
//-Zapatos $1800
//-Camisa $2500
//-Pantalón $1900
//-Corbata $800 
//Aplicar al subtotal el importe del IVA (21%), también se aplica un descuento del 10% por compra en efectivo
//Mostrar todas las operaciones y el total a pagar por consola.


package cursojava;
public class Actividad_3_1 {
    public static void main(String[] args) {
        int miAniodeNacimiento=1985;
        int meGustariaTener80Anios=80;
         System.out.println("1. Cumpliré 80 años en el año "+ (miAniodeNacimiento+meGustariaTener80Anios));
         
        int diasPorAnio=365;
        int cantidadDeAniosEnUnaDecada=10;
         System.out.println("2. Una decada tiene: "+(diasPorAnio*cantidadDeAniosEnUnaDecada)+" días.");
         
        int porcionesTotal=24;
        int porcionesporPizzas=8;
        int pizzas=porcionesTotal/porcionesporPizzas;
         System.out.println("3. En la mesa hay "+(pizzas)+" pizzas.");
         
        int pesos=500;
        double dolares=120;    
         System.out.println("4. La cantidad de pesos por los dólares recibidos es: $"+(pesos*dolares));
         
        int ladoA=5;
        int ladoB=30;
        
        System.out.println("5. Superficie del cuadrado es: "+(ladoA*ladoA));
        System.out.println(" Superficie del rectangulo es: "+(ladoA*ladoB));
        System.out.println(" Superficie del triangulo es: "+((ladoA*ladoB)/2));
        System.out.println(" Superficie del circulo es: "+((2*3.1416)*ladoA));
        
        String nombre="Pilar";
        String apellido="Nieto";
        int DNI=95103681;
        String curso="Java";
        String turno="Noche";
        
        double nota1=3.5;
        double nota2=4.5; 
        double nota3=3;
        double promedio=(nota1+nota2+nota3/3);
        
        System.out.println("6. El alumno "+nombre+" "+apellido+" con DNI "+DNI+" del curso "+curso+" del turno "+turno+" "
                + "obtuvo un promedio "+promedio+ " este trimestre.");
        
        int z =1800;
        int c=2500;
        int p=1900;
        int co=800;
        double subTotal=z+c+p+co;
        double iva=(subTotal*21)/100;
        double total=subTotal+iva;
        
        System.out.println("7. El total de la compra sin IVA es de $"+subTotal+" ,el IVA de su compra es de "
                +iva+ " por lo tamto el total a pagar es de $"+total+".");
    }        

}

