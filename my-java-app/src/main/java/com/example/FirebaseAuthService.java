package com.example;

import com.google.firebase.auth.FirebaseAuth;

public class FirebaseAuthService {
    public void authenticateUser(String email, String password) {
        FirebaseAuth firebaseAuth = new FirebaseAuth.getInstance();
        String result;
        // In a real app, you would handle this via token-based login.
        firebaseAuth.signInWithEmailAndPassword(email,password)
                .addOnCompleteListener(task -> {
                    if (task.isSuccessful()) {
                        System.out.println("Authentication successful!");
                    } else {
                        System.out.println("Authentication failed.");
                    }
                });

    }
}
