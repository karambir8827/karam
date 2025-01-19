package com.example;

import java.io.FileInputStream;
import java.io.IOException;

public class App
{
    public static void main( String[] args )
    {

        try {
            // Path to the serviceAccountKey.json file
            String serviceAccountPath = "src/main/resources/myapp-da060-firebase-adminsdk-fbsvc-3d09aa595c.json";

            // Load credentials from the service account key file
            FileInputStream serviceAccount = new FileInputStream(serviceAccountPath);

            FirebaseOptions options = FirebaseOptions.builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .setDatabaseUrl("https://<your-database-name>.firebaseio.com") // Add database URL if using Realtime Database
                    .build();

            // Initialize Firebase
            FirebaseApp.initializeApp(options);

            System.out.println("Firebase has been successfully initialized!");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error initializing Firebase: " + e.getMessage());
        }

     FirebaseAuthService authentication = new FirebaseAuthService();
        authentication.authenticateUser("test@example.com","password123");

    }
}




