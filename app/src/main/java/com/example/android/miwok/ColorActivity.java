package com.example.android.miwok;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);
        final ArrayList<Words> words = new ArrayList<Words>();
        words.add(new Words("red", "weṭeṭṭi", R.drawable.color_red,
                R.raw.color_red));
        words.add(new Words("green", "chokokki", R.drawable.color_green,
                R.raw.color_green));
        words.add(new Words("brown", "ṭakaakki", R.drawable.color_brown,
                R.raw.color_brown));
        words.add(new Words("gray", "ṭopoppi", R.drawable.color_gray,
                R.raw.color_gray));
        words.add(new Words("black", "kululli", R.drawable.color_black,
                R.raw.color_black));
        words.add(new Words("white", "kelelli", R.drawable.color_white,
                R.raw.color_white));
        words.add(new Words("dusty yellow", "ṭopiisә",
                R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));
        words.add(new Words("mustard yellow", "chiwiiṭә",
                R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));

        WordAdapter adapter =
                new WordAdapter(this, 0, words);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setBackgroundColor(Color.parseColor("#8800A0"));
        listView.setAdapter(adapter);listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Words word =words.get(position);
                MediaPlayer mMedia = MediaPlayer.create(ColorActivity.this,word.getmAudio());
                mMedia.start();
            }
        });
    }
}
