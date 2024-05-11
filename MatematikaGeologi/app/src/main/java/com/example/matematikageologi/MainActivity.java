package com.example.matematikageologi;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etLuas, etTebal, etKadar;
    TextView tvHasilVolume, tvHasilCadangan;

    Button btnHitung, btnDelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etLuas = findViewById(R.id.et1);
        etTebal = findViewById(R.id.et2);
        etKadar = findViewById(R.id.et3);
        tvHasilVolume = findViewById(R.id.hasilvolume);
        tvHasilCadangan = findViewById(R.id.hasilcadangan);

        btnHitung = findViewById(R.id.btn_hitung);
        btnDelete = findViewById(R.id.btn_delete);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungCadangan();
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetInput();
            }
        });
    }

    private void hitungCadangan() {
        // Ambil nilai dari EditText
        double luas = Double.parseDouble(etLuas.getText().toString());
        double tebal = Double.parseDouble(etTebal.getText().toString());
        double kadarNi = Double.parseDouble(etKadar.getText().toString());

        // Hitung volume endapan
        double volumeEndapan = luas * tebal;

        // Hitung cadangan mineral nikel
        double cadanganNikel = volumeEndapan * (kadarNi / 100);

        // Tampilkan hasil pada TextView
        tvHasilVolume.setText(String.format("%.2f m3", volumeEndapan));
        tvHasilCadangan.setText(String.format("%.2f m3", cadanganNikel));
    }

    private void resetInput() {
        // Reset nilai EditText dan TextView
        etLuas.setText("");
        etTebal.setText("");
        etKadar.setText("");
        tvHasilVolume.setText("-");
        tvHasilCadangan.setText("-");
    }
}
