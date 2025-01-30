public class Exo1 {
	public static void main (String[] args) {
		if (args.length < 2) {
			System.out.println ("Veuillez ecrire un prenom et un nom");
			return;
		}
			
		String FirstName = args[0];
		String LastName = args[1];
			
		System.out.println("Bonjour " + FirstName + " " + LastName );
		
	}
}