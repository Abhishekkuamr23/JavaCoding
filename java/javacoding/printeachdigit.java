//print each digit of number from start/beginning
package javacoding;

public class printeachdigit {
   public static void main(String[] args) {
	   int num = 12345, div, q, count =0; 
	    int temp = num;
	    while(temp != 0)
	    {
	        temp = temp / 10;
	        count++;
	    }
	    System.out.print(count);
	    
	    div = (int)Math.pow(10, count-1);
	    System.out.println(div);
	    while(num != 0)
	    {
	        q = num/div;
	        System.out.println(q);
	        num = num%div;
	        div = div/10;
	    }
	    
	    //Print digits one by one
//	    int n = 123456789, count = 0;
//		String ss = Integer.toString(n);
//		int ln =ss.length();
//		for(int i = 0; i< ln; i++)
//		{
//		  System.out.println(ss.charAt(i));
//		}
	    
	    //print reverse number one by one
//	    int num = 1234, remainder, lastdigit;
//	    
//	    while(num != 0)
//	    {
//	        lastdigit = num%10;
//	        System.out.println(lastdigit);
//	        num /=10;
//	    }
   }
}
