

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProfilServlet
 */
public class ProfilServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ProfilServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		String nom = request.getParameter("name");
		String prenom = request.getParameter("prenom");
		String email = request.getParameter("email");
		String telephone = request.getParameter("telephone");
		String password = request.getParameter("password");
		String photo = request.getParameter("photo");
		String description = request.getParameter("description");
		
		Utilisateur u = new Utilisateur();
		u.setNom(prenom);
		u.setNom(prenom);
		u.setEmail(email);
		u.setTelephone(telephone);
		u.setMotDePasse(password);
		u.setDesciption(description);
		
		
		// Méthode qui modifie les infos dans la bdd
		
		
		
=======
		doGet(request, response);
>>>>>>> 0aef54cc2cb1269c703c82aa7dfb442fc20204ac
	}

}
