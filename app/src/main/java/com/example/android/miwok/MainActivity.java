/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.security.AccessController;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        TextView numbers = (TextView) findViewById(R.id.numbers);
        numbers.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numbersIntent =
                        new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });
        TextView color = (TextView) findViewById(R.id.colors);
        color.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent colorIntent =
                        new Intent(MainActivity.this, ColorActivity.class);
                startActivity(colorIntent);
            }
        });
        TextView family = (TextView) findViewById(R.id.family);
        family.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent familyIntent =
                        new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(familyIntent);
            }
        });
        TextView pharses = (TextView) findViewById(R.id.phrases);
        pharses.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phrasesIntent =
                        new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phrasesIntent);
            }
        });
    }
}

//
//    public void OpenNumbersList(View view) {
//        Intent numberIntent = new Intent(view.getContext(), NumbersActivity.class);
//        startActivityForResult(numberIntent, 0);
//    }
//
//    public void OpenFamilyList(View view) {
//        Intent familyIntent = new Intent(view.getContext(), FamilyActivity.class);
//        startActivityForResult(familyIntent, 0);
//    }
//
//    public void OpenColorList(View view) {
//        Intent colorIntent = new Intent(view.getContext(), ColorActivity.class);
//        startActivityForResult(colorIntent, 0);
//    }
//
//    public void OpenPharsesList(View view) {
//        Intent phrasesIntent = new Intent(view.getContext(), PhrasesActivity.class);
//        startActivityForResult(phrasesIntent, 0);
//    }
  

