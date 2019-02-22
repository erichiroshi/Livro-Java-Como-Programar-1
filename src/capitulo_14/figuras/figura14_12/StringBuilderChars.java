package capitulo_14.figuras.figura14_12;

// Figura 14.12: StringBuilderChars.java
// M�todos StringBuilder charAt, setCharAt, getChars e reverse.

public class StringBuilderChars {
	public static void main(String[] args) {
		
		StringBuilder buffer = new StringBuilder("hello there");

		System.out.printf("buffer = %s%n", buffer.toString());
		System.out.printf("Character at 0: %s%nCharacter at 4: %s%n%n", buffer.charAt(0), buffer.charAt(4));

		char[] charArray = new char[buffer.length()];
		buffer.getChars(0, buffer.length(), charArray, 0);
		System.out.print("The characters are: ");

		for (char character : charArray)
			System.out.print(character);

		buffer.setCharAt(0, 'H');
		buffer.setCharAt(6, 'T');
		System.out.printf("%n%nbuffer = %s", buffer.toString());

		buffer.reverse();
		System.out.printf("%n%nbuffer = %s%n", buffer.toString());
		
		System.out.println();
		System.out.println(buffer);
		buffer.reverse();
		System.out.println(buffer);
	}
} // fim da classe StringBuilderChars