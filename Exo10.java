public class Exo10{
	public static void main (String[] args){
		int[] tableauEntier = new int[5];
		
		for(int i = 0; i < tableauEntier.length; i++){
			tableauEntier[i] = (int) (Math.random() * 101);
		}
		
		int max = tableauEntier[0];
		int min = tableauEntier[0];
		
		System.out.print("[");
		for(int i = 0; i < tableauEntier.length - 1; i++){
			System.out.print(tableauEntier[i] + ",");
			if(min > tableauEntier[i]){
				min = tableauEntier[i];
			}
			if(max < tableauEntier[i]){
				max = tableauEntier[i];
			}
		}
		System.out.print(tableauEntier[tableauEntier.length-1]);
		System.out.println("]");
		
		System.out.println("Le maximum est : " + max);
		System.out.println("Le minimum est : " + min);
	}
}