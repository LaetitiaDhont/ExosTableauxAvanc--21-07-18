package package1;

import java.util.Scanner;

/*
 * Ecrire un programme qui saisit un entier au clavier et qui recherche si cet entier appartient au
tableau. Au cas o� la r�ponse est positive, l�indice de cet entier dans le tableau est affich�. S�il y a
plusieurs occurrences, le dernier indice est affich�.
 */
public class Ex4TableAvanc� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};
		Scanner sc;
		int index = -1;
		int i;
		System.out.println("Veuillez �crire un nombre � chercher:");
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (i = 0; i<tab.length;i++) {
			if (tab[i] == n) {
				index = i;
			}
		}
		
		if (index != -1) {
			System.out.println("Le nombre que vous avez saisi est � l'index : " + index);
		}
		
		else {
			System.out.println("Le nombre que vous avez saisi n'est pas dans le tableau ! ");
		}
		
	}

}
