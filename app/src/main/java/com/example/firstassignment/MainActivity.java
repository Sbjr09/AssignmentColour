package com.example.firstassignment;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Resources resources;
    TextView Button1;
    TextView Button2;
    TextView Button3;
    EditText Edttxt;
    Button SaveContinue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitializeView();
        InitializeListner();

    }
    private void InitializeView(){
        Button1 = findViewById(R.id.B1);
        Button2 = findViewById(R.id.B2);
        Button3= findViewById(R.id.B3);
        Edttxt = findViewById(R.id.Edtxt);
        SaveContinue = findViewById(R.id.SC);


    }

    private void InitializeListner(){
        Edttxt.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (Edttxt.getText().toString().equals("Button1")){
                            Button1.setBackgroundColor(getColor(R.color.Green));
                            Button2.setBackgroundColor(getColor(R.color.Red));
                            Button3.setBackgroundColor(getColor(R.color.Red));

                        } else if (Edttxt.getText().toString().equals("Button2")) {
                            Button1.setBackgroundColor(getColor(R.color.Red));
                            Button2.setBackgroundColor(getColor(R.color.Green));
                            Button3.setBackgroundColor(getColor(R.color.Red));



                        } else if (Edttxt.getText().toString().equals("Button3")) {
                            Button1.setBackgroundColor(getColor(R.color.Red));
                            Button2.setBackgroundColor(getColor(R.color.Red));
                            Button3.setBackgroundColor(getColor(R.color.Green));

                        }

                    }
                }

        );

    }
}