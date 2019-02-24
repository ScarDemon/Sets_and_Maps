import java.util.*;
public class SetExample {
public static <Type> Set <Type> SetUnion(Set<Type>A, Set<Type>B) {
	Set<Type>result = new TreeSet<Type>();
	Iterator<Type>itrA = A.iterator();
	while (itrA.hasNext()) {
		result.add(itrA.next());
	}
	Iterator<Type> itrB = B.iterator();
	while(itrB.hasNext()) {
		result.add(itrB.next());
	}
	return result;
}
public static <Type> Set <Type> SetIntersection(Set<Type>A, Set<Type>B) {
	Set<Type>result = new TreeSet<Type>();
	Iterator<Type>itrA = A.iterator();
	while (itrA.hasNext()) {
		Type value = itrA.next();
		if (B.contains(value))
			result.add(value);
	} // ends while
	return result;
	}
	
public static <Type> Set <Type> SetDifference(Set<Type>A, Set<Type>B) {
	Set<Type>result = new TreeSet<Type>();
	Iterator<Type>itrA = A.iterator();
	while (itrA.hasNext()) {
		Type value = itrA.next();
		if (!B.contains(value))
			result.add(value);
		
	}
	return result;
}

public static <Type> ArrayList <Type> removeDups(ArrayList<Type> a) {
	Set <Type> S = new HashSet<Type>();
	ArrayList<Type> b = new ArrayList<Type>();
	return b;
}

public static <Type> Set <Type> SetOfDuplicates(ArrayList<Type> words) {
	System.out.println("words in the List");
	System.out.println(words);
	Set<Type> w  = new HashSet<Type> (); // set of the words
	Set <Type> duplicates = new HashSet<Type>();
	Iterator <Type> itrwords = words.iterator();
	while (itrwords.hasNext()) 
	{
		Type s = itrwords.next();
		if (!w.add(s));
		duplicates.add(s);
	}
	
	return duplicates;
}


public static void main (String [] args) {
Set<String> First = new HashSet();	
Set<String> Second = new HashSet();
First.add("Sam");
First.add("Al");
First.add("Kelly");
Second.add("Jared");
Second.add("Al");
Second.add("Bryce");
Second.add("Kelly");

Iterator <String> itrFirst = First.iterator();
while (itrFirst.hasNext()) {
	System.out.println((String) itrFirst.next() + " ");
	System.out.println();
	Iterator<String> itrSecond = Second.iterator();
	while (itrSecond.hasNext()) 
	{
		System.out.println((String) itrSecond.next());
	}
	System.out.println();
	System.out.println("First Size:" + First.size());
	System.out.println("Second Size:" + Second.size());
	Set <String> result = SetUnion(First, Second);
	System.out.println(result);
	
	for (String s: result) {
		System.out.println(s);
	}
}
System.out.println("******************");
Set<String> SetUnion = new TreeSet<String>();
Set<String> SetIntersection = new TreeSet<String>();
Set<String> SetDifference = new TreeSet<String>();

SetUnion.addAll(First);
SetUnion.addAll(Second);
System.out.println(SetUnion);
Iterator itrUnion = SetUnion.iterator();

while (itrUnion.hasNext()) {
	System.out.println(itrUnion.next() + " ");
	
}

System.out.println();
System.out.println("*******************");
SetIntersection.addAll(First);
SetIntersection.retainAll(Second);
System.out.println(SetUnion);
Iterator itrIntersection = SetIntersection.iterator();

while (itrIntersection.hasNext()) {
	System.out.println(itrIntersection.next() + " ");
	
}
System.out.println();
System.out.println("*******************");


SetDifference.addAll(First);
SetDifference.removeAll(Second);

System.out.println(SetUnion);
Iterator itrDifference = SetDifference.iterator();

while (itrDifference.hasNext()) {
	System.out.println(itrDifference.next() + " ");
	
}
System.out.println();
System.out.println("*******************");


}
}
