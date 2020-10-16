
package cursojava;
import java.util.Scanner;
public class Actividad_3_2 {
    
    public static void main(String[] args) {
       
        //1. Realiza un programa que al dividir dos números, muestre por consola el resto de la operación.
        int num1=20, num2=6;
        System.out.println("1. el residuo de las división entre 20 y 6 es: "+num1%num2);
       //2. Realiza un conversor de Dolares a pesos. La cantidad de pesos que se quiere
       //convertir debe ser introducida por teclado. También se debe agrear el impuesto país, al calculo final.
        Scanner teclado=new Scanner(System.in);
         double pesos;
         double dolares=68.61;         
         
        System.out.print("2. Ingrese la cantidad de pesos que desea recibir en dólares por favor: "); 
        pesos=teclado.nextInt();
        double subtotal=dolares*pesos;
        double impuestoPais=subtotal*30/100;
        double total=(subtotal*30/100)+subtotal;
        System.out.println("La cantidad de dólares a recibir es "+total);
        System.out.println("Detalle de su operación; sin impuesto: "+subtotal+". Valor impuesto País "+impuestoPais+":"
                + ".");
        //3.Escribe un programa que sume, reste, multiplique y divida dos números
        //introducidos por teclado. 
        double num3;
        double num4;
        
        System.out.println("3. Ingrese por favor dos valores de su preferencia,"
                + "los cuales se sumaran, restaran, multiplicaran y dividiran."
                + " Evite que sean valores negativos y evite el cero.");
        num3=teclado.nextInt();
        num4=teclado.nextInt();
        
        double suma=num3+num4;
        double resta=num3-num4;
        double multiplicación=num3*num4;
        double division=num3/num4;
              
        System.out.println("El resultado de la suma es: "+suma+". Resta "+resta+". Multiplicación "
        +multiplicación+". División "+division+".");
        
        //4. Escribe un programa que calcule el salario semanal de un empleado en base
        //a las horas trabajadas, a razón de $800 la hora.
        String nombreEmpleado;
        
        System.out.println("4. Ingrese el nombre del empleado por favor.");
        nombreEmpleado=teclado.next();
        
        System.out.println("Ingrese la cantidad de horas trabajadas por favor.");
        int horas;
        int valorHora=800;
        horas=teclado.nextInt();
        int salario=horas*valorHora;
        System.out.println("El empleade "+nombreEmpleado+", recibirá un salario semanal de: "
        +salario);
        
        //5. Se deberá crear un programa que al brindar los datos personales de un estudiante 
        //(nombre, apellido, dni, curso, turno) y las notas de un trimestre, que muestre por consola el promedio.
        String nombre,apellido,curso,turno;
        int dni,nota1,nota2,nota3;
        System.out.println("5. Ingrese por favor el nombre del estudiante a consultar.");
        nombre=teclado.next();
        System.out.println("Ingrese por favor el apellido del estudiante a consultar.");
        apellido=teclado.next();
        System.out.println("Ingrese por favor el DNI del estudiante a consultar.");
        dni=teclado.nextInt();
        System.out.println("Ingrese por favor el curso del estudiante a consultar.");
        curso=teclado.next();
        System.out.println("Ingrese por favor el turno del estudiante a consultar.");
        turno=teclado.next();
        System.out.println("Ingrese por favor la primer nota de "+nombre+" "+apellido);
        nota1=teclado.nextInt();
        System.out.println("Ingrese por favor la segunda nota de "+nombre+" "+apellido);
        nota2=teclado.nextInt();
        System.out.println("Ingrese por favor la tercera nota de "+nombre+" "+apellido);
        nota3=teclado.nextInt();
        System.out.println("El promedio del estudiante "+nombre+" "+apellido+ "es de: "+(nota1+nota2+nota3/3));
        
        //6. Realizar un programa que al ingresar los valores de cada producto por teclado:
        //-Zapatos $1800
        //-Camisa $2500
        //-Pantalón $1900
        //-Corbata $800 
        // teniendo en cuenta que se aplicara al subtotal el importe del IVA (21%), pero ademas se obtiene un descuento del 10% por compra en efectivo.
       //Mostrar por consola el total de la compra.
       
       
       
       System.out.println("Ingrese por favor el valor de los zapatos ");
        int zapatos=teclado.nextInt();
       System.out.println("Ingrese por favor el valor de la camisa ");
        int camisa = teclado.nextInt();
       System.out.println("Ingrese por favor el valor de la corbata ");
        int corbata = teclado.nextInt();
       System.out.println("Ingrese por favor el valor del pantalon ");
        int pantalon = teclado.nextInt();
       
        int compra=zapatos+camisa+corbata+pantalon;
        double iva=compra*21/100;
        double descuento=compra*10/100;
        double totalPago=(compra+iva)-descuento;
        System.out.println("El valor de su compra es de: "+compra+"." );
        System.out.println("El valor del IVA su compra es de: "+iva+"." );
        System.out.println("El valor del descuento por pago en efectivo es de: "+descuento+"." );
        System.out.println("El valor a pagar es de: "+totalPago+"." );
    }

    
}              
    

