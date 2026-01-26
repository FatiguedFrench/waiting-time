package pizz;

public class Main {
	public static void main(String[] args) {
		GestioneFile fileMan = new GestioneFile();
		Modello shangai = fileMan.leggiJSON();
		System.out.println(shangai.toString());
	}
}