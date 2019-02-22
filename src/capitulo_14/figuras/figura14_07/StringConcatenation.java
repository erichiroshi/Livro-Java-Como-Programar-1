package capitulo_14.figuras.figura14_07;

// Figura 14.7: StringConcatenation.java
// M�todo string concat.

public class StringConcatenation {

	public static void main(String[] args) {

		String s1 = "Happy ";
		String s2 = "Birthday";

		System.out.printf("s1 = %s%ns2 = %s%n%n", s1, s2);
		System.out.printf("Result of s1.concat(s2) = %s%n", s1.concat(s2));
		System.out.printf("s1 after concatenation = %s%n", s1);

	}
} // fim da classe StringConcatenation
