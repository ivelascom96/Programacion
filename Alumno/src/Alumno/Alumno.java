package Alumno;
/**
 * 
 * Esta clase define el nombre los apellidos el numero de alumnos y la Nota media de un alumno
 * @author Iván
 * @version 1.0
 *
 */
public class Alumno {

	
		protected String nombre;
		protected String apellido;
		private static int numAlumnos;
		protected static double notaMedia;
		
		/**
		 * 
		 * @param nombre
		 */
		public void setNombre (String nombre){
			this.nombre = nombre;
		}
		
		/**
		 * 
		 * @return nombre
		 */
		public String getNombre(){
			return this.nombre;
		}
		
		/**
		 * 
		 * @param apellido
		 */
		public void setApellido (String apellido){
			this.apellido = apellido;
		}
		
		/**
		 * 
		 * @return apellido
		 */
		
		public String getApellido(){
			return this.apellido;
		}
		
		/**
		 * 
		 * @param numAlumnos
		 */
		public static void setNumAlumnos(int numalumnos1){
			numAlumnos = numalumnos1;
		}
		
		/**
		 * 
		 * @return numAlumnos
		 */
		
		public static int getNumAlumnos(){
			return numAlumnos;
		}
		
		/**
		 * 
		 * @param NotaMedia
		 */
		
		public static void setNotaMedia(double notaMedia1){
			notaMedia = notaMedia1;
		}
		
		/**
		 * 
		 * @return NotaMedia
		 */
		
		public static double getNotaMedia(){
			return notaMedia;
		}
		
		
		/**
		 * Constructor que recibe un objeto
		 * @param alumno
		 */
		public Alumno(Alumno alumno){ //Constructor copia//
			this.nombre = alumno.nombre;
			this.apellido = alumno.apellido;
			Alumno.numAlumnos++;
		}
		
		/**
		 * Constructor que recibe un objeto
		 * @param alumno
		 */
		public Alumno(){ // Constructor por Defecto//
			this.nombre = "nombre";
			this.apellido = "apellido";
			Alumno.numAlumnos++;
		}
		
		/**
		 * Constructor que recibe un objeto
		 * @param alumno
		 */
		public Alumno(String nombre, String apellido){ //Constructor por parametros//
			this.nombre = nombre;
			this.apellido = apellido;
			Alumno.numAlumnos++;
		}
		/**
		 * @param incrementar
		 */
		
		public void incrementar(){
			Alumno.notaMedia++;
		}
		/**
		 *@param resultado 
		 */
		
		public void resultado (){
			incrementar();
			this.incrementar();
		}
	

	
	
	
}



