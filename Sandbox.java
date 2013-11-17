import java.util.Arrays;




public class Sanbox {
	public static void main(String[] args){
		int[] a = randomArray(100000);
		long before = System.currentTimeMillis();
		bubbleSort(a);
		long after = System.currentTimeMillis();
		long difference = after - before;
		System.out.println("Took " + difference + " millis.");
		
		before = System.currentTimeMillis();
		raziSort(a);
		after = System.currentTimeMillis();
		difference = after - before;
		System.out.println("Took " + difference + " millis");
		
	}
	public static int[] randomArray(int n){
		int [] array = new int[n];
		for (int i= 0; i<array.length; i++){
			array[i] = (int) (Math.random()*Integer.MAX_VALUE); 
		}
		return array;
	}
	
	public static int[] raziSort(int[] array) {
		for (int round = 0; round <array.length; round++)
			int saved = Integer.MAX_VALUE;
			int where = 0;
			for (int round = 0; round <array.length; i++){
				if (array[i] < saved){
					saved = array[i];
					where = i;
			}
		}
		swap(array, where, round);
		return array;
	}
     public static int[] bubbleSort(int[] array) {
	    for(int j=0; j<array.length; j++){	
    	 	for(int i =0; i < array.length-1-j; i++){
	    		 if(array[i] >  array[i+1]){
	    			 swap(array, i, i+1);
	    		 }
	    	 }
     }
	    return array;
     }
     public static int[] swap(int[] array, int a, int b){
    	int save = array[a];
    	array[a] = array[b];
    	array[b] = save;
    	 return array;
     }
}
