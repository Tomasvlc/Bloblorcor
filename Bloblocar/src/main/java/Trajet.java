import java.sql.Time;
import java.util.Date;

public class Trajet {
	private int idTrajet;
	private String depart;
	private String arrive;
	private Time heureDepart;
	private Date jour;
	private int prix;
	
	public Trajet() {
		
	}
	public Trajet(int idTrajet, String depart, String arrive, Date jour,Time heureDepart, int prix) {
		super();
		this.idTrajet = idTrajet;
		this.depart = depart;
		this.arrive = arrive;
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
		return arrive;
	}

	public void setArrive(String arrive) {
		this.arrive = arrive;
	}

	public Date getHeureDepart() {
		return heureDepart;
	}

	public void setHeureDepart(Time heureDepart) {
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}
	public Date getJour() {
		return jour;
	}
	public void setJour(Date jour) {
		this.jour = jour;
	}
	
}
