package package1;

import java.util.Scanner;

/*
 * Reprendre la partie saisie du programme précédent pour écrire un nouveau programme qui re-
cherche et affiche le plus grand élément du tableau.
 */
public class Ex2Q2D3TableAvancé {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] tab = new int[6];
		Scanner sc; 
		sc = new Scanner(System.in);
		int greaterNumber = tab[0];
		System.out.println("Veuillez écrire 6 entiers");
		for (int i = 0; i<tab.length; i++) {
			int input = sc.nextInt();
			if (greaterNumber > tab[i]) {
				greaterNumber = tab[i];
			}
		}
		
		System.out.println("Le nombre le plus grand c'est : " + greaterNumber) ;
	}

}
