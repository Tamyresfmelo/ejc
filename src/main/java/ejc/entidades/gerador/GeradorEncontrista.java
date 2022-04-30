package ejc.entidades.gerador;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.github.javafaker.Faker;

import ejc.entidades.Encontrista;
import ejc.entidades.Endereco;

public class GeradorEncontrista {
	
	
	
	public static List<Encontrista> gerarEncontrista(int quantidade){
		Faker faker = new Faker(new Locale("pt-BR"));
		List<Encontrista> retorno = new ArrayList<Encontrista>();
		for(int i = 0; i < quantidade; i++) {
			Encontrista encontrista = new Encontrista();
			encontrista.setNome(faker.name().fullName());
			encontrista.setNomeResponsavel(faker.name().fullName());
			encontrista.setTelefone(faker.phoneNumber().cellPhone());
			encontrista.setTelefoneResponsavel(faker.phoneNumber().cellPhone());
			encontrista.setUrlFoto(faker.internet().image());
			Endereco endereco = new Endereco();
			endereco.setBairro(faker.address().streetName());
			endereco.setCep(faker.address().zipCode());
			endereco.setCidade(faker.address().cityName());
			endereco.setEstado(faker.address().state());
			endereco.setNumero(faker.address().streetAddressNumber());
			encontrista.setEndereco(endereco);
			retorno.add(encontrista);
		}
		return retorno;
	}

}
