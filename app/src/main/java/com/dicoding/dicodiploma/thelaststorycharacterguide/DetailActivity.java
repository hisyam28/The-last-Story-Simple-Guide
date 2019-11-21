package com.dicoding.dicodiploma.thelaststorycharacterguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.dicoding.dicodiploma.thelaststorycharacterguide.model.Char;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_NAMA = "nama";
    public static final String EXTRA_GENDER = "gender";
    public static final String EXTRA_SKILL = "skill";
    public static final String EXTRA_SENJATA = "senjata";
    public static final String EXTRA_DESKRIPSI = "deskripsi";
    public static final String EXTRA_SPESIES = "spesies";
    public static final String EXTRA_FOTO = "foto";

    ImageView iFoto;
    TextView tvNama, tvGender, tvSkill, tvSenjata, tvDeskripsi, tvSpesies;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvNama = findViewById(R.id.thum_name);
        tvGender = findViewById(R.id.thum_gender);
        tvSkill = findViewById(R.id.thum_skill);
        tvSenjata = findViewById(R.id.thum_weapon);
        tvDeskripsi = findViewById(R.id.thum_description);
        tvSpesies = findViewById(R.id.thum_species);
        iFoto = findViewById(R.id.thum_image);

        String name = getIntent().getStringExtra(EXTRA_NAMA);
        String gender = getIntent().getStringExtra(EXTRA_GENDER);
        String skill = getIntent().getStringExtra(EXTRA_SKILL);
        String senjata = getIntent().getStringExtra(EXTRA_SENJATA);
        String deskripsi = getIntent().getStringExtra(EXTRA_DESKRIPSI);
        String spesies = getIntent().getStringExtra(EXTRA_SPESIES);
        String image = getIntent().getStringExtra(EXTRA_FOTO);

        Glide.with(DetailActivity.this)
                .load(image)
                .override(210, 320)
                .into(iFoto);


        tvNama.setText(name);
        tvSpesies.setText(spesies);
        tvGender.setText(gender);
        tvSkill.setText(skill);
        tvSenjata.setText(senjata);
        tvDeskripsi.setText(deskripsi);


    }
}
