package package1;

import java.util.Scanner;

/*
 * Ecrire un programme qui saisit un entier au clavier et qui recherche si cet entier appartient au tableau. Au cas où la réponse est positive, 
 * l’indice de cet entier dans le tableau est affiché.
 * Même question mais si il y a des occurences, le premier indice est affiché.
 */
public class Ex1Q3D3TableAvancé {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int index = -1;
		int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};
		Scanner sc; 
		System.out.println("Veuillez saisir le nombre à rechercher : ");
		sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		for (i=0; i<tab.length; i++) {
			if ((tab[i] == input) && (index == -1)) {
				index = i;
			}
		}
		
		if (input != -1) {
			System.out.println("Le nombre que vous avez saisi est à l'index : " + index);
		}
		
		else {
			System.out.println("Le nombre que vous avez saisi n'est pas dans le tableau !");
		}
	}

}
