package package1;
/*
 * Ecrire un programme qui saisit 10 caractères au clavier, puis ensuite, calcule le nombre de majuscules,
et le nombre de lettres dans ce tableau. Un caractère n’est pas forcément une lettre : ce peut être un chiffre,
un signe de ponctuation, un caractère spécial.
 */
import java.io.IOException;
/*
 * Ecrire un programme qui saisit 10 caractères au clavier, puis ensuite, calcule le nombre de majuscules,
et le nombre de lettres dans ce tableau. Un caractère n’est pas forcément une lettre : ce peut être un chiffre,
un signe de ponctuation, un caractère spécial.

Pour cette question, on ne considère que les lettres sans accent. Pour déterminer si un caractère est
une lettre, on utilise l’ordre sur les caractères. Est une lettre tout caractère compris entre ’a’ et ’z’ et entre
’A’ et ’Z’. Est un majuscule tout caractère compris entre ’A’ et ’Z’.
 */
public class Ex3D5TableAvancé {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char[] tab;
		int numberLetter = 0;
		int numberUppercase =0;
		
		tab = new char [10];
		for (int i = 0; i<tab.length; i++) {
			System.out.println("Entrez le caractère : " + (i+1));
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
