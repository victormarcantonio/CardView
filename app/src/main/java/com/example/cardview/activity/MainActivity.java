package com.example.cardview.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.cardview.R;
import com.example.cardview.adapter.Adapter;
import com.example.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        //Define layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerPostagem.setLayoutManager(layoutManager);


        //Define adapter
        this.prepararPostagens();
        Adapter adapter = new Adapter(postagens);
        recyclerPostagem.setAdapter(adapter);


    }
    public void prepararPostagens(){

        Postagem p = new Postagem("Victor Marcantonio","Viagem Legal",R.drawable.imagem1);
        this.postagens.add(p);

        p = new Postagem("Julio Cesar","Programeiro",R.drawable.imagem2);
        this.postagens.add(p);

        p = new Postagem("Victor Jorge","Nike",R.drawable.imagem3);
        this.postagens.add(p);

        p = new Postagem("Maria Gimenez","Hotel",R.drawable.imagem4);
        this.postagens.add(p);


    }
}
