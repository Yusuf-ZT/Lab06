
package servlets;

import java.io.IOException;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class ShoppingListServlet extends HttpServlet {





    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
        getServletContext().getRequestDispatcher("/WEB-INF/shoppinglist.jsp").forward(request, response);
        
        
        
        
        
        
        
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        String uname = request.getParameter("username");
        String addItem = request.getParameter("addItem");
        
        if(uname == null || uname.equals("")) {
            String invalidMessage = "You must enter a name";
            request.setAttribute("nullMessage", invalidMessage);
            getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
        }
        else if(uname != null || !uname.equals("")){
            getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request, response);
        }
        
        if(addItem == null || addItem.equals("")) {
            String invalidMessage = "You must enter an item";
            request.setAttribute("nullMessage", invalidMessage);
            getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request, response);
            
        }
        else if (addItem != null || !addItem.equals(""))  {
            getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request, response);
        }
        
        
        
        

    }



}
