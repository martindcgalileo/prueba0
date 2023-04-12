class Alumno
{
   //atributos
   private int numMatricula;
   private String nombre;
   //constructor
   public Alumno(int numMatricula, String nombre)
   {
      this.numMatricula=numMatricula;
      this.nombre=nombre;
   }
   @Override
   public String toString(){
      return "Alumno[ numMatricula="+numMatricula+", nombre="+nombre+"]";
   }
}