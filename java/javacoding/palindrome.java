package javacoding;

public class palindrome {
	
	public static void main(String args[]) {
		// reverse string should be same as the given string 
		//e.g. qweewq = qweewq
//	String ss = "qweewq", reverseString = "";
//	int ln = ss.length();
//	
//	for(int i = ln-1; i>=0; i--)
//	{
//		reverseString = reverseString + ss.charAt(i);
//	}
//    
//	if(reverseString.equalsIgnoreCase(ss)){
//		System.out.println("String is palindrome :" + reverseString);
//	}
//	else
//	{
//		System.out.println("String is not palindrome :" + reverseString);
//	}
		
		//find number is palindrome or not
		// 1221 == 1221
		
		int num = 122311221, remainder, reversedNumber = 0, orignalNumber;
		orignalNumber =num;
		while(num !=0)
		{
			remainder = num % 10;
			reversedNumber = reversedNumber*10 + remainder;  
			num = num/10;
		}
		
		if(reversedNumber == orignalNumber){
			System.out.println("Number is palindrome :" + reversedNumber);
		}
		else
		{
			System.out.println("Number is not palindrome :" + reversedNumber);
		}
		
		
  }
}
