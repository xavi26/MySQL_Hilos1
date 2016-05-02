package mysql_hlos;
public class Medico 
{
    String Nombre,ApellidoP,ApellidoM,Especialidad;
    int IdMedico;
    
    public Medico()
    {
        
    }
    
    public Medico(int IdMedico,String Nombre,String ApellidoP,String ApellidoM,String Especialidad)
    {
        this.IdMedico=IdMedico;
        this.Nombre=Nombre;
        this.ApellidoP=ApellidoP;
        this.ApellidoM=ApellidoM;
        this.Especialidad=Especialidad;
    }
    
   public void setIdMedico(int IdMedico)
   {
       this.IdMedico=IdMedico;
   }
   
   public void setNombre(String Nombre)
   {
       this.Nombre=Nombre;
   }
    
   public void setApellidoP(String ApellidoP)
   {
       this.ApellidoP=ApellidoP;
   }
   
   public void setApellidoM(String ApellidoM)
   {
       this.ApellidoM=ApellidoM;
   }
   
   public void setEspecialidad(String Especialidad)
   {
       this.Especialidad=Especialidad;
   }
   
   
   public int getIdMedico()
   {
       return this.IdMedico;
   }
   
   public String getNombre()
   {
       return this.Nombre;
   }
   
   public String ApellidoP()
   {
       return this.ApellidoP;
   }
   
   public String ApellidoM()
   {
       return this.ApellidoM;
   }
   
   public String Especialidad()
   {
       return this.Especialidad;
   }
   String [] getRow()
   {
       String [] row= new String[5];
       row[0] =String .valueOf(IdMedico);
       row[1]= Nombre;
       row[2]=ApellidoP;
       row[3]=ApellidoM;
       row[4]=Especialidad;
       return row;
   }
}
