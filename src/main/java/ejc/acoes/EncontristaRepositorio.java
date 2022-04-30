package ejc.acoes;

import java.util.ArrayList;
import java.util.List;

import ejc.entidades.Encontrista;
import ejc.entidades.gerador.GeradorEncontrista;

public class EncontristaRepositorio {
	
	private static List<Encontrista> encontristaList = GeradorEncontrista.gerarEncontrista(10);
	
	public static void salvar(Encontrista encontrista) {
		encontristaList.add(encontrista);
	}
	public static Encontrista buscarPeloNome(String nome) {
		Encontrista encontristaRetorno = null;
		
		for(Encontrista encontrista : encontristaList) {
			if(encontrista.getNome().equals(nome)) {
				encontristaRetorno = encontrista;
			}
		}
		
		return encontristaRetorno;
	}
	public static boolean deletar(Encontrista encontrista) {
		return encontristaList.remove(encontrista);
	}
	
	public static boolean deletarPeloNome(String nome) {
		return encontristaList.remove(buscarPeloNome(nome));
	}
}
