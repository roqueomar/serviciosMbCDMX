package com.gvr.cdmx.servicio.mb.consulta.conf;

import java.io.FileInputStream;
import java.io.IOException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;

@Configuration
public class ConexionFirebase {

	@Bean
	public Firestore iniciarFirebase(){

		FileInputStream serviceAccount;
		FirebaseOptions options;
 
		try {		//El siguiente código es proporcionado por firebase para su conexión a su bd al igual que su archivo .json
			serviceAccount = new FileInputStream("./arkonmetrobuscdmx-firebase-adminsdk-zxjvd-f55a1b3d5b.json");
				options = new FirebaseOptions.Builder()
						.setCredentials(GoogleCredentials.fromStream(serviceAccount)).build();
			FirebaseApp.initializeApp(options);
			System.out.println(":::::::::::CONSULTA MB - Estableciendo conexión con Firebase:::::::::::::::");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return FirestoreClient.getFirestore();
	}

}
