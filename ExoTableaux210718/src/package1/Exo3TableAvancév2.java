package package1;

import java.io.IOException;
import java.util.Scanner;

public class Exo3TableAvancév2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		    Scanner input;
			// TODO Auto-generated method stub
			int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};
			boolean isHere = false;
			System.out.println("Veuillez choisir un nombre entier : ");
			input = new Scanner(System.in);
			int number = input.nextInt();

			for (int i=0; i<tab.length; i++) {
				if (number == tab[i]) {
					System.out.println("Le nombre que vous avez choisi est présent dans le tableau");
					isHere = true;
					break;}
			}



			if(isHere == false) {
				System.out.println("Le nombre que vous avez choisi n'est pas présent dans le tableau");
			}
	
}
}