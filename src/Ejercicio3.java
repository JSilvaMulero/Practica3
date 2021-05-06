/**
 * creación de la clase Ejercicio3, la cual es la clase principaL
 * @author Jeronimo
 * version 1.0
 */
public class Ejercicio3 {



	
/**
 * 
 * creación del metodo main, dentro del cual introducimos los empleados a gestionar que nos pide el enunciado del ejercicio
 * @param args
 */
public static void main(String[] args){

	
	
	
/**
* declaramos los atributos de los empleados, nombre, edad y salario son comunes a ambos tipos de empleados, 
* en el empleado comercial, aparte de los atributos nombre, edad y salario, tiene otro atributo llamado Comision
*/
Comercial c1=new Comercial(300000,"jose", 40,200);
	    



/**
* en el empleado repartidor, aparte de los atributos nombre, edad y salario, tiene otro atributo llamado Zona
*/
Repartidor R1=new Repartidor(3,"ivan",30,200);
Repartidor R2=new Repartidor(3,"alberto",30,200);




/**
* creación del método Plus, la cual se aplica a los empleados
 */
c1.Plus();
R1.Plus();
R2.Plus();




/**
* creacion del método mostrarDatos, la cual se aplica a los empleados
*/
c1.mostrarDatos();
R1.mostrarDatos();
R2.mostrarDatos();
	    


/**
* mostramos los datos de Salario del empleado Comercial por pantalla
*/
System.out.println(c1.getSalario());

 }
}