import java.util.Arrays;

class Stats {
	public static void main(String[] args) {
		int [] a = {100, 26 ,433, 24, 19};
		System.out.println(max(a));
		System.out.println(min(a));
		System.out.println(mean(a));
		Array.sort(a);
		
	}

	public static int max(int [] a){
		int max = a[0];
		for (int i = 0; i < a.length;  i++) {
			if (a[i] > max){
				max = a[i];
			}
			
		}
		return max;

	}

	public static void printArray(int [] a){
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
			
		}

		System.out.println();
	}

	// public static void print(int [] c){
	// 	for (int r = 0; r < a.length; r++) {
	// 		for (int c =0; c < a[r].length; c++) {
	// 			System.out.print(a[r][c] + " ");
	// 			//System.out.println("stuff");
	// 		}
	// 		System.out.println();
	// 	}
	// }
	
	public static int min( int [] a){

		int max = a[0];
		for (int i = 0; i < a.length;  i++) {
			if (a[i] < max){
				max = a[i];
			}
			
		}
		return max;

	}

	public static double mean(int [] a){
		double mean = 0.0;
		for (int i = 0; i<a.length; i++) {
			mean = mean + a[i];
			
		}
		return (mean/ a.length);
	}

	public static double median(int [] a){
		double median = 0.0;
		if( a.length%2 == 1){
			median = a[(a.length/2)]
		} else{
			median =
		}
			
		}


	}
}