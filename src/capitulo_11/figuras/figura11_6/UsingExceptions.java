package capitulo_11.figuras.figura11_6;

// Figura 11.6: UsingExceptions.java
// Desempilhando e obtendo dados a partir de um objeto de exce��o.

public class UsingExceptions {

	public static void main(String[] args) {

		try {

			method1();
		} catch (Exception exception) // captura a exce��o lan�ada em method1
		{
			System.err.printf("%s%n%n", exception.getMessage());
			exception.printStackTrace();

			// obt�m informa��es de rastreamento de pilha
			StackTraceElement[] traceElements = exception.getStackTrace();

			System.out.printf("%nStack trace form getStackTrace:%n");
			System.out.println("Class\t\t\t\t\t\tFile\t\t\tLine\tMethod");

			// faz um loop por traceElements para obter a descri��o da exce��o
			for (StackTraceElement element : traceElements) {
				System.out.printf("%s\t", element.getClassName());
				System.out.printf("%s\t", element.getFileName());
				System.out.printf("%s\t", element.getLineNumber());
				System.out.printf("%s%n", element.getMethodName());
			}
		}

	} // fim de main

	// chama method2; lan�a exce��es de volta para main
	public static void method1() throws Exception {
		method2();
	}

	// chama method3; lan�a exce��es de volta para method1

	public static void method2() throws Exception {
		method3();
	}

	// lan�a Exception de volta para method2
	public static void method3() throws Exception  {
		throw new Exception("Exception thrown in method3");
	}

} // fmi da classe UsingExceptions
