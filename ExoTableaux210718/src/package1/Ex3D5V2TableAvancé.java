package package1;
/*
 * Ecrire un programme qui saisit 10 caract�res au clavier, puis ensuite, calcule le nombre de majuscules,

et le nombre de lettres dans ce tableau. Un caract�re n�est pas forc�ment une lettre : ce peut �tre un chiffre,
un signe de ponctuation, un caract�re sp�cial.

Ecrire le m�me programme en utilisant les deux m�thodes suivantes pour d�terminer si un caract�re est
une lettre et une majuscule.
� Character.isLetter qui prend en param�tre un caract�re et renvoie un boolean.
� Character.isUppercase qui prend en param�tre un caract�re et renvoie un boolean.

 */
import java.io.IOException;

public class Ex3D5V2TableAvanc� {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char[] tab;
		int numberLetter = 0;
		int numberUppercase =0;
		
		tab = new char [10];
		for (int i = 0; i<tab.length; i++) {
			System.out.println("Entrez le caract�re : " + (i+1));
			tab[i]= (char) System.in.read();
		}
		
		for (int i = 0; i<tab.length; i++) {
			if (Character.isUpperCase(tab[i])) {
				numberLetter++;
				numberUppercase++;
			}
			else if (Character.isLetter(tab[i])) {
				numberLetter++;
			}
		}
		
		System.out.println("Le nombre de majuscules: " + numberUppercase);
		System.out.println("Le nombre de lettres :" + numberLetter);
		
	}

}
