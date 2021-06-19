package com.example.android.learnjapanese;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Grey", "Gurē",R.mipmap.color_gray));
        words.add(new Word("Green", "Midori",R.mipmap.color_green));
        words.add(new Word("Yellow", "Ki",R.mipmap.color_mustard_yellow));
        words.add(new Word("Red", "Aka",R.mipmap.color_red));
        words.add(new Word("White", "Shiroi",R.mipmap.color_white));
        words.add(new Word("Black", "Kuro",R.mipmap.color_black));
        words.add(new Word("Brown", "Kasshoku",R.mipmap.color_brown));


        WordAdapter adapter = new WordAdapter(this,words);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}