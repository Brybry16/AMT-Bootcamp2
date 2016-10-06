package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Fruit;
import service.FruitManager;

/**
 *
 * @author tonidias
 */
public class FruitsServlet extends HttpServlet {

    FruitManager fruitsmanager = new FruitManager();
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Object counter = request.getSession().getAttribute("counter");
        if(counter == null){
            request.getSession().setAttribute("counter", new Integer(1));
        }
        else{
            Integer oldValue = (Integer)counter;
            request.getSession().setAttribute("counter", oldValue + 1);
        }
        
        Fruit fruit = fruitsmanager.getRandomFruit();
        request.setAttribute("theFruit", fruit);
        request.getRequestDispatcher("/WEB-INF/pages/Fruit.jsp").forward(request, response);
        
        
    }

    

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
