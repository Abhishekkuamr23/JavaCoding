package javacoding;

public class stringmanipultaion {
		public static void main(String args[]) {
			
			democlass1 jt2 = new democlass1();
			System.out.println(jt2.intdata());
			System.out.println(chardata());
			
			jt2.s1 = "all is well is this the right question is";
			jt2.s2 = "yes this is a right question";
			
			String s3 = jt2.s1.concat(" ").concat(jt2.s2);
			System.out.println(s3);
			
			String s4 = jt2.s1.replace("is", "to");
			System.out.println(s4);
			
			char s5 = jt2.s1.charAt(7);
			System.out.println("s5");
			
			String s6 = jt2.s2.substring(3, 6);
			System.out.println(s6);
		} 
		
		public String testMethod() {
			int vol = 34;
			int bass = 45;
			
			System.out.println(vol + " " + bass);
			return "selenium course";
		}
		
		public static char chardata() { //if we declare method static, for that we don't need to create class object, we can call it directly
			return 'r';
		}
}
