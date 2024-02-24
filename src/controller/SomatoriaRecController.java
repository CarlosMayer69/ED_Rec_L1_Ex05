/* 
 * 5. Criar uma aplicação em Java que tenha uma função recursiva que, 
 * recebendo um número inteiro (N), apresente a saída da somatória:
 * 
 *  S = 1 + 1/2 + 1/3 + 1/4 + … + 1/N
 *  
 *  • O Código deve apresentar, em formato de comentário, 
 *  como foi definida a condição de parada;
 *  • O Código deve apresentar, em formato de comentário, 
 *  como foi definida a relação de chamada dos passos.
 *  
 *  Dica: 
 *  Para fazer a divisão de 2 inteiros retornar um double, 
 *  deve-se converter (cast) as variáveis para double.
 *  Exemplo: 
 *  int n = 2;
 *  double x = 1 / (double) n;
 */

package controller;

public class SomatoriaRecController {
	
	public SomatoriaRecController() {
		super();
	}
	
	public static double calcularSomatoria(int N) {
    	// Condição de parada: quando N é igual a 1, a somatória é 1
        if (N == 1) {
            return 1.0;
        }
        // Chamada recursiva: somatória em função do valor atual (1/N) e 
        //do próximo valor (N - 1)
        return 1.0 / N + calcularSomatoria(N - 1);
    }

}

/*
 * Condição de Parada: 
 * A condição de parada é quando N é igual a 1. 
 * Nesse caso, a somatória é 1.
 * Relação de Chamada: 
 * A relação de chamada é estabelecida na chamada recursiva da função 
 * calcularSomatoria. 
 * A cada chamada, estamos somando 1/N ao valor atual da somatória, 
 * onde N é o número atual e 1/N é o termo que estamos adicionando.
 * O uso do cast (double) é importante para garantir 
 * que a divisão de dois inteiros retorne um valor double, 
 * pois a divisão de inteiros em Java resulta em um valor inteiro truncado. 
 * Testar a função com diferentes valores de N para obter 
 * os resultados desejados.
 */
