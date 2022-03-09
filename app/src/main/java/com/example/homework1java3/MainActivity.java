package com.example.homework1java3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {
    private ImageView imageCar;
    private EditText Username, Password;
    private Button btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        Glide.with(this).load("https://i.pinimg.com/474x/23/ab/a6/23aba60b66ef08174bb7455c4a8a2d2f.jpg").into(imageCar);

        btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (Username.getText().toString().isEmpty()) {
                        Username.setError("Поле не может быть пустым");
                    } else if (Password.getText().toString().isEmpty()) {
                        Password.setError("Поле не может быть пустым");
                    } else {
                        Toast.makeText(MainActivity.this, "Успешно", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }


    private void init() {
        Username = findViewById(R.id.username);
        Password = findViewById(R.id.password);
        imageCar = findViewById(R.id.image_Car);
        btn = findViewById(R.id.btn_go);

    }

}