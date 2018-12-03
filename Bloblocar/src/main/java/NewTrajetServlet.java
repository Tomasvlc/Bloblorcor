

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.jni.Time;

/**
 * Servlet implementation class NewTrajetServlet
 */
public class NewTrajetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public NewTrajetServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/WEB-INF/posterTrajet.jsp").forward(request,  response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String depart = request.getParameter("depart");
		String arrivee = request.getParameter("arrivee");
		String hdepart = request.getParameter("hdepart");
		String jour = request.getParameter("jour");
		String prix = request.getParameter("prix");
		
		Trajet t = new Trajet();
		t.setDepart(depart);
		t.setArrive(arrivee);
		t.setHeureDepart(hdepart);
		
		t = TrajetManager.insertTrajet(t);
		
		
		doGet(request, response);
	}

}
