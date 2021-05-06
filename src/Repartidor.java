/**
 * creación de la clase Repartidor, la cual es una clase derivada de la clase Empleado
 * @author Jeronimo
 * version 1.0
 */
public class Repartidor extends Empleado {


	
	
/**
* declaramos la variable Zona, de tipo int (entero) 
*/	
private int  Zona;
int numero=0;



/**
 * declaramos la variables Zona, de tipo int
 * @param Zona
 * declaramos la variable nombre, de tipo String
 * @param nombre
 * declaramos la variable edad, de tipo int
 * @param edad
 * declaramos la variable salario, de tipo double
 * @param salario
 */
public Repartidor(int  Zona,String nombre ,int edad,double salario){
	

	
/**
* con super invocamos de la clase padre, los atributos nombre, edad y salario 
*/	
super(nombre,edad,salario);


/**
* creación de la variable this, invocando el  atributo Zona de esta clase, Repartidor
*/
this.Zona=Zona;
}



/**
* creación del método Get para obtener el número correspondiente
* @return numero
*/
public int getNumero() {
return numero;
}




/**
* creación del método Set para obtener el número correspondiente, de tipo int (entero)
*/
public void setNumero(int numero) {
this.numero = numero;
}






/**
* método Plus de tipo publico que devuelva un booleano 
*/    
public  boolean Plus(){
	

	
	
/**
* utilizamos if, con ello obtenemos si la edad es menor que 25 gracias al metodo Get y si la Zona es igual a 3 con la invocación This 
*/	
if(super.getEdad()<25 && this.Zona==3){
	
	
	
/**
* creación de una nueva variable llamada Nuevo de tipo double, la cual es invocada con Super y con This, ambas de la clase padre     	
*/	
double Nuevo=(super.getSalario()+this.Plus);   



/**
* mediante la invocación de super, y el método Set de Salario, obtenemos el nuevo salario, y nos devuelve un valor de tipo true 
*/
super.setSalario(Nuevo);
return true;
}





/**
* hacemos que nos devuelva un valor de tipo false 
*/
return(false);   
}




/**
* creación del método mostrarDatos con atributo public
*/
public void mostrarDatos(){
	
	

	
/**
* mostramos por pantalla, concatenada, el nombre, la edad, el salario y la zona   
*/	
System.out.println("NOMBRE: "+this.Nombre+"EDAD: "+this.edad+"SALARIO: "+this.salario+"Zona"+this.Zona);
  
 }
}