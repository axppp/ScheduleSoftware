package gestaogui;

import java.io.*;
import java.net.*;

import javax.swing.*;



/**
 * Main class of the program.
 * 
 */
public class Main {
    
    
	private static JanelaPrincipal maingui;
                
                		


	/**
	 * The main method to start the program. This method will show a splash
	 * image while loads the previous state of the program.
	 * 
	 * @param args
	 *            command line parameters
	 */
	public static void main(String[] args) {
		Imagens img = new Imagens();
		@SuppressWarnings("unused")
		SplashScreen splash = new SplashScreen(5000, img.splash, true);
		//lerEstadoAnterior();
		//adicionarLinguas();
		try {
			maingui = new JanelaPrincipal();
		} catch (URISyntaxException e) {

		}

	}

	/**
	 * Method who will add the default export languages of the program.
	 */
	/*private static void adicionarLinguas() {
		boolean checkGB = true;
		boolean checkFR = true;
		boolean checkPT = true;
		for (int i = 0; i < getLingua().size(); i++) {
			if (getLingua().get(i).getLinguagem().equalsIgnoreCase("PT-PT")) {
				checkPT = false;
			} else if (getLingua().get(i).getLinguagem().equalsIgnoreCase("EN-GB")) {
				checkGB = false;
			} else if (getLingua().get(i).getLinguagem().equalsIgnoreCase("FR-FR")) {
				checkFR = false;
			}
		}
		if (checkGB) {
			getLingua().add(new Linguas("EN-GB", "Olympic Games", "Listing", "Classification", "Position", "Name", "Gold", "Silver", "Bronze", "Athlete", "Sport", "Competition", "Country", "Emission Date"));
		}
		if (checkFR) {
			getLingua().add(new Linguas("FR-FR", "Jeux Olympiques", "Liste", "Classification", "Position", "Nom", "Or", "Argent", "Bronze", "Athl&egrave;te", "Modalit&eacute;", "Discipline", "Pays", "Date d'&eacute;mission"));
		}
		if (checkPT) {
			getLingua().add(new Linguas("PT-PT", "Jogos Ol&iacute;mpicos", "Listagem", "Classifica&ccedil;&atilde;o", "Posi&ccedil;&atilde;o", "Nome", "Ouro", "Prata", "Bronze", "Atletas", "Modalidade", "Disciplina", "Pa&iacute;s", "Data de Emiss&atilde;o"));
		}
	}


	/**
	 * Method to save the current state of the program.
	 */
	public static void gravarEstado() {
		//try {
			/*ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("estado.bin"));
			out.writeObject(atleta);
			out.writeObject(modalidades);
			out.writeObject(provas);
			out.writeObject(paises);
			out.writeObject(equipas);
			out.writeObject(disciplinas);
			out.writeObject(jogos);
			out.writeObject(lingua);
			out.close();
		} catch (IOException exc) {
			JOptionPane.showMessageDialog(maingui, "Status not saved!", "Closing Application", JOptionPane.ERROR_MESSAGE);
		*/}

	/**
	 * Method to read the previous state of the program.
	 */
	//@SuppressWarnings({ "unchecked" })
	private static void lerEstadoAnterior() {
		/*try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("estado.bin"));
			atleta = (ListaLigada<Atleta>) in.readObject();
			modalidades = (ListaLigada<Modalidade>) in.readObject();
			provas = (ListaLigada<Prova>) in.readObject();
			paises = (ListaLigada<Pais>) in.readObject();
			equipas = (ListaLigada<Equipa>) in.readObject();
			disciplinas = (ListaLigada<Disciplina>) in.readObject();
			jogos = (ListaLigada<JogosOlimpicos>) in.readObject();
			lingua = (ListaLigada<Linguas>) in.readObject();
			in.close();
		} catch (IOException exc) {
			JOptionPane.showMessageDialog(maingui, "Previous status wasn't successfully loaded!", "Loading previous status", JOptionPane.ERROR_MESSAGE);

		} catch (ClassNotFoundException exc) {
			JOptionPane.showMessageDialog(maingui, "Previous status wasn't successfully loaded!", "Loading previous status", JOptionPane.ERROR_MESSAGE);
		}*/
	


	}
}