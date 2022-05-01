package ejc;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Bem-vindo(a) ao sistema do EJC");
		
		
		do {
			int operacao = 0;
			System.out.println("Escolha uma opereração a ser realizada");
			System.out.println("0 - sair");
			System.out.println("1 - Cadastrar Encontrista");
			System.out.println("2 - Cadastrar Voluntário");
			System.out.println("3 - Gerar grupo");
			System.out.println("4 - Separar transporte");
		
			
		}while(true);
		
			
	}

	public static void cadastrarEncontrista() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o nome: ");		 
		String nome = teclado.nextLine();
		
		System.out.println("Digite seu telefone: ");		 
		String telefone = teclado.nextLine();
		
		System.out.println("Copie o url da foto: ");		 
		String urlFoto = teclado.nextLine();
		
		System.out.println("Informe sua data de nascimento: ");		 
		Date dataDeNascimento = teclado.nextLine();
		
		System.out.println("Informe o nome da sua rua: ");		 
		String rua = teclado.nextLine();
		
		System.out.println("Informe o número da sua casa: ");		 
		String casaNumero = teclado.nextLine();
		
		System.out.println("Informe seu bairro: ");		 
		String bairro = teclado.nextLine();
		
		System.out.println("Informe a cidade onde você mora ");		 
		String cidade = teclado.nextLine();
		
		System.out.println("Informe o estado onde você mora: ");		 
		String estado = teclado.nextLine();
		
		System.out.println("Informe o CEP da sua rua: ");		 
		String cep = teclado.nextLine();
		
		System.out.println("Informe o nome do seu responsável ");		 
		String Nomeresponsavel = teclado.nextLine();
		
		System.out.println("Informe o telefone de contato do seu responsável ");		 
		String telefoneResponsavel = teclado.nextLine();
		
		
		
		
		
		
	}
	
	
}
