import java.util.Scanner;
import java.util.ArrayList;

public class resultatExamen{
	public static void main(String[] args){
		ArrayList<String> list = new ArrayList<>;
		Scanner scanner = new Scanner(System.in);
		String choix;
		String nomComplet;
		int note;
		
		while(true){
			System.out.println("-".repeat(60));
			System.out.println("Menu :");
			System.out.println("1. Ajouter le résultat d'un étudiant");
			System.out.println("2. Afficher la liste des résultats");
			System.out.println("3. Terminer le programme");
			System.out.println("-".repeat(40));
			System.out.println("Moyenne du groupe :");
			System.out.println("-".repeat(60));
			
			System.out.println("Entrez votre choix : ");
			
			choix = scanner.nextLine();
			
			if(choix.equals("1")){
				System.out.println("Entrez le nom complet de l'étudiant : ");
				nomComplet = scanner.nextLine();
				System.out.println("Entrez la note de cet étudiant : ");
				note = scanner.nextLine();
				System.out.println("Résultat pour " + nomComplet + " : " + note + " ajouté");
				choix = scanner.nextLine();
				
				list.add(nomComplet);
				list.add(note);
				
			}
			else if(choix.equals("2")){
				afficherListe;
				
				
			}
			else if(choix.equals("3")){
				System.out.println("Aurevoir!");
			}
		}
		public class afficherListe{
			System.out.println("Liste :");
			Systeme.out.println(nomComplet + " " + note);
			Systeme.out.println("-".repeat(40));
			Systeme.out.println("Moyenne ");
		}
	}
}