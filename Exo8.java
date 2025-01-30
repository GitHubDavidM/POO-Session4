public class Exo8{
	public static void main(String[] args){
		int[] tableauEntier = new int[5];
		
		for(int i = 0; i < tableauEntier.length; i++){
			tableauEntier[i] = (int) (Math.random() * 101);
		}
		
		System.out.print("[");
		for(int i = 0; i < tableauEntier.length-1; i++){
			System.out.print(tableauEntier[i] + ",");
		}
		System.out.print(tableauEntier[tableauEntier.length-1]);
		
		System.out.println("]");
	}
}