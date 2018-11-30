
public class Reservation {
	private int id;
	private int passagerId;
	private int trajetId;
	private String statut;
	
	public Reservation(int id, int passagerId, int trajetId, String statut) {
		super();
		this.id = id;
		this.passagerId = passagerId;
		this.trajetId = trajetId;
		this.statut = statut;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPassagerId() {
		return passagerId;
	}

	public void setPassagerId(int passagerId) {
		this.passagerId = passagerId;
	}

	public int getTrajetId() {
		return trajetId;
	}

	public void setTrajetId(int trajetId) {
		this.trajetId = trajetId;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}


	
	
}
