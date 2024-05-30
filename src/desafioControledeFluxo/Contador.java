package desafioControledeFluxo;
import java.util.Locale;
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {

		
		Scanner terminal = new Scanner (System.in).useLocale(Locale.US);

		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();

		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();

			
			terminal.close();

		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
			
		
		}catch (parametrosInvalidosException e) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws parametrosInvalidosException {
        
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção

		

		if (parametroUm < parametroDois) {
			int contagem = parametroDois - parametroUm;
			int contador = 0;
		//realizar o for para imprimir os números com base na variável contagem
		
			

		for (contador=0; contador <= contagem; contador++){
			System.out.println(contador);
		}
		
		

		} else
			System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
		
	}
}