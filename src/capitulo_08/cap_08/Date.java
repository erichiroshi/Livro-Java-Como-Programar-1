package capitulo_08.cap_08;

// Figura 8.7: Date.java
// Declara��o da classe Date.

public class Date {

	private int month; // 1 - 12
	private int day; // 1 - 31 conforme m�s
	private int year; // qualquer ano

	private static final int[] daysPerMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	// construtor: confirma o valor adequado para o m�s e dia dado o ano
	public Date(int month, int day, int year) {

		// verifica se day est� no intervalo para month
		if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29)))
			throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");

		// verifique no ano bissexto se o m�s � 2 e dia � 29
		if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
			throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");

		this.month = month;
		this.day = day;
		this.year = year;

		System.out.printf("Date object constructor for date %s%n", this);

	}

	// retorna uma String no formato m�s/dia/ano
	public String toString() {

		return String.format("%d/%d/%d", month, day, year);
	}

}
