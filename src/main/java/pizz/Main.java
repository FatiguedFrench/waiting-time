package pizz;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Countdown ct = new Countdown();
		ct.start();

		try {
			ct.join();
		}
		catch (InterruptedException e) {
			System.out.print("Errore nel join!");
		}

		GestioneFile filer = new GestioneFile();
		Scanner in = new Scanner(System.in);

		Modello m = filer.leggiJSON();

		System.out.println("Aggiunta nuovo produttore");
		System.out.print("Quanti nuovi apiari? ");
		Modello.Apiario nuovoApiario = new Modello.Apiario();

		nuovoApiario.numero_arnie = in.nextInt();
		in.nextLine(); // pulizia buffer

		nuovoApiario.posizione = new Modello.Posizione();
		System.out.print("Comune: ");
		nuovoApiario.posizione.comune = in.nextLine();
		
		nuovoApiario.produzione = new Modello.Produzione();
		System.out.print("Tipo miele: ");
		nuovoApiario.produzione.denominazione = in.nextLine();

		List<Modello.Apiario> temp = new ArrayList<>();
		if (m.lista_apiari != null) temp.addAll(Arrays.asList(m.lista_apiari));
		temp.add(nuovoApiario);
		m.lista_apiari = temp.toArray(new Modello.Apiario[0]);

		filer.scriviJSON(m);
		filer.leggiBR();
	}
}