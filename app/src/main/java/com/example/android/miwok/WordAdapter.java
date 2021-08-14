package com.example.android.miwok;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class WordAdapter extends ArrayAdapter<Words> {




    public WordAdapter(@NonNull Context context, int resource, ArrayList<Words> words) {
        super(context, 0,words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null){
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
       Words Currentword = getItem(position);

        ImageView miwkoImageView= (ImageView) listItemView.findViewById(R.id.imageView);
        if(Currentword.hasImage()){
            miwkoImageView.setImageResource(Currentword.getmImage());
            miwkoImageView.setVisibility(View.VISIBLE);
        }else {
            miwkoImageView.setVisibility(View.GONE);
        }
//        miwkoImageView.setImageResource(Currentword.getmImage());
        TextView miwkoTextView =(TextView) listItemView.findViewById(R.id.miwko_text_view);
        miwkoTextView.setText(Currentword.getMiwkoword());
        TextView defaultTextView =(TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(Currentword.getDefaultword());


        return listItemView;
    }
}
