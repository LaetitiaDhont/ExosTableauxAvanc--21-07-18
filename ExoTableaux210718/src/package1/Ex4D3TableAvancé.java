package package1;

import java.util.Scanner;
import java.util.Arrays;
/*
 * Ecrire un programme qui saisit deux indices et échange les valeurs contenues dans le tableau à ces deux indices. 
 * Le programme affichera le contenu du tableau avant et après cette transformation..
 */
public class Ex4D3TableAvancé {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] tab = {12, 15, 13, 10, 8, 9, 13, 14};
		Scanner sc; 
		sc = new Scanner(System.in);
		System.out.println("Veuillez saisir deux indices :"); 
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c;
		
		System.out.println("Voici le tableau avant les modifications : " + Arrays.toString(tab));
		
		c = a;
		tab[a] = tab[b];
		tab[b] = c;
		
		
		System.out.println("Voici le tableau après les modifications : " + Arrays.toString(tab));
		
	}

}
