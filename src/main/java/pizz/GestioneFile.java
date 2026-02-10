package pizz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/** Classe responsabile della gestione dei file */
public class GestioneFile implements Runnable {
	/** Costruttore della classe GestioneFile */
	public void GestoneFile() {}

	/** Legge utilizzando buffered reader */
	public synchronized void leggiBR() {
		try (BufferedReader br = new BufferedReader(new FileReader("miele.json"))) {
			String linea;
			System.out.println("--- Contenuto Grezzo del File ---");
			while ((linea = br.readLine()) != null) {
				System.out.println(linea);
			}
		} catch (IOException e) {
			System.err.println("Errore lettura testuale: " + e.getMessage());
		}
	}

	/** Legge utilizzando GSON e trasformando in oggetto */
	public synchronized Modello leggiJSON() {
		Gson jsonGaming = new Gson();
		Modello json = new Modello();

		try (BufferedReader file = new BufferedReader(new FileReader("miele.json"))) {
			json = jsonGaming.fromJson(file, Modello.class);
		} catch (IOException e) {
			System.out.println("File non trovato! " + e.getMessage());
		}

		return json;
	}

	/** Scrive nel file JSON */
	public synchronized void scriviJSON(Modello modello) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String jsonString = gson.toJson(modello);

		try (BufferedWriter writer = new BufferedWriter(new FileWriter("miele.json"))) {
			writer.write(jsonString);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void run() {
		leggiJSON();
	}
}