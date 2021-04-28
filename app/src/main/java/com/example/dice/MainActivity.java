package com.example.dice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import java.util.Random;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;          //creating variable
    private TextView textView;      //creating variable
    private EditText editText;      //creating variable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);             //assignment of id
        textView = findViewById(R.id.textView);         //assignment of id
        //editText = findViewById(R.id.editText);
        
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "Hi Clicked listener work !", Toast.LENGTH_SHORT).show();         // To give a message after clicking the button
                //String stringNumber = editText.getText().toString();       // read from editText id and convert to string
                //int number = Integer.parseInt(stringNumber);               // convert the string in to integer using parseInt method

                Random random = new Random();                   //random number generator
                int number = random.nextInt(7);

                String s=String.valueOf(number);                // string to number
                textView.setText(s);                            //set the value to the textView
            }
        });
    }
}