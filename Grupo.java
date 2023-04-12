import java.util.ArrayList;
class Grupo
{
   //atributos
   private String nomGrupo;
   private ArrayList<Alumno> alumnos;
   //constructor
   public Grupo(String nomGrupo)
   {
      this.nomGrupo=nomGrupo;
      this.alumnos=new ArrayList<>();
   }
   public void add(Alumno a){
      alumnos.add(a);
   }
   public String toString(){
      return "Grupo [ nomGrupo="+nomGrupo+", alumnos="+alumnos+"]";
   }
}