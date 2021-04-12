package demo.utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
	public static void loadAndStore() {
		Properties mydefprops=new Properties();
		mydefprops.put("ID",90);
		mydefprops.put("Stock", 500);
		try {
			File file = new File("properties.xml");
			FileOutputStream fos = new FileOutputStream("properties.xml");
			mydefprops.storeToXML(fos, "store");
			
//			FileInputStream fis = new FileInputStream("properties.xml");
			System.out.println("Length of the file: "+file.length());
//			mydefprops.ger
			BufferedReader in = new BufferedReader(new FileReader("properties.xml"));
//			FileReader fileReader = new FileReader("properties.xml");
//			mydefprops.load(fileReader);
			String line;
			while((line = in.readLine()) != null)
			{
			    System.out.println(line);
			}
			in.close();
		
			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void invoke() {
		Properties Props = new Properties();
		Props.setProperty("ID","Name");
		Properties props1 = new Properties(Props);
		props1.setProperty("109", "dfaf");
		props1.setProperty("123", "sdfaijn");
		props1.setProperty("1231", "aerad");
		System.out.println("Size: "+props1.size());
		
		
		System.out.println("Enumeration Iterations(properties names)");
		@SuppressWarnings("unchecked")
		Enumeration <Properties> prope= (Enumeration<Properties>) props1.propertyNames();
		while(prope.hasMoreElements()) {
			System.out.println("Employee : "  +prope.nextElement());
		
		
		}
		System.out.println("set Iterations(String Properties name)");
		Set<String> stname= props1.stringPropertyNames();
		Iterator<String> itr=stname.iterator();
		while(itr.hasNext()) {
			System.out.println("Employee: "+itr.next());
		}
		
		
		System.out.println("set Iterations (Entry set)");
		Set<Entry<Object,Object>>set = props1.entrySet();
		Iterator<Entry<Object,Object>> it = set.iterator();
		System.out.println("<EMPLOYEE ID>:<EMPLOYEE NAME>");
		while(it.hasNext()) {
			Entry<Object,Object>e= it.next();
			System.out.println(e.getKey()+ ":" +e.getValue());
			
		}

		System.out.println(props1.getProperty("123"));
	}
	public static void main(String[] args) {
		invoke();
		loadAndStore();
	}
}
