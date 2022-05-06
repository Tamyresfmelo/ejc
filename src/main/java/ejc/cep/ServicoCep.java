package ejc.cep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.slf4j.helpers.Util;

import com.google.gson.Gson;

import ejc.entidades.Endereco;

public class ServicoCep {

	static String webService = "http://viacep.com.br/ws/";
	static int codigoSucesso = 200;

	public static EnderecoCep buscarEnderecoPeloCep(String cep) throws IOException {
		String urlBusca = webService + cep + "/json";
		URL url = new URL(urlBusca);
		HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
		if (conexao.getResponseCode() != codigoSucesso) {
			System.out.println("Deu erro!");
		}

		BufferedReader resposta = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
		
		String jsonEmString = converteJsonEmString(resposta);

        Gson gson = new Gson();
        EnderecoCep enderecoCep = gson.fromJson(jsonEmString, EnderecoCep.class);
				
		return enderecoCep;


	}
	
	public static String converteJsonEmString(BufferedReader buffereReader) throws IOException {
        String resposta, jsonEmString = "";
        while ((resposta = buffereReader.readLine()) != null) {
            jsonEmString += resposta;
        }
        return jsonEmString;
    }
	
}


