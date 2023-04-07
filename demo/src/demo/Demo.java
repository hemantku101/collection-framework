package demo;

public class Demo {
	
	public static void printPattern(int n) {
	    // upper half
	    for (int i = n; i >= 1; i--) {
	        // print spaces
	        for (int j = 1; j <= i - 1; j++) {
	            System.out.print("  ");
	        }
	        // print numbers
	        for (int k = i; k <= n; k++) {
	            System.out.print(k * 2 + " ");
	        }
	        System.out.println();
	    }
	    // lower half
	    for (int i = 2; i <= n; i++) {
	        // print spaces
	        for (int j = 1; j <= i - 1; j++) {
	            System.out.print("  ");
	        }
	        // print numbers
	        for (int k = i; k <= n; k++) {
	            System.out.print(k * 2 + " ");
	        }
	        System.out.println();
	    }
	}	
	public static void main(String[] args) {
		printPattern(5);
	}
}