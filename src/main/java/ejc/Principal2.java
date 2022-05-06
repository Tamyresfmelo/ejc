package ejc;

import java.io.IOException;
import java.util.Scanner;

import ejc.cep.EnderecoCep;
import ejc.cep.ServicoCep;

public class Principal2 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Informe seu CEP:");
		Scanner teclado = new Scanner(System.in);
		
		String cep = teclado.nextLine();
		ServicoCep.buscarEnderecoPeloCep(cep);
		
		EnderecoCep enderecoCep = ServicoCep.buscarEnderecoPeloCep(cep);
		System.out.println(enderecoCep.bairro);
		

	}

}
