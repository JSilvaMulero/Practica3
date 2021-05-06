/**
 * creación de la clase Empleado, de tipo abstracta, la cual es la clase padre o superclase
 * @author Jeronimo
 * version 1.0
 */
public abstract class Empleado {

	
	
/**
 * declaramos las variables Nombre, edad, salario y Plus, de tipo String, int, double e int respectivamente	
 */
protected String Nombre;
protected int edad;
protected double salario;
final int Plus=300;



/**
 * declaramos las variables Nombre, edad y salario, de tipo String, int y double respectivamente	
 * @param nombre
 * @param edad
 * @param salario
 */
public Empleado(String nombre,int edad,double salario){

	
	
	
/**
 * con la invocacion This obtenemos el nombre, la edad y la comision de Empleado	
 */
this.Nombre=nombre;
this.edad=edad;
this.salario=salario;
}





/**
* vamos ahora con los métodos getters y setters 	  
*/

/**
* con el método Set, obtenemos el nombre, y nos lo devuelve con This
* @param Nombre
*/
public void setNombre(String Nombre){
this.Nombre=Nombre;
}




/**
* con el método Get, obtenemos el nombre, y nos lo devuelve en un return
* @return Nombre
*/
public String getNombre(){
return Nombre;
}
	  



/**
* con el método Get, obtenemos la edad, y nos lo devuelve en un return
* @return edad
*/
public int getEdad() {
return edad;
}



/**
* con el método Set, obtenemos la edad, y nos lo devuelve con This
* @param edad
*/
public void setEdad(int edad) {
this.edad = edad;
}




/**
* con el método Get, obtenemos el salario, y nos lo devuelve en un return
* @return salario
*/
public double getSalario() {
return salario;
}




/**
* con el método Set, obtenemos la edad, y nos lo devuelve con This
* @param salario
*/
public void setSalario(double salario) {
this.salario = salario;
}
	 



/**
* método Plus de tipo publico que devuelva un booleano 
*/
public abstract boolean Plus(); 





/**
* creación del método mostrarDatos con atributo public
*/
public void mostrarDatos(){

	

	
/**
* mostramos por pantalla, concatenada, el nombre, la edad y el salario    
*/	    	
System.out.println("NOMBRE: "+this.Nombre+"EDAD: "+this.edad+"SALARIO: "+this.salario);

  }
}