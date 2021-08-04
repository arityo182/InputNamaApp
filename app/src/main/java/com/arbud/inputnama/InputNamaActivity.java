package com.arbud.inputnama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class InputNamaActivity extends AppCompatActivity {

    private TextView tv_Nama;
    private EditText et_InputNama;
    private Button bt_Tampil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inputnama);

        // Nama Toolbar
        getSupportActionBar().setTitle("Aplikasi Mobile");

        // Inisialisasi Widget
        tv_Nama = findViewById(R.id.tv_inputNama);
        et_InputNama = findViewById(R.id.et_inputnama);
        bt_Tampil = findViewById(R.id.bt_tampilkan);


        // Button Tampil Nama
        bt_Tampil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Nama = et_InputNama.getText().toString().trim();
                if (Nama.isEmpty()){
                    et_InputNama.setError("Tolong Masukan Nama Anda");
//                    Toast.makeText(this,"Tolong Masukan Nama",Toast.LENGTH_SHORT).show();
                } else {
                    tv_Nama.setText("Nama Anda : "+Nama);
                }
            }
        });

    }
}