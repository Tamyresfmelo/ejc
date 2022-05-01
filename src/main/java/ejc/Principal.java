package ejc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import ejc.acoes.EncontristaRepositorio;
import ejc.acoes.VoluntarioEjcRepositorio;
import ejc.entidades.Encontrista;
import ejc.entidades.Endereco;
import ejc.entidades.Pessoa;
import ejc.entidades.VoluntarioEjc;

public class Principal {

	public static void main(String[] args) throws ParseException {
		System.out.println("Bem-vindo(a) ao sistema do EJC");
        Scanner teclado = new Scanner (System.in);
		int operacao = 0;
		do {
			System.out.println("Escolha uma operera��o a ser realizada");
			System.out.println("0 - sair");
			System.out.println("1 - Cadastrar Encontrista");
			System.out.println("2 - Cadastrar Volunt�rio");
			System.out.println("3 - Gerar grupo");
			System.out.println("4 - Separar transporte");
			System.out.println("5 - Listar Encontrista");
			System.out.println("6 - Listar Voluntario");
			operacao = teclado.nextInt();

			switch (operacao) {
			case 0:
				System.out.println("Até mais!");
				break;

			case 1:
                 System.out.println("### Cadastro Encontrista ###");
                 cadastrarEncontrista();
				break;

			case 2:
				System.out.println("### Cadastro Voluntário ###");
                cadastrarVoluntario();
				break;

			case 3:

				break;

			case 4:

				break;
			case 5:
				System.out.println("### Listar Encontrista ###");
				listarEncontrista();
				break;
			case 6:
				System.out.println("### Listar Voluntário ###");
				listarVoluntario();
				break;
			}

		} while (operacao != 0);

	}

	public static void cadastrarEncontrista() throws ParseException {
		Scanner teclado = new Scanner(System.in);
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Encontrista encontrista = new Encontrista();
		Endereco endereco = new Endereco();

		System.out.println("Digite o nome: ");
		String nome = teclado.nextLine();

		System.out.println("Digite seu telefone: ");
		String telefone = teclado.nextLine();

		System.out.println("Copie o url da foto: ");
		String urlFoto = teclado.nextLine();

		System.out.println("Informe sua data de nascimento: ");
		Date dataDeNascimento = formato.parse(teclado.nextLine());

		System.out.println("Informe o nome da sua rua: ");
		String rua = teclado.nextLine();

		System.out.println("Informe o n�mero da sua casa: ");
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
		String nomeResponsavel = teclado.nextLine();

		System.out.println("Informe o telefone de contato do seu responsável ");
		String telefoneResponsavel = teclado.nextLine();

		encontrista.setNome(nome);
		encontrista.setTelefone(telefone);
		encontrista.setUrlFoto(urlFoto);
		encontrista.setDataNascimento(dataDeNascimento);
		encontrista.setNomeResponsavel(nomeResponsavel);
		encontrista.setTelefoneResponsavel(telefoneResponsavel);
		endereco.setRua(rua);
		endereco.setNumero(casaNumero);
		endereco.setBairro(bairro);
		endereco.setCidade(cidade);
		endereco.setEstado(estado);
		endereco.setCep(cep);
		encontrista.setEndereco(endereco);
		EncontristaRepositorio.salvar(encontrista);

	}
	private static void listarEncontrista() {
		for(Encontrista encontrista: EncontristaRepositorio.listar()) {
			System.out.println("Nome: "+ encontrista.getNome() + "  -   Telefone: "+ encontrista.getTelefone());
		}
	}
	private static void listarVoluntario() {
		for(VoluntarioEjc voluntario: VoluntarioEjcRepositorio.listar()) {
			System.out.println("Nome:"+ voluntario.getNome() + "Telefone:"+ voluntario.getTelefone());
		}
	}

	 
	public static void cadastrarVoluntario() throws ParseException {
		Scanner teclado = new Scanner(System.in);
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		VoluntarioEjc voluntario = new VoluntarioEjc();
		Endereco endereco = new Endereco();

		System.out.println("Digite o nome: ");
		String nome = teclado.nextLine();

		System.out.println("Digite seu telefone: ");
		String telefone = teclado.nextLine();

		System.out.println("Copie o url da foto: ");
		String urlFoto = teclado.nextLine();

		System.out.println("Informe sua data de nascimento: ");
		Date dataDeNascimento = formato.parse(teclado.nextLine());

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

		System.out.println("casado(a)? ");
		String casado = teclado.nextLine();

		System.out.println("Informe o nome do seu cônjuge: ");
		String conjuge = teclado.nextLine();

		System.out.println("Fez ECC? ");
		String ecc = teclado.nextLine();

		System.out.println("Tem carro? ");
		String carro = teclado.nextLine();

		voluntario.setNome(nome);
		voluntario.setTelefone(telefone);
		voluntario.setUrlFoto(urlFoto);
		voluntario.setDataNascimento(dataDeNascimento);
		endereco.setRua(rua);
		endereco.setNumero(casaNumero);
		endereco.setBairro(bairro);
		endereco.setCidade(cidade);
		endereco.setEstado(estado);
		endereco.setCep(cep);

		if (ecc.equalsIgnoreCase("sim")) {
			voluntario.setFezEcc(true);
		}

		if (carro.equalsIgnoreCase("sim")) {
			voluntario.setTemCarro(true);
		}

		if (casado.equalsIgnoreCase("sim")) {
			voluntario.setCasado(true);
		}

		voluntario.setEndereco(endereco);
		VoluntarioEjcRepositorio.salvar(voluntario);

	}
}
