package com.example.android.learnjapanese;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Grey", "Gurē",R.mipmap.color_gray,R.raw.color_gray));
        words.add(new Word("Green", "Midori",R.mipmap.color_green,R.raw.color_green));
        words.add(new Word("Yellow", "Ki",R.mipmap.color_mustard_yellow,R.raw.color_mustard_yellow));
        words.add(new Word("Red", "Aka",R.mipmap.color_red,R.raw.color_red));
        words.add(new Word("White", "Shiroi",R.mipmap.color_white,R.raw.color_white));
        words.add(new Word("Black", "Kuro",R.mipmap.color_black,R.raw.color_black));
        words.add(new Word("Brown", "Kasshoku",R.mipmap.color_brown,R.raw.color_brown));


        WordAdapter adapter = new WordAdapter(this,words);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Word word = words.get(position);

                mMediaPlayer = MediaPlayer.create(ColorsActivity.this, word.getAudioResourceId());

                mMediaPlayer.start();
            }
        });

    }
}