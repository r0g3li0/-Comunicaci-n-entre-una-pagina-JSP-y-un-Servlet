
package beans;

import java.text.DecimalFormat;

public class Alumno 
{
    private String matricula;
    private String nombre;
    private String apellido; 
    private int CVJ;
    private int DWI;
    private int Ecdb;
    private double Prom;
    
    public Alumno()
    {
        matricula =" ";
           nombre =" ";
         apellido =" ";
              CVJ = 0;
              DWI = 0;
             Ecdb = 0;
            Prom= 0.0;
    }
    public Alumno(String matricula, String nombre, String apellido, int CVJ, int DWI, int Ecdb)
    {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.CVJ  =  CVJ;
        this.DWI  =  DWI;
        this.Ecdb =  Ecdb;
    }
    
    
                public String getMatricula()
                {
                    return matricula;
                }
                public String getNombre()
                {
                    return nombre;
                }
                 public String getApellido()
                {
                    return apellido;
                }
                public int getCVJ()
                {
                    return CVJ;
                }
                public int getDWI()
                {
                    return DWI;
                }
                public int getEcdb()
                {
                    return Ecdb;
                }

    
    
    public void setMatricula(String matricula)
    {
        this.matricula = matricula;
    }
       
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
   
    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }
    
    public void setCVJ(int CVJ)
    {
        this.CVJ = CVJ;
    }
    
    public void setDWI(int DWI)
    {
        this.DWI = DWI;
    }
     
    public void setEcdb(int Ecdb)
    {
        this.Ecdb = Ecdb;
    }
    
        
    public double Prom()
    {
        
        Prom=(CVJ+DWI+Ecdb)/3.0;
        DecimalFormat df=new DecimalFormat("#.00");
        Prom=Double.parseDouble(df.format(Prom));
        return Prom;
    }
}

