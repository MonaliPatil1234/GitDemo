package section_13_and_14;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Streams1 {
	@Test
	public void regular() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Adarsh");
		names.add("Aditi");
		names.add("Bheem");
		names.add("Aman");
		names.add("Yudhishthir");
		names.add("Rajat");
		int count = 0;
		for (String name : names) {
			if (name.startsWith("A")) {
				count++;
				System.out.println("**********************************" + name);
			}
		}
		System.out.println("**********************************" + count);

	}

	@Test
	public void streamFilter() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Adarsh");
		names.add("Aditi");
		names.add("Bheem");
		names.add("Aman");
		names.add("Yudhishthir");
		names.add("Rajat");
		// below code will give count of the strings in names array list which starts
		// with a
		Long c = names.stream().filter(s -> s.startsWith("A")).count();

		// print the count on console
		System.out.println("**********************************" + c);
		// below code creates a stream of strings and get the strings starting with a
		// with count
		Long d = Stream.of("aasd", "dhkjd", "aasasas", "yueifh", "asasasa", "aaa").filter(s ->

		s.startsWith("a")).count();

		System.out.println("**********************************" + d);

		// below line of code will print strings whose length is greater than 4
		names.stream().filter(s -> s.length() > 4)
				.forEach(s -> System.out.println("**********************************" + s));

		// if you want to print only one string then below line does the same
		names.stream().filter(s -> s.length() > 4).limit(1)
				.forEach(s -> System.out.println("**********************************" + s));

	}

	@Test
	public void streamsMap() {
		// sort the strings, convert to uppercase and then print one by one with forEach
		Stream.of("Alekhya", "Aakash", "Darla", "Axar", "Diwali").sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

		// filter the list of strings with strings ending with letter a then
		// sort the captured new list of strings convert to lowercase and print on
		// console

		List<String> names1 = Arrays.asList("Alekhya", "Aakash", "Darla", "Axar", "Diwali", "Rajat");
		names1.stream().filter(s -> s.endsWith("a")).sorted().map(s -> s.toLowerCase())
				.forEach(s -> System.out.println(s));

		// merge 2 streams and print the values in it
		ArrayList<String> names = new ArrayList<String>();
		names.add("Adarsh");
		names.add("Aditi");
		names.add("Bheem");
		names.add("Aman");
		names.add("Yudhishthir");
		names.add("Rajat");
		Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
		// newStream
		// .sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		boolean flag = newStream.anyMatch(s -> s.equalsIgnoreCase("Aman"));
		System.out.println(flag);
		Assert.assertTrue(flag);
	}

	@Test
	public void streamCollect() {
		//convert a stream to list
		List<String> ls = Stream.of("Alekhya", "Aakash", "Darla", "Axar", "Diwali", "Rajat").sorted()
				.map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println("1st element of list ls is "+ls.get(0));
		
		List<Integer> values = Arrays.asList(1,2,2,3,5,7,9,6,5,5,3,2);
		//print unique nos from this array
		//sort the array
		//values.stream().distinct().forEach(s->System.out.println(s));
		List<Integer> ls1 = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(ls1.get(2));

	}
}
