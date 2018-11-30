
public class Utilisateur {
		private int id;
		private String nom;
		private String email;
		private String motDePasse;
		private String telephone;
		private String description;
		
		public Utilisateur()
		{
			super();
		}
		
		public Utilisateur(int id, String nom, String email, String motDePasse, String telephone, String description) {
			super();
			this.id = id;
			this.nom = nom;
			this.email = email;
			this.motDePasse = motDePasse;
			this.telephone = telephone;
			this.description = description;
			
		}

		/**
		 * @return the id
		 */
		public int getId() {
			return id;
		}

		/**
		 * @param id the id to set
		 */
		public void setId(int id) {
			this.id = id;
		}

		/**
		 * @return the nom
		 */
		public String getNom() {
			return nom;
		}

		/**
		 * @param nom the nom to set
		 */
		public void setNom(String nom) {
			this.nom = nom;
		}

		/**
		 * @return the email
		 */
		public String getEmail() {
			return email;
		}

		/**
		 * @param email the email to set
		 */
		public void setEmail(String email) {
			this.email = email;
		}

		/**
		 * @return the motDePasse
		 */
		public String getMotDePasse() {
			return motDePasse;
		}

		/**
		 * @param motDePasse the motDePasse to set
		 */
		public void setMotDePasse(String motDePasse) {
			this.motDePasse = motDePasse;
		}

		public String getTelephone() {
			return telephone;
		}

		public void setTelephone(String telephone) {
			this.telephone = telephone;
		}
		
		public void setDesciption(String description) {
			this.description = description;
		}
		
	}

