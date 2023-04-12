class Programa{
public static void main(String[] args){
   Alumno a1=new Alumno(1,"Pepe");
   System.out.println(a1);
   System.out.println("numero de matricula = "+a1.getNumMatricula());
   System.out.println("nombre de alumno    = "+a1.getNombre());
   Grupo g1=new Grupo("1DWN");
   g1.add(a1);
   System.out.println(g1);

}
}