package demo.utilities;
import java.util.Date; // Import the Date class from java.util package
import java.util.Locale;
import java.util.Calendar; // Import the Calendar class from java.util package
import java.util.Currency;

import static java.util.Calendar.*; // Static import of constants

import java.text.NumberFormat;

public class UtilitesBasicDemo {
	public void localedemo() {
		 Locale[] allLocales = Locale.getAvailableLocales(); 
	        int i = 0; 
	        for(Locale locale : allLocales) {
	            i++;
	            System.out.println("Country: " + locale.getDisplayCountry());
	            System.out.println("Language: " + locale.getDisplayLanguage());
	            if (i > 3) break;
	        }
	}
	public void currencydemo() {
		Double currencyAmount = new Double(123456789.555);
	       
	      //Get current locale information
	      Locale currentLocale = Locale.getDefault();
	       Locale france = Locale.FRANCE;
	       
	      //Get currency instance from locale; This will have all currency related information
	      Currency currentCurrency = Currency.getInstance(currentLocale);
	      Currency FranceCurrency = Currency.getInstance(france);
	      //Currency Formatter specific to locale
	      NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(currentLocale);
	      NumberFormat currencyFormatterFrance = NumberFormat.getCurrencyInstance(france);
	 
	      //Test the output
	      System.out.println("Current Locale:"+currentLocale.getDisplayName());
	       
	      System.out.println("Current Currency:"+currentCurrency.getDisplayName());
	       
	      System.out.println("Formated based on current Locale:"+currencyFormatter.format(currencyAmount));
	      
	      System.out.println("Current Locale:"+france.getDisplayName());
	       
	      System.out.println("Current Currency:"+FranceCurrency.getDisplayName());
	       
	      System.out.println("Formated based on current Locale:"+currencyFormatterFrance.format(currencyAmount));
	}
	public void calenderdemo() {
		Calendar c1= Calendar.getInstance();
		Locale local = new Locale("pt", "BR");
		Calendar c2= Calendar.getInstance(local);
		System.out.println(c1+""+c2);
	    Date date1 = new Date(99999999999L); 
        System.out.println("Our date is: " + date1);
        // Get Calendar instances from static factory method
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        cal1.setTime(date1); // Set calendar from date
        System.out.println("Our cal1 month is: " + cal1.get(Calendar.MONTH));
        System.out.println("Our cal1 year is: " + cal1.get(Calendar.YEAR));
        System.out.println("Our cal2 month is: " + cal2.get(Calendar.MONTH));
        System.out.println("Our cal2 year is: " + cal2.get(Calendar.YEAR));
        cal1.add(MONTH, 21); // No need to qualify due to static imports
        date1 = cal1.getTime(); // Set date from calendar 
        System.out.println("Our date is: " + date1);
        cal2.roll(Calendar.MONTH, -21);
        date1 = cal2.getTime();
        System.out.println("Our date is: " + date1);
		
	}
	public static void main(String[] args) {
		UtilitesBasicDemo de = new UtilitesBasicDemo();
		System.out.println("Calendar");
		de.calenderdemo();
		System.out.println("Currency");
		de.currencydemo();
		System.out.println("Locale");
		de.localedemo();
	}
}
