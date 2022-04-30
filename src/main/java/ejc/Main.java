package ejc;

import java.util.List;
import java.util.Locale;

import com.github.javafaker.Faker;

import ejc.entidades.Encontrista;
import ejc.entidades.gerador.GeradorEncontrista;

public class Main {

	public static void main(String[] args) {
		List<Encontrista> encontrista = GeradorEncontrista.gerarEncontrista(10);
		System.out.println(encontrista.get(0).getNome());
		System.out.println(encontrista.get(0).getTelefone());
		System.out.println(encontrista.get(0).getEndereco().getBairro());

	}

}
