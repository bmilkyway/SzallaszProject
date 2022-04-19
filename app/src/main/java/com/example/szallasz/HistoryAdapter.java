package com.example.szallasz;

import static java.lang.Integer.parseInt;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HistoryAdapter extends RecyclerView.Adapter<HistoryAdapter.HistoryHolder> {
    public List<Szallasok> szallasList;
    public List<Elozmenyek> elozmenyList;
    public List<Ertekelesek> ertekelesList;
    public HistoryAdapter(List<Elozmenyek> elozmenyList)
    {
        this.elozmenyList=elozmenyList;
    }

    @Override
    public HistoryHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.history_item_row,parent,false);
        return new HistoryHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull HistoryHolder holder, int position) {
        Elozmenyek elozmeny = elozmenyList.get(position);
        String szallasnev="";
        for (int i=0; i <szallasList.size();i++)
        {
            if(elozmeny.getSzallasId()==szallasList.get(i).getId())
            {
                szallasnev=szallasList.get(i).getNev() + " " + szallasList.get(i).getCsillag() + "⭐";
                break;
            }
        }
        if(elozmeny.getErtekelesId()=="-"){
            holder.LeirasTextView.setText("Nincs leírás, mivel nem készült értékelés");
            holder.ErtekelesTextView.setText("Nem adott meg értékelést");
            holder.DatumTextView.setText(elozmeny.getFoglalasIdeje());
            holder.NevTextView.setText(szallasnev);

        }
        else{
            String Leiras="";
            int Ertekeles=0;

            for (int i =0;i<ertekelesList.size();i++){
                if(parseInt(elozmeny.getErtekelesId())==ertekelesList.get(i).getId()){
                    Leiras=ertekelesList.get(i).getSzoveg();
                    Ertekeles=ertekelesList.get(i).getErtekeles();
                    break;
                }
            }
            holder.LeirasTextView.setText(Leiras);
            holder.ErtekelesTextView.setText(Ertekeles);
            holder.DatumTextView.setText(elozmeny.getFoglalasIdeje());
            holder.NevTextView.setText(szallasnev);
        }

    }


    @Override
    public int getItemCount(){
        return elozmenyList.size();
    }

    public class HistoryHolder extends RecyclerView.ViewHolder{
        public TextView NevTextView;
        public TextView ErtekelesTextView;
        public TextView DatumTextView;
        public TextView LeirasTextView;
        public Button btnUjrarendel;
        public HistoryHolder(View itemVew)
        {
            super(itemVew);
            NevTextView=itemVew.findViewById(R.id.NevTextView);
            ErtekelesTextView=itemVew.findViewById(R.id.ErtekelesTextView);
            DatumTextView=itemVew.findViewById(R.id.DatumTextView);
            LeirasTextView=itemVew.findViewById(R.id.LeirasTextView);
            btnUjrarendel=itemVew.findViewById(R.id.btnUjraFoglal);
        }

    }
}
