import java.sql.Time;
import java.util.Date;

public class Trajet {
	private int idTrajet;
	private String depart;
	private String arrivee;
	private java.util.Date heureDepart;
	private java.sql.Date jour;
	private int prix;
	
	public Trajet() {
		
	}
	public Trajet(int idTrajet, String depart, String arrivee, java.sql.Date jour,Date heureDepart, int prix) {
		super();
		this.idTrajet = idTrajet;
		this.depart = depart;
		this.arrivee = arrivee;
		this.heureDepart = heureDepart;
		this.prix = prix;
		this.setJour(jour);
	}
	
	public int getIdTrajet() {
		return idTrajet;
	}

	public void setIdTrajet(int idTrajet) {
		this.idTrajet = idTrajet;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	public String getArrive() {
		return arrivee;
	}

	public void setArrive(String arrivee) {
		this.arrivee = arrivee;
	}

	public Date getHeureDepart() {
		return heureDepart;
	}

	public void setHeureDepart(Date heureDepart) {
		this.heureDepart = heureDepart;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}
	public java.sql.Date getJour() {
		return jour;
	}
	public void setJour(java.sql.Date jour) {
		this.jour = jour;
	}
	
}
