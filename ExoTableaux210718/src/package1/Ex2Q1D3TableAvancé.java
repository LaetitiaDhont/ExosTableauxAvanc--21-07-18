package package1;

import java.util.Scanner;
import java.util.Arrays;

/*
 * Ecrire un programme qui saisit 6 entiers et les stocke dans un tableau, puis affiche le contenu de ce
tableau une fois qu’il est rempli.
 */
public class Ex2Q1D3TableAvancé {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] tab = new int[6];
		Scanner sc; 
		System.out.println("Veuillez écrire 6 entiers : ");
		sc = new Scanner(System.in);	
		for (int i=0; i<tab.length; i++) {
			int input = sc.nextInt();
			tab[i] = input;
		}
		
		System.out.println("Voici le tableau avant les modifications : " + Arrays.toString(tab));
		
	}

}
