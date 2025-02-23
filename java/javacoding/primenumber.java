// print prime till N e.g.: 1, 2, 3, 5, 7, 11, 13
package javacoding;
import java.util.Scanner;
public class primenumber {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scn.nextInt();
            int count = 0;
            for (int div = 1; div <= n; div++) {
                if (n % div == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }
    }
}

//public class primenumber   {
//static void prime_N(int N)
//{
//  int x, y, flg;
//  System.out.println("All the Prime numbers within 1 and " + N + " are:");
//  for (x = 1; x <= N; x++) {
//      
//      flg = 1;
//      for (y = 2; y <= x / 2; ++y) {
//          if (x % y == 0) {
//              flg = 0;
//              break;
//          }
//      }
//      // If flag is 1 then x is prime but
//      // if flag is 0 then x is not prime
//      if (flg == 1)
//          System.out.print(x + " ");
//  }
//}
//public static void main(String[] args)
//{
//  int N = 45;
//  prime_N(N);
//}
//}