package package1;
/*
 * Ecrire un programme qui saisit 10 caract�res au clavier, puis ensuite, calcule le nombre de majuscules,
et le nombre de lettres dans ce tableau. Un caract�re n�est pas forc�ment une lettre : ce peut �tre un chiffre,
un signe de ponctuation, un caract�re sp�cial.
 */
import java.io.IOException;
/*
 * Ecrire un programme qui saisit 10 caract�res au clavier, puis ensuite, calcule le nombre de majuscules,
et le nombre de lettres dans ce tableau. Un caract�re n�est pas forc�ment une lettre : ce peut �tre un chiffre,
un signe de ponctuation, un caract�re sp�cial.

Pour cette question, on ne consid�re que les lettres sans accent. Pour d�terminer si un caract�re est
une lettre, on utilise l�ordre sur les caract�res. Est une lettre tout caract�re compris entre �a� et �z� et entre
�A� et �Z�. Est un majuscule tout caract�re compris entre �A� et �Z�.
 */
public class Ex3D5TableAvanc� {

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
			if ((tab[i] >= 'A') && (tab[i] <= 'Z')) {
				numberLetter++;
				numberUppercase++;
			}
			else if ((tab[i] >= 'a') && (tab[i] <= 'z')) {
				numberLetter++;
			}
		}
		
		System.out.println("Le nombre de majuscules: " + numberUppercase);
		System.out.println("Le nombre de lettres :" + numberLetter);
		
		
		
		
	}

}
