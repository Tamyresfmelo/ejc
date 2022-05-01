package ejc;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import com.google.api.core.ApiFuture;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;

public class Teste {
	
	public Teste() throws IOException, InterruptedException, ExecutionException {
		InputStream is = Principal.class.getClassLoader().getResourceAsStream("credencial.json");
		GoogleCredentials credentials = GoogleCredentials.fromStream(is);
		FirebaseOptions options = new FirebaseOptions.Builder()
			    .setCredentials(credentials)
			    .build();
			FirebaseApp.initializeApp(options);

			Firestore db = FirestoreClient.getFirestore();
			DocumentReference docRef = db.collection("encontristas").document("tamyres");
			// Add document data  with id "alovelace" using a hashmap
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("nome", "tamyres");
			data.put("idade", 33);
			data.put("cor favorita", "rosa");
			//asynchronously write data
			ApiFuture<WriteResult> result = docRef.set(data);
			// ...
			// result.get() blocks on response
			System.out.println("Update time : " + result.get().getUpdateTime());
	}

}
