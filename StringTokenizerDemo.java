package demo.utilities;
import java.util.StringTokenizer;  

public class StringTokenizerDemo {
	public static void main(String[] args) {
//		 StringTokenizer st = new StringTokenizer("my name is khan",",",true);//string with delimiter and tokenization true syntax("<string>","<delimiter eg. ",",".","/>,boolean)
		StringTokenizer st = new StringTokenizer("my,name,is,khan");
		 System.out.println(st.countTokens());//count
		while (st.hasMoreTokens()) {// has more tokens
	    	 System.out.println(st.nextToken(","));//next token
//	    	 System.out.println(st.nextElement()); return object
//	         System.out.println(st.nextToken());  //for 
	     }  
	   }  
	}