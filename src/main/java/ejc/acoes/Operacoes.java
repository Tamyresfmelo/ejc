package ejc.acoes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ejc.entidades.Encontrista;

public class Operacoes {
	
	
	public static Map<String,List<Encontrista>> separarGrupo(List<Encontrista> encontristaList){
		
		Map<String,List<Encontrista>> grupos = new HashMap<String, List<Encontrista>>();
		
		for (Encontrista encontrista : encontristaList) {
			if(grupos.containsKey(encontrista.getEndereco().getBairro())){
				grupos.get(encontrista.getEndereco().getBairro()).add(encontrista);
			}else {
				grupos.put(encontrista.getEndereco().getBairro(), new ArrayList<Encontrista>());
				grupos.get(encontrista.getEndereco().getBairro()).add(encontrista);
			}
			
		}
		return grupos;
	}

}
