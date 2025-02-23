package javacoding;

public class ReverseEachWordOfSentence {

	public static void main(String[] args) {
			   String str = "Hi my name is this";
			   String[] words = str.split(" ");
			   StringBuilder rs = new StringBuilder();
			   
			   for(String word : words){
			       StringBuilder rw = new StringBuilder(word);
			       rs.append(rw.reverse().toString()).append(" ");
			   }
			   
			   System.out.println(rs.toString().trim());
	}

}
