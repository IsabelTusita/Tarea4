package com.example.isabel.tarea4;

import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends BaseAdapter {

    private ArrayList<oto> items;
    public Adapter (ArrayList<oto> items){
        this.items = items;

    }
    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public oto getItem(int i) {
        return items.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null){
            view = LayoutInflater
                    .from(viewGroup.getContext())
                    .inflate(R.layout.listview_item, viewGroup, false);
        }
        decorateWith(view, items.get(i));
        return view;
    }

    private void decorateWith(View view, oto oto) {
        ImageView imageView = view.findViewById(R.id.imageView);
        TextView textView = view.findViewById(R.id.textView);
        imageView.setImageResource(oto.getImageResurce());
        textView.setText(oto.getTitle());

        imageView.setColorFilter(ContextCompat.getColor(view.getContext(),oto.getColor()));
    }
}
