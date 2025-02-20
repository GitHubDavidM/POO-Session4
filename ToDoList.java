import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList{
	public static void main(String[] args){
		ArrayList<String> taches = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		ArrayList<Boolean> isDone = new ArrayList<>();
		String choix;
		while(true){
			System.out.println("1.Ajouter une tache");
			System.out.println("2.Marquer une tache comme terminée");
			System.out.println("3.Afficher les taches");
			System.out.println("4.Terminer le programme");
			System.out.println("-".repeat(40));
			System.out.println("Nombre de tache : " + taches.size());
			System.out.println("-".repeat(60) + "\n");
			
			System.out.print("Entrez votre choix : ");
			choix = scanner.nextLine();
			
			if(choix.equals("1")){
			System.out.println("Entrez la tache a ajouter : ");
			choix = scanner.nextLine();
			
			taches.add(choix);
			isDone.add(false);
			System.out.print("Tache ajoutee : " + choix);
			}
			else if(choix.equals("2")){
				System.out.print("Entrez le numero de la tache a marquer comme terminee : ");
				choix = scanner.nextLine();
				isDone.set(Integer.parseInt(choix)- 1 , true);
				Systeme.out.println("Tache terminee : " + taches.get(Integer.parseInt(choix) - 1));
			}
			else if(choix.equals("3")){
				afficheTableau(taches, isDone);
			}
			else if(choix.equals("4")){
				System.out.println("Merci d'avoir utilise le gestionnaire de taches! ");
			}
			scanner.nextLine();
		}
	}
	public static void afficheTableau(ArrayList<String> taches, ArrayList<Boolean> isDone){
		System.out.println("\n\nTaches : \n");
		for(int i = 0 ; i < taches.size(); i++){
			System.out.printf("%d.%s %s\n",i ,taches.get(i) , isDone.get(i) ? " (Complété)" : " (Non complété)");
		}
	}
	public static String repeat(String mot, int nombreRepetition){
		String somme = ".";
		for(int i = 0; i < nombreRepetition; i++){
			somme = somme.concat(mot);
			system.out.println(mot);
		}
		return somme;
	}
}