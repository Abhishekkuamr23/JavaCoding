package javacoding;

public class totaldigitsinnumber {
   public static void main(String args[]) {
   int n = 123456789, count = 0;
    
    while(n != 0)
    {
        count++;
        n /= 10;
    }
    System.out.println("Total digits in number :" + count);  
  }
}


