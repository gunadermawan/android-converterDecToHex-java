package com.gunder.decimaltohex_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
//    inisialisasi atribut
    EditText input, output;
    Button submit, reset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input =findViewById(R.id.input);
        output =findViewById(R.id.output);
        submit =findViewById(R.id.submit);
//        aksi ketika tombol ditekan
        submit.setOnClickListener(v->{
            String string = input.getText().toString();
            int i = Integer.parseInt(string);
            String binary = Integer.toHexString(i);
            output.setText(binary);
        });
        reset = findViewById(R.id.reset);
        reset.setOnClickListener(v -> {
            input.setText("");
            output.setText("");
        });
    }
}