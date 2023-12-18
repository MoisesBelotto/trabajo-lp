package practica5;

/**@author moises belotto
 * Estudiante
 */
public class Estudiante {

    private int creditos;

    public Estudiante(String nombre, int edad){
    
      super(nombre,edad);
       this.creditos = 60;
    
    }
     public int getcreditos(){
         return this.creditos;
     }
    
      public void mostrarDatos(){
       super.mostrarDatos();
       System.out.println("Estudiante Matriculado de " +creditos+ " Creditos");
    
      }
    
    
    
    
    }    
