package capitulo_11.figuras.figura11_5;

// Figura 11.5: UsingExceptions.java
// mecanismo de tratamento de exce��o try....catch....finally

public class UsingExceptions {

	public static void main(String[] args) {

		try {
			throwException();
		}

		catch (Exception exception) // exce��o lan�ada por throwException
		{
			System.err.println("Exception handled in main");
		}

		doesNotThrowException();

	}

	// demonstra try....catch....finally
	public static void throwException() throws Exception {

		try // lan�a um exce��o e imediatamente a captura
		{
			System.out.println("Method throwException");
			throw new Exception(); // gera a exce��o
		} catch (Exception exception) // captura exce��o lan�ada em try
		{
			System.err.println("Exception handled in method throwException");
			throw exception; // lan�a novamente para processamento adicional

		} finally // executa independentemente do que ocorre em try....catch
		{
			System.err.println("Finally executed in throwException");
		}

		// o c�digo aqui n�o seria alcan�ado; poderia causar erros de compila��o

	}

	// demonstra finally quando nenhum exce��o ocorrer
	public static void doesNotThrowException() {

		try // bloco try n�o lan�a uma exce��o
		{
			System.out.println("Method doesNotThrowException");
		} catch (Exception exception) // n�o executa
		{
			System.err.println(exception);
		} finally // executa independentemente do que ocorre em try....catch
		{
			System.err.println("Finally executed in doesNotThrowException");
		}

		System.out.println("End of method in doesNotThrowException");
	}

} // fim da classe UsingExceptions
