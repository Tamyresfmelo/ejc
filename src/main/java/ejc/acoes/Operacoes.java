package ejc.acoes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import ejc.entidades.Encontrista;
import ejc.entidades.VoluntarioEjc;

public class Operacoes {

	public static Map<String, List<Encontrista>> separarGrupo(List<Encontrista> encontristaList) {

		Map<String, List<Encontrista>> grupo = new HashMap<String, List<Encontrista>>();

		for (int i = 0; i < encontristaList.size(); i++) {
			Encontrista encontrista = encontristaList.get(i);
			String bairroEncontrista = encontrista.getEndereco().getBairro();

			if (grupo.containsKey(bairroEncontrista)) {
				grupo.get(bairroEncontrista).add(encontrista);
			} else {
				grupo.put(bairroEncontrista, new ArrayList<Encontrista>());
				grupo.get(bairroEncontrista).add(encontrista);
			}

		}
		return grupo;
	}

	public static Map<String, List<Encontrista>> dividirTransporte(Map<String, List<Encontrista>> encontristaMap,
			List<VoluntarioEjc> voluntarioList) {

		Map<String, List<Encontrista>> grupoTransporte = new HashMap<String, List<Encontrista>>();

		for (int i = 0; i < voluntarioList.size(); i++) {
			VoluntarioEjc voluntario = voluntarioList.get(i);

			if (voluntario.isTemCarro() && voluntario.isCasado() && voluntario.isFezEcc()) {
				grupoTransporte.put(voluntario.getNome(), new ArrayList());

			}

		}

		for (String nomeVoluntario : grupoTransporte.keySet()) {
			for (String nomeBairro : encontristaMap.keySet()) {
				while (grupoTransporte.get(nomeVoluntario).size() < 3
						&& temEncontristaSemCarro(encontristaMap.values())) {
					if (!encontristaMap.get(nomeBairro).isEmpty()) {
						Encontrista encontrista = encontristaMap.get(nomeBairro).remove(0);
						grupoTransporte.get(nomeVoluntario).add(encontrista);
					}
				}

			}
		}

		return grupoTransporte;

	}

	private static boolean temEncontristaSemCarro(Collection<List<Encontrista>> values) {

		for (List<Encontrista> list : values) {
			if (!list.isEmpty()) {
				return true;
			}
		}
		return false;
	}

}
