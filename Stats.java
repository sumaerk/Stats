import java.util.Arrays;

class Stats {
	public static void main(String[] args) {
		int [] a = {100, 26 ,433, 24, 19};
		Arrays.sort(a);
		System.out.println(max(a));
		System.out.println(min(a));
		System.out.println(mean(a));
		System.out.println(median(a));
		System.out.println(mode(a));
		System.out.println(standardDeviation(a));
		System.out.println(quartile3(a));
		System.out.println(quartile1(a));
		

		
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
		if( a.length%2 == 0){
			median = ((double)(a[a.length/2]) + ((double)a[a.length/4 - 1]) / 2.0);
		} else{
			median = a[a.length];
		}
		return median;	

	}

	public static int mode(int [] a){
		int mode = a[0];
		int countMode = 1;
		int [] count = new int [a.length];
		for (int i = 0; i<a.length; i++) {
			count [i] = 0;
			
		}
		for (int i = 0; i<a.length; i++) {
			for (int j =0; j< a.length; j++) {
				if(a[i]==a[j]){
					count [i] +=1;
				}
				
			}
			
		}

		for (int i =0; i <a.length; i++) {
			if (count [i]> countMode) {
				mode = a[i];
				countMode = count[i];

				
			}
			
		}
		return mode;

	}

	public static double upperQuartile(int[] a) {
			double median = 0.0;
			int oddlength = a.length - 1;
			if (a.length % 2 == 0) {
				if ((a.length/2) % 2 == 0) {
					median = ((double)a[a.length/4 + (a.length/2)] + (double)a[((a.length/4 - 1) + (a.length/2))] / 2.0);
				} else {
					median = a[(oddlength/4) + (int)(oddlength/2) + 1];
				}
			} else {
				if ((oddlength/2) % 2 == 0) {
					median = ((double)a[oddlength/4 + (oddlength/2)] + (double)a[(oddlength/4 + 1) + oddlength/2]) / 2.0;
				} else {
					median = a[(oddlength /2) + (int)(oddlength/2 +1)] / 2;
				}
			}
			return median;
	}

	public static double quartile3(int[] a) {
			int u = 0;
			int[] m = new int[a.length];
			double sum = 0;
			double standardDeviation = 0;
			for (int i = 0; i < a.length; i++) {
				u += a[i];
			}
			u /= a.length;
			for (int i = 0; i < a.length; i++) {
				m[i] = a[i] - u;
				m[i] *= m[i];
			}
			for (int i = 0; i < a.length; i++) {
				sum += m[i];
			}
			standardDeviation = sum / ((double)(a.length)-1);
			return Math.sqrt(standardDeviation);

	}
	public static double quartile1(int[] a) {
			double median = 0.0;
			int oddLength = a.length + 1;
			if (a.length % 2 == 0) {
				if ((a.length/2) % 2 == 0) {
					median = ((double)a[a.length/4] + (double)a[(a.length/4 - 1)]) / 2.0;
				} else {
					median = a[(oddLength/4)];
				}
			} else {
				if ((oddLength/2) % 2 == 0) {
					median = ((double)a[oddLength/4] + (double)a[(oddLength/4 + 1)]) / 2.0;
				} else {
					median = a[((oddLength - 2)/4 - 1)] + a[(oddLength - 2)/4];
				}
			}
			return median;
	}


}
