package com.example.android.learnjapanese;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("What is your name?", "O-namae wa nan desu ka?"));
        words.add(new Word("My name is", "Namae wa"));
        words.add(new Word("Good Morning", "Ohayou"));
        words.add(new Word("How are you?", "Ogenkidesuka"));
        words.add(new Word("Good evening", "Konbanwa"));
        words.add(new Word("Thanks", "Arigatō"));
        words.add(new Word("Sorry", "Gomen'nasai"));
        words.add(new Word("Please", "kudasai"));
        words.add(new Word("I am fine", "Watashi wa genkidesu"));
        words.add(new Word("I am hungry", "Onaka ga akimashita"));
        words.add(new Word("Goodbye", "Sayōnara"));



//      List view is used to reduce memory usage
        WordAdapter adapter = new WordAdapter(this,words);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}