
package cursojava;
//Ejercicios Practicos N° 2-2
//Declarar una variable de nombre cantidadDeVentanasEnMiCasa y asignarle la cantidad de ventanas que hay en tu casa. Mostrar el valor de la variable por la consola.
//Declarar una variable de nombre soyHumano y asignarle el valor true (verdadero). Mostrar el valor de la variable por la consola.
//Declarar una variable de nombre miGustoDePizzaPreferido y asignarle la variedad de pizza que más te guste usando un String (cadena de caracteres). Mostrar el valor de la variable por la consola.
//Mostrar por la consola los siguientes valores false, 'Hola', 0 y 'Minions'
//Mostrar los siguientes valores: 5 , 6 , 10 usando una misma variable
//Declarar las siguientes variables Nombre, Apellido, Edad, Ocupación, Hobbie, Color Favorito, EsHumano. Deberán asignar valores con el tipo de dato que corresponda, deberan obtener los datos de alguno de sus compañeros y luego que imprima por pantalla con las leyendas correspondientes. Les dejo un ejemplo...
//Datos Personales         
//Nombre:
//Alejandro
//Apellido:
//Zapata
//Ocupación:
//Encargarme de que dejen el curso
//Hobbie:
//Que vuelvan a retomar el curso
//Color favorito:
//Rojo
//EsHuman
//false

public class Actividad_2_2 {
    public static void main(String[] args) {
        
       int cantidadDeVentanasEnMiCasa=8;
       boolean soyHumano=true;
       String miGustoDePizzaPreferido="hawaiana";
       
        System.out.println(cantidadDeVentanasEnMiCasa);
        System.out.println(soyHumano);
        System.out.println(miGustoDePizzaPreferido);
       
        System.out.println(false);
        System.out.println("Hola");
        System.out.println(0);
        System.out.println("Minions");
        
        String nombre = "Pilar";
        String apellido = "Nieto";
        int edad=35;
        String ocupación = "Administradora";
        String hobbie = "Jugar Rugby";
        String colorFavorito = "azul";
        Boolean eshumano = true;
        
        System.out.println ("DATOS PERSONALES: ");
        System.out.println("NOMBRE: "+ nombre);
        System.out.println("APELLIDO: "+ apellido);
        System.out.println("EDAD: "+ edad);
        System.out.println("HOBBIE: "+ hobbie);
        System.out.println("COLOR FAVORITO: "+colorFavorito);
        System.out.println("ES HUMANO: " + eshumano);           
               
        
    }
    
}
