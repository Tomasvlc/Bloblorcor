import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class TrajetManager {
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
	public static Trajet selectTrajet(String arrivee, String depart, Date jour)
	{	
		connectToDatabase();
		String query = "SELECT * FROM trajets WHERE arrivee = '" + arrivee + "'AND depart = '"+depart+"' AND jour = '"+jour+"'";
		Trajet t = new Trajet();
		Statement statement = null; // Objet JDBC qui va être en charge d'éxecuter la requête - même principe avec SQLite
		ResultSet resultat = null; // Object JDBC qui va être en charge de gérer le résultat de la requête

		try {
			statement = c.createStatement(); 
			resultat = statement.executeQuery(query); // On crée la requête et on l'execute 
			// resultat contient le résultat de la requête, on boucle dessus pour récupérer toutes les réponses
			while (resultat.next()) {
				t = new Trajet(resultat.getInt("id"),resultat.getString("depart"),resultat.getString("arrivee"),resultat.getDate("jour"), resultat.getString("hdepart"),resultat.getInt("prix"));
			}
		} catch (SQLException e) {
			// On gère les exceptions
			e.printStackTrace();
		}

		// Une fois que tout est fait, on renvoit la collection
		disconnectFromDatabase();
		return t;
	}
	public static Trajet insertTrajet(Trajet aInserer)
	{
		connectToDatabase();
		
		String query = "INSERT INTO trajets(depart,arrivee,hdepart) VALUES (?,?,?)";
		
		try {
			PreparedStatement p = c.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
			p.setString(1, aInserer.getDepart());
			p.setString(2,  aInserer.getArrive());
			p.setString(3, aInserer.getHeureDepart());
			
			//p.setDate(4, aInserer.getJour());
			//p.setInt(5, aInserer.getPrix());
			
			int nbLignes = p.executeUpdate();
			
			if (nbLignes > 0)
			{
				ResultSet generatedKeys = p.getGeneratedKeys();
				
				if (generatedKeys.next()) {
					String id = generatedKeys.getString(1);
					aInserer.setIdTrajet(Integer.parseInt(id));
				}
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		disconnectFromDatabase();
		return aInserer;
	}
	
}
