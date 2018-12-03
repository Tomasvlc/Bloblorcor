import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UtilisateurBdd {
	private static Connection c;

	public static void connectToDatabase() {
		// Etape 1 : on charge le driver JDBC pour MySQL
		// Si on utilise un autre type de base, on changera uniquement le driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// Etape 2 : on se connecte à la base de données
		// Erreurs communes : 
		// La base de données doit accepter les connections à distance pour cela
		// Enfin, on s'assure que l'utilisateur cible a les droits pour se connecter à distance

		try {
			c = DriverManager.getConnection("jdbc:mysql://vps601683.ovh.net:3306/Covoiturage", "root", "BithBem9");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void disconnectFromDatabase() {
		if (c != null)
		{
			try {
				c.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static Utilisateur selectUtilisateur(String email)
	{	
		connectToDatabase();
		String query = "SELECT * FROM Utilisateurs WHERE email = '" + email + "'";
		Utilisateur u = new Utilisateur();
		Statement statement = null; // Objet JDBC qui va être en charge d'éxecuter la requête - même principe avec SQLite
		ResultSet resultat = null; // Object JDBC qui va être en charge de gérer le résultat de la requête

		try {
			statement = c.createStatement(); 
			resultat = statement.executeQuery(query); // On crée la requête et on l'execute 
			// resultat contient le résultat de la requête, on boucle dessus pour récupérer toutes les réponses
			while (resultat.next()) {
				u = new Utilisateur(resultat.getInt("ID"), resultat.getString("nom"), resultat.getString("email"),resultat.getString("telephone"),resultat.getString("motDePasse"));
			}
		} catch (SQLException e) {
			// On gère les exceptions
			e.printStackTrace();
		}

		// Une fois que tout est fait, on renvoit la collection
		disconnectFromDatabase();
		return u;
	}
}
