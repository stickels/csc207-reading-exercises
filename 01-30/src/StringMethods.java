
public class StringMethods {

	public static boolean endsWithRep(String s1, String s2, int n) {

		String newstring = s2;
		for (int i = 1; i < n; i++)
			newstring += s2;
		
		boolean var = s1.endsWith(newstring);
		return var;
	}

	public static void main(String[] args) {
		System.out.println(endsWithRep("foobarbar", "bar", 2));
		System.out.println(endsWithRep("foobar", "baz", 1));
	}

}