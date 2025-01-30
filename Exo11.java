public class Exo11{
	public static void main(String[] args){
		int[] tableauEntier = new int[5];
		
		for(int i = 0; i < tableauEntier.length; i++){
			tableauEntier[i] = (int) (Math.random() * 101);
		}
		
		afficherTableau(tableauEntier);
		
		int mem;
		
		for(int i = 0; i < tableauEntier.length/2; i++){
			mem = tableauEntier[i];
			tableauEntier[i] = tableauEntier[tableauEntier.length -1 - i];
			tableauEntier[tableauEntier.length-1 -i] = mem;
		}
		
		afficherTableau(tableauEntier);
	}
		
	public static void afficherTableau(int[] tableauEntier){
		System.out.print("[");
		for(int i = 0; i < tableauEntier.length-1; i++){
			System.out.print(tableauEntier[i] + ",");
		}
		System.out.print(tableauEntier[tableauEntier.length-1]);
			
		System.out.println("]");
		
	}
}