package ejc.acoes;

import java.util.ArrayList;
import java.util.List;

import ejc.entidades.Encontrista;
import ejc.entidades.VoluntarioEjc;
import ejc.entidades.gerador.GeradorEncontrista;

public class VoluntarioEjcRepositorio {
	
	private static List<VoluntarioEjc> valuntarioEjcList = new ArrayList<VoluntarioEjc>();
	
	public static void salvar(VoluntarioEjc voluntario) {
		valuntarioEjcList.add(voluntario);
	}
	public static VoluntarioEjc buscarPeloNome(String nome) {
		VoluntarioEjc encontristaRetorno = null;
		
		for(VoluntarioEjc voluntario : valuntarioEjcList) {
			if(voluntario.getNome().equals(nome)) {
				encontristaRetorno = voluntario;
			}
		}
		
		return encontristaRetorno;
	}
	
	public static List<VoluntarioEjc>  listar(){
		return valuntarioEjcList;
	}
	public static boolean deletar(VoluntarioEjc voluntario) {
		return valuntarioEjcList.remove(voluntario);
	}
	
	public static boolean deletarPeloNome(String nome) {
		return valuntarioEjcList.remove(buscarPeloNome(nome));
	}
}