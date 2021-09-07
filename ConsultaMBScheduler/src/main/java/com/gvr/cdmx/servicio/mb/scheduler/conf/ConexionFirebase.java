package com.gvr.cdmx.servicio.mb.scheduler.conf;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

		try {
			serviceAccount = new FileInputStream("./arkonmetrobuscdmx-firebase-adminsdk-zxjvd-f55a1b3d5b.json");
				options = new FirebaseOptions.Builder()
						.setCredentials(GoogleCredentials.fromStream(serviceAccount)).build();
			FirebaseApp.initializeApp(options);
			System.out.println(":::::::::::Estableciendo conexión con Firebase:::::::::::::::");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e2) { 
			e2.printStackTrace();
		}
		return FirestoreClient.getFirestore();
	}

}
