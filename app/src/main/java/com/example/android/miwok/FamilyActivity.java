package com.example.android.miwok;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);
        final ArrayList<Words> words = new ArrayList<Words>();
        words.add(new Words("father", "әpә", R.drawable.family_father,
                R.raw.family_father));
        words.add(new Words("mother", "әṭa", R.drawable.family_mother,
                R.raw.family_mother));
        words.add(new Words("son", "angsi", R.drawable.family_son,
                R.raw.family_son));
        words.add(new Words("daughter", "tune", R.drawable.family_daughter,
                R.raw.family_daughter));
        words.add(new Words("older brother", "taachi",
                R.drawable.family_older_brother, R.raw.family_older_brother));
        words.add(new Words("older sister", "teṭe",
                R.drawable.family_older_sister, R.raw.family_older_sister));
        words.add(new Words("younger sister", "kolliti",
                R.drawable.family_younger_sister, R.raw.family_younger_sister));
        words.add(new Words("grandmother", "ama",
                R.drawable.family_grandmother, R.raw.family_grandmother));
        words.add(new Words("grandfather", "paapa",
                R.drawable.family_grandfather, R.raw.family_grandfather));
        words.add(new Words("younger brother", "chalitti",
                R.drawable.family_younger_brother, R.raw.family_younger_brother));
        WordAdapter adapter =
                new WordAdapter(this, 0, words);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setBackgroundColor(Color.parseColor("#379237"));
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Words word =words.get(position);
                MediaPlayer mMedia = MediaPlayer.create(FamilyActivity.this,word.getmAudio());
                mMedia.start();
            }
        });

    }
}
