/**
 * creación de la clase Comercial, la cual es una clase derivada de la clase Empleado
 * @author Jeronimo
 * version 1.0
 */
public class Comercial extends Empleado {



	
/**
* declaramos la variable Comision de tipo double 
*/
private double Comision;




/**
 * declaramos las variables comision, nombre, edad y salario, las cuales son de tipo double, String, int y double respectivamente
 * @param comision
 * @param nombre
 * @param edad
 * @param salario
 */
public Comercial(double comision,String nombre ,int edad,double salario){

	
	
/**
* con super invocamos de la clase padre, los atributos nombre, edad y salario 
*/
super(nombre,edad,salario);




/**
* creación de la variable this, la cual invoca atributos de la clase padre, en este caso Comision
*/
this.Comision=comision;
}
    


/**
* método Plus de tipo publico que devuelva un booleano 
*/
public  boolean Plus(){

	
	
	
/**
* utilizamos if, con ello obtenemos si la edad es mayor que 30 gracias al metodo Get y si la comision es mayor de 300 con la invocación This 
*/
if(super.getEdad()>30 && this.Comision>300 )
{

	
	
/**
* creación de una nueva variable llamada NuevoSalario de tipo double, la cual es invocada con Super y con This, ambas de la clase padre     	
*/
double NuevoSalario =(super.getSalario()+this.Plus);




/**
* mediante la invocación de super, y el método Set de Salario, obtenemos el nuevo salario, y nos devuelve un valor de tipo true 
*/
super.setSalario(NuevoSalario);
return true;
}



/**
* hacemos que nos devuelva un valor de tipo false 
*/
return false;
}



/**
* creación del método mostrarDatos con atributo public
*/
public void mostrarDatos(){

	
	
/**
* mostramos por pantalla, concatenada, el nombre, la edad, el salario y la comisión   
*/
System.out.println("NOMBRE: "+this.Nombre+"EDAD: "+this.edad+"SALARIO: "+this.salario+"COMISION: "+this.Comision);

 }
}