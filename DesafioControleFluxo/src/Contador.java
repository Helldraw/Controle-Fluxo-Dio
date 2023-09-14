import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o primeiro número do parametro: ");
		int parametroUm = entrada.nextInt();
		System.out.println("Informe o segundo número do parametro");
		int parametroDois = entrada.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
				
		}catch (ParametrosInvalidosException e) {
			System.out.println("O segundo parametro deve ser maior que o primeiro parametro " + e);
		}
		entrada.close();
		
	}
	
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if (parametroUm >= parametroDois) {
			throw new ParametrosInvalidosException();
		}
		int contagem = parametroDois - parametroUm;
		for(int indice = 0; indice < contagem; indice++) {
			System.out.println(indice+1);
	    }

		
	}

}
