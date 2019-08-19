package com.example.cardview.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cardview.R;
import com.example.cardview.model.Postagem;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<Postagem> postagens;

    public Adapter(List<Postagem> postagens) {
        this.postagens = postagens;
    }

    @Override
    public MyViewHolder onCreateViewHolder( ViewGroup viewGroup, int i) {
        View itemLista = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.adapter_postagem,viewGroup,false);
        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder( MyViewHolder holder, int i) {

        Postagem postagem = postagens.get(i);
        holder.textNome.setText(postagem.getNome());
        holder.textPostagem.setText(postagem.getPostagem());
        holder.imageImagem.setImageResource(postagem.getImagem());

    }

    @Override
    public int getItemCount() {
        return postagens.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

       private TextView textNome;
        private TextView textPostagem;
       private ImageView imageImagem;


        public MyViewHolder(View itemView) {
            super(itemView);

            textNome = itemView.findViewById(R.id.textNome);
            textPostagem= itemView.findViewById(R.id.textPostagem);
            imageImagem = itemView.findViewById(R.id.imagePostagem);
        }
    }
}
