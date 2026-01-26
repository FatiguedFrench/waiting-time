package pizz;

public class Modello {
	// Campi della classe principale
	public int anno_riferimento;
	public Apiario[] lista_apiari;

	// Sotto-classe per l'Apiario
	public static class Apiario {
		public Apicoltore[] apicoltori;
		public int numero_arnie;
		public Posizione posizione;
		public Produzione produzione;
	}

	// Sotto-classe per l'Apicoltore
	public static class Apicoltore {
		public int id;
		public String nominativo;
	}

	// Sotto-classe per la Posizione
	public static class Posizione {
		public String comune;
		public String provincia;
		public String regione;
	}

	// Sotto-classe per la Produzione
	public static class Produzione {
		public String denominazione;
		public String tipologia;
		public double quantita_kg;
	}
}