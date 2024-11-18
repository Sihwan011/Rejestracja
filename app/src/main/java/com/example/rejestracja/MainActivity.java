package com.example.rejestracja;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);



            EditText emailEditText = findViewById(R.id.emailEditText);
            EditText PasswordEditText = findViewById(R.id.passwordEditText);
            EditText ConfirmEditText = findViewById(R.id.confirmPasswordEditText);
            Button submitbutton = findViewById(R.id.submitButton);
            TextView autor = findViewById(R.id.autor);

            submitbutton.setOnClickListener(v->{
                String email = emailEditText.getText().toString();
                String password = PasswordEditText.getText().toString();
                String Confirmpassword = ConfirmEditText.getText().toString();

                if (email.isEmpty() || !email.contains("@")) {
                    autor.setText("email musi zawierać znak @");
                }else if (!password.equals(Confirmpassword)){
                     autor.setText("Hasła muszą byc takie same");
                }else if (password.isEmpty()){
                    autor.setText("Hasło nie może byc puste");
                }else {
                    autor.setText("witaj" + email);
                }



        });

};
};