package defaultmethods.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


//interface with definition in enhancement in jdk:1.8 or <
@FunctionalInterface //single abstract method-declared when a interface has one abstract method 
interface FootballS{
	default void printInitial() {
		System.out.println("The score is 0:0");
	}
	abstract void printhalftime();
	// multiple default methods is also possible
	default void printfinal() {
		System.out.println("The score after 90 mins 2:1(multiple default methods)");
	}
}
interface sample{
	void testit();
}
interface FootballScore {
	default void printInitial() {
		System.out.println("The score is 0:0");
	}
	// multiple default methods is also possible
	default void printfinal() {
		System.out.println("The score after 90 mins 2:1(multiple default methods)");
	}
	//static methods can be called with interface name
	static void printhalftime() {
		System.out.println("The Score after 45 mins 1:0");
	}
}
public class DefaultMethodsAndLambdaExpression implements FootballScore {
	@Override
	public void printInitial() {
		System.out.println("The score is 0:0(derived)");
	}
	public static void main(String[] args) {
		new DefaultMethodsAndLambdaExpression().printInitial();
		FootballScore.printhalftime();
		new DefaultMethodsAndLambdaExpression().printfinal();
		//method references
		System.out.println("Method references");
		List<String> obj= new ArrayList<String>();
		obj.add("lambda");
		obj.add("functions");
		obj.add("collections");
		
		obj.forEach(System.out::println);//static method reference
		
		List <Integer> integers = Arrays.asList(1,12,123,1234);
		
		Optional <Integer> max= integers.stream().reduce(Math::max);//static method reference
		max.ifPresent(value-> System.out.println(value));
		
		Optional<Integer> min = integers.stream().reduce(Math::min);//static method reference
		min.ifPresent(value-> System.out.println(value));
		
		List<String> strings= Arrays.asList("how","to","do","in","java","dot","com");
		List<String> sorted = strings.stream().sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toList());
		List<String> sortedalt = strings.stream().sorted(String::compareTo).collect(Collectors.toList());
		System.out.println("method 1: "+sorted+"method 2: "+sortedalt);
		
		//lambda expressions
		sample s1=()->{
			System.out.println("hello.....");
		};
		s1.testit();//calling it
	}
}
