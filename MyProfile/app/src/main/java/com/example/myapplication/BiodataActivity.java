package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BiodataActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
    }

    public void lokasi(View view) {
        Intent tempat = new Intent(Intent.ACTION_VIEW, Uri.parse("https://maps.app.goo.gl/gwGV1aCzAn2qJm1Y6"));
        startActivity(tempat);
    }

    public void telepon(View view) {
        String phoneNumber = "085825187289";
        Intent hp = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phoneNumber));
        startActivity(hp);
    }

    public void fotofoto(View view) {
        Intent galerifoto = new Intent(BiodataActivity.this, GaleryActivity.class);
        startActivity(galerifoto);
    }
}