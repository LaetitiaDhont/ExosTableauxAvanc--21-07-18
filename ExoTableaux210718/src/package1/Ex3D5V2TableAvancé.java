package package1;
/*
 * Ecrire un programme qui saisit 10 caractères au clavier, puis ensuite, calcule le nombre de majuscules,

et le nombre de lettres dans ce tableau. Un caractère n’est pas forcément une lettre : ce peut être un chiffre,
un signe de ponctuation, un caractère spécial.

Ecrire le même programme en utilisant les deux méthodes suivantes pour déterminer si un caractère est
une lettre et une majuscule.
– Character.isLetter qui prend en paramètre un caractère et renvoie un boolean.
– Character.isUppercase qui prend en paramètre un caractère et renvoie un boolean.

 */
import java.io.IOException;

public class Ex3D5V2TableAvancé {

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
