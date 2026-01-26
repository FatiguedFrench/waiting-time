package pizz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import com.google.gson.Gson;

/** Classe responsabile della gestione dei file */
public class GestioneFile {
	/** Costruttore della classe GestioneFile */
	public void GestoneFile() {}

	/** Legge il file JSON */
	public Modello leggiJSON() {
		String riga, fileJSON = "";

		try (BufferedReader file = new BufferedReader(new FileReader("miele.json"))) {
			while ((riga = file.readLine()) != null) {
				fileJSON = fileJSON.concat("\n" + riga);
			}
		} catch (IOException e) {
			System.out.println("File non trovato! " + e.getMessage());
		}

		Gson jsonGaming = new Gson();
		Modello oggettoJSON = jsonGaming.fromJson(fileJSON, Modello.class);

		return oggettoJSON;
	}
}