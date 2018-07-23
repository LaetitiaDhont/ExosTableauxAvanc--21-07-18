package package1;

import java.io.IOException;

/*
 * Ecrire un programme qui saisit un entier au clavier et qui recherche si cet entier appartient au tableau (réponse de type oui/non).
 */
public class Ex1Q1D3TableAvancé {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};
		boolean isHere = false;
		System.out.println("Veuillez choisir un nombre entier : ");
		int input = (int) System.in.read();
		
		for (int i=0; i<tab.length; i++) {
			if (tab[i] == input) {
				isHere = true;
			}
		}
		
		if (isHere) {
			System.out.println("Le nombre que vous avez choisi est présent dans le tableau");
		}
		
		else {
			System.out.println("Le nombre que vous avez choisi n'est pas présent dans le tableau");
		}
		
	}

}
