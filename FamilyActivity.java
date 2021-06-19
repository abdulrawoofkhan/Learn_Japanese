package com.example.android.learnjapanese;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Father", "Otōsan",R.mipmap.family_father));
        words.add(new Word("Mother", "Haha",R.mipmap.family_mother));
        words.add(new Word("Son", "Musuko",R.mipmap.family_son));
        words.add(new Word("Daughter", "Musume",R.mipmap.family_daughter));
        words.add(new Word("Elder Sister", "Ane",R.mipmap.family_older_sister));
        words.add(new Word("Younger sister", "Imōto",R.mipmap.family_younger_sister));
        words.add(new Word("Elder brother", "Ojisan",R.mipmap.family_older_brother));
        words.add(new Word("Younger brother", "Oba",R.mipmap.family_younger_brother));
        words.add(new Word("Grandfather", "Sofu",R.mipmap.family_grandfather));
        words.add(new Word("Grandmother", "Sobo",R.mipmap.family_grandmother));

        WordAdapter adapter = new WordAdapter(this,words);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);


    }
}