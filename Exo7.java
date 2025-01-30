public class Exo7{
	public static void main(String args[]){
		int[] tableauEntier = new int[5];
		
		for(int i = 0; i < tableauEntier.length; i++){
			tableauEntier[i] = (int) (Math.random() * 101);
		}
		for(int i : tableauEntier){
			System.out.println(i);
		}
	}
}