package Alumno;
/** 
*Esta clase define el main
* @author Iván
* @version 1.0
*
*/
public class Main {

	public static void main(String[]args){
		
		 Alumno a1 = new Alumno("Iván", "Velasco");
		 System.out.println("Datos Alumno1");
		 System.out.println(a1.getNombre());
		 System.out.println(a1.getApellido());
		 System.out.println(Alumno.getNumAlumnos());
		 System.out.println(Alumno.getNotaMedia());
	 
	 
		 Alumno a2 = new Alumno(a1); 
		 System.out.println("Datos Alumno2copia");
		 System.out.println(a2.getNombre());
		 System.out.println(a2.getApellido());
		 System.out.println(Alumno.getNumAlumnos());
		 System.out.println(Alumno.getNotaMedia());
		 
		 
		 a1.setNombre("Pepe");
		 System.out.println("Datos Alumno1 modificado");
		 System.out.println(a1.getNombre());
		 System.out.println("Datos Alumno2copia modificado");
		 System.out.println(a2.getNombre());
		 
		 if(a1.equals(a2)){
			 System.out.println("Son iguales");
		 }else{
			 System.out.println("Son distintos");
			 
		 }
		 
		 Alumno a3 = new Alumno();
		 	System.out.println("Datos Alumno3");
		 	System.out.println(a3.getNombre());
		 	System.out.println(a3.getApellido());
		 	System.out.println(Alumno.getNumAlumnos());
		 	System.out.println(Alumno.getNotaMedia());
		 	
		 	 Alumno a4 = new Alumno("Vinicius", "Junior");
			 System.out.println("Datos Alumno1");
			 System.out.println(a4.getNombre());
			 System.out.println(a4.getApellido());
			 System.out.println(Alumno.getNumAlumnos());
			 System.out.println(Alumno.getNotaMedia());
			 
			 System.out.println("Numero de alumnos es: "+Alumno.getNumAlumnos());
			 
			 System.out.print("Nota Media  incrementada 2 veces: ");
			 a4.resultado();
			 System.out.println(Alumno.getNotaMedia());
	 }
}


