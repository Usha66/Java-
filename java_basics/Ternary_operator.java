package java_basics;

public class Ternary_operator {
	public static void main(String[]args) {
		int l=20;
		int o=24;
		//condition ? outputs(if true: if false)
		System.out.println((l>o)?l:o);
		
		//to compare string's length
		String name1= "JAIN";
		int length1= name1.length();
		String name2= "UNIVERSITY";
		int length2= name2.length();
		System.out.println((length1<length2)?length2:length1);
		
		String name01= "JAIN";
		String name02= "UNIVERSITY";
		System.out.println((name1.length()<name2.length())?name1:name2);

	}

}







//		String quote=String.format("MY NAME IS %s AND I'M A %s",name,profession);
