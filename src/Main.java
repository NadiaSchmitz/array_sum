
public class Main {

	public static void main(String[] args) {
		
		int i, sum = 0;
		int[] my_array = {1,0,256,3,40,-9,2,22,222,4,91,-91,10,122,6};
		
		for(i = 0; i < my_array.length; i++) {
			sum = sum + my_array[i];
		}
		
		System.out.println("Summe beträgt: " + sum);
		
	}

}
