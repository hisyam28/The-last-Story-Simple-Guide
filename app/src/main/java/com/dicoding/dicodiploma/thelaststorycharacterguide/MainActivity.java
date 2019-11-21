package com.dicoding.dicodiploma.thelaststorycharacterguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Toast;

import com.dicoding.dicodiploma.thelaststorycharacterguide.adapter.ListCharAdapter;
import com.dicoding.dicodiploma.thelaststorycharacterguide.model.Char;
import com.dicoding.dicodiploma.thelaststorycharacterguide.model.CharData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCharacter;
    private ArrayList<Char> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rvCharacter = findViewById(R.id.rv_char);
        rvCharacter.setHasFixedSize(true);

        list.addAll(CharData.getListData());
        showRecyclerList();


    }


    private void showRecyclerList() {
        rvCharacter.setLayoutManager(new LinearLayoutManager(this));
        ListCharAdapter listCharAdapter = new ListCharAdapter(list);
        rvCharacter.setAdapter(listCharAdapter);

        listCharAdapter.setOnItemClickCallback(new ListCharAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Char data) {
                showSelectedChar(data);

            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.action_about) {
            Intent intent = new Intent(MainActivity.this, AboutActivity.class);
            startActivity(intent);
        }


        return super.onOptionsItemSelected(item);
    }

    private void showSelectedChar(Char character) {
        Toast.makeText(this, "Kamu memilih " + character.getName(), Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        intent.putExtra(DetailActivity.EXTRA_NAMA, character.getName());
        intent.putExtra(DetailActivity.EXTRA_GENDER, character.getGender());
        intent.putExtra(DetailActivity.EXTRA_SKILL, character.getSkill());
        intent.putExtra(DetailActivity.EXTRA_SENJATA, character.getWeapon());
        intent.putExtra(DetailActivity.EXTRA_DESKRIPSI, character.getDescription());
        intent.putExtra(DetailActivity.EXTRA_SPESIES, character.getSpecies());
        intent.putExtra(DetailActivity.EXTRA_FOTO, character.getPhoto());
        startActivity(intent);


    }

}
