

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HistoriqueServlet
 */
public class HistoriqueServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public HistoriqueServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Reservation reservation1 = ReservationManager.  (); // Methode pour récupérer les infos du trajet par la requete
		request.setAttribute("date", date); // Identification de l'attribut à modifier
		request.setAttribute("nom", nom); 
		request.setAttribute("prenom", prenom); 
		request.setAttribute("heure", heure); 
		request.setAttribute("telephone", telephone); 
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/historique.jsp").forward(request,  response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
