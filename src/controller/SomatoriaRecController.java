/* 
 * 5. Criar uma aplica��o em Java que tenha uma fun��o recursiva que, 
 * recebendo um n�mero inteiro (N), apresente a sa�da da somat�ria:
 * 
 *  S = 1 + 1/2 + 1/3 + 1/4 + � + 1/N
 *  
 *  � O C�digo deve apresentar, em formato de coment�rio, 
 *  como foi definida a condi��o de parada;
 *  � O C�digo deve apresentar, em formato de coment�rio, 
 *  como foi definida a rela��o de chamada dos passos.
 *  
 *  Dica: 
 *  Para fazer a divis�o de 2 inteiros retornar um double, 
 *  deve-se converter (cast) as vari�veis para double.
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
    	// Condi��o de parada: quando N � igual a 1, a somat�ria � 1
        if (N == 1) {
            return 1.0;
        }
        // Chamada recursiva: somat�ria em fun��o do valor atual (1/N) e 
        //do pr�ximo valor (N - 1)
        return 1.0 / N + calcularSomatoria(N - 1);
    }

}

/*
 * Condi��o de Parada: 
 * A condi��o de parada � quando N � igual a 1. 
 * Nesse caso, a somat�ria � 1.
 * Rela��o de Chamada: 
 * A rela��o de chamada � estabelecida na chamada recursiva da fun��o 
 * calcularSomatoria. 
 * A cada chamada, estamos somando 1/N ao valor atual da somat�ria, 
 * onde N � o n�mero atual e 1/N � o termo que estamos adicionando.
 * O uso do cast (double) � importante para garantir 
 * que a divis�o de dois inteiros retorne um valor double, 
 * pois a divis�o de inteiros em Java resulta em um valor inteiro truncado. 
 * Testar a fun��o com diferentes valores de N para obter 
 * os resultados desejados.
 */
