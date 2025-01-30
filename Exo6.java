public class Exo6{
	public static void main(String args[]){
		
		boolean reponse;
		reponse =  44 == 66;
		System.out.println(reponse);
		
		reponse = 44 != 66;
		System.out.println(reponse);
		
		reponse = 44 > 66;
		System.out.println(reponse);
		
		reponse = 44 <= 66;
		System.out.println(reponse);
		
		boolean estSante = true;
		boolean estAbordable = false;
		
		System.out.println(estSante & estAbordable);
		System.out.println(!estSante & estAbordable);
		System.out.println(estSante | estAbordable);
	}
}