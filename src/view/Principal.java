package view;

import controller.SomatoriaRecController;

public class Principal {

	public static void main(String[] args) {

		SomatoriaRecController sm = new SomatoriaRecController();
    	
        int N = 5; // Alterar o valor de N conforme necessário!
        double resultado = sm.calcularSomatoria(N);

        System.out.println("A somatória S é: " + resultado);
    }

}

