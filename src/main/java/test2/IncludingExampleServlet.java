 package test2;

import java.io.IOException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/includeExample")
public class IncludingExampleServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        // Include content of another resource
        RequestDispatcher dispatcher = request.getRequestDispatcher("/includedContent");
        dispatcher.include(request, response);
        
        response.getWriter().write("<p>This is the content from the including servlet.</p>");
    }
}
