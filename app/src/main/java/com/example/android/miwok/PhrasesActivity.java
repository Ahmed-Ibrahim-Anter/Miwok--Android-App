package com.example.android.miwok;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);
        final ArrayList<Words> words = new ArrayList<Words>();
        words.add(new Words("Where are you going?", "minto wuksus",
                R.raw.phrase_where_are_you_going));
        words.add(new Words("What is your name?", "tinnә oyaase'nә",
                R.raw.phrase_what_is_your_name));
        words.add(new Words("My name is..", "oyaaset..",
                R.raw.phrase_my_name_is));
        words.add(new Words("How are you feeling?", "michәksәs?",
                R.raw.phrase_how_are_you_feeling));
        words.add(new Words("I’m feeling good.", "kuchi achit",
                R.raw.phrase_im_feeling_good));
        words.add(new Words("Are you coming?", "әәnәs'aa?",
                R.raw.phrase_are_you_coming));
        words.add(new Words("Yes, I’m coming.", "hәә’ әәnәm",
                R.raw.phrase_yes_im_coming));
        words.add(new Words("I’m coming.", "әәnәm",
                R.raw.phrase_im_coming));
        words.add(new Words("Let’s go.", "yoowutis",
                R.raw.phrase_lets_go));
        words.add(new Words("Come here.", "әnni'nem",
                R.raw.phrase_come_here));
        WordAdapter adapter =
                new WordAdapter(this, 0, words);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setBackgroundColor(Color.parseColor("#16AFCA"));
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Words word =words.get(position);
                MediaPlayer mMedia = MediaPlayer.create(PhrasesActivity .this,word.getmAudio());
                mMedia.start();
            }
        });
    }
}
