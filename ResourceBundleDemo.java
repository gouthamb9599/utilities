package demo.utilities;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleDemo {
	public static void main(String[] args) {
		ResourceBundle rbundle= ResourceBundle.getBundle("test",Locale.ENGLISH);
		String uid=rbundle.getString("userid");
		String pwd=rbundle.getString("password");
		String name=rbundle.getString("name");
		if(uid.equals("admin") && pwd.equals("admin")) {
			System.out.println("Welcome "+name);
		}
		else {
			System.out.println("Invalid credentials....");
			
		}
		
	}

}
