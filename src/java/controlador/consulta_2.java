package controlador;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jason
 */
@WebServlet(name = "consulta_2", urlPatterns = {"/consulta_2"})
public class consulta_2 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            consultas co = new consultas();
            String user = request.getParameter("user_name");
            String pass = request.getParameter("password");
            if(co.autenticacion (user, pass ))
            {
              response.sendRedirect("correcto.jsp");
            } 
              
        }
    }

   
    


