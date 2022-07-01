package servlets;

import beans.Alumno;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Comunicacion extends HttpServlet 
{
   private Alumno a[]=new Alumno[10];
        int cont = 0;

        
  protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
  {
      response.setContentType("text/html;charset=UTF-8");                
      
      PrintWriter out = response.getWriter();
      
        a[cont]=new Alumno();
        a[cont].setMatricula(request.getParameter("tfmatricula"));
        a[cont].setNombre(request.getParameter("tfnombre"));
        a[cont].setApellido(request.getParameter("tfapellido"));
        a[cont].setCVJ(Integer.parseInt(request.getParameter("tfcvj")));
        a[cont].setDWI(Integer.parseInt(request.getParameter("tfdwi")));
        a[cont].setEcdb(Integer.parseInt(request.getParameter("tfecdb")));
        a[cont].Prom();

        cont++;
       
       
       out.println ("<h2 align=\"center\">Registro de Alumnos</h2>");
       
               
                out.println("<table align=\"center\" border=\"1px\" bgcolor=\"orange\" width=\"900px\">"
                               
                               + "<tr>"
                               + "<th>MATRICULA</th>"
                               + "<th>NOMBRE</th>"
                               + "<th>APELLIDO</th>"
                               + "<th>CJV</th>"
                               + "<th>DWI</th>"
                               + "<th>ACBD</th>"
                               + "<th>PROM</th>"
                               + "</tr>");
        
            
            {
                for(int c=0; c<cont; c++)
                out.println("<tr bgcolor=\"wheat\">"
                            +"<td>"+a[c].getMatricula() +"</td>"
                            +"<td>"+a[c].getNombre()    +"</td>"
                            +"<td>"+a[c].getApellido()  +"</td>"
                            +"<td>"+a[c].getCVJ()       +"</td>"
                            +"<td>"+a[c].getDWI()       +"</td>"
                            +"<td>"+a[c].getEcdb()      +"</td>"
                            +"<td>"+a[c].Prom()         +"</td>"
                            +"</tr>"
            
            );
            
                  out.println("<br>"); 
                  out.println("</table>");
             }    
             
                  out.println ("<body bgcolor=\"grey\">");
                  out.println("<table align=\"center\" border=\"0px\" bgcolor=\"orange\" width=\"900px\">"
                               + "<tr>"
                               + "<th><h4 align=\"center\"><a href=\"Registroalumnos.jsp\"> Agregar Registro</a></h4> </th>"
                               + "</tr>");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)         throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

    private void setMatricula(String parameter) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
