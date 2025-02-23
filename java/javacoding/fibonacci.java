// print fibonacci number till given range e.g.:0, 1, 1, 2, 3, 5, 8, 13...

package javacoding;

public class fibonacci {
	
	static void fibonaccinumber(int n) {
		int firstTerm = 0, secondTerm = 1;

	    for (int i = 1; i <= n; ++i) {
	      System.out.print(firstTerm + ", ");
	      int nextTerm = firstTerm + secondTerm;
	      firstTerm = secondTerm;
	      secondTerm = nextTerm;
	    }
		
	}
	
	public static void main(String[] args) {
		
		fibonaccinumber(10);
	}

}
