package com.example.android.learnjapanese;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("One", "ichi", R.mipmap.number_one));
        words.add(new Word("Two", "ni",R.mipmap.number_two));
        words.add(new Word("Three", "san",R.mipmap.number_three));
        words.add(new Word("Four", "shi",R.mipmap.number_four));
        words.add(new Word("Five", "go",R.mipmap.number_five));
        words.add(new Word("Six", "roku",R.mipmap.number_six));
        words.add(new Word("Seven", "nana",R.mipmap.number_seven));
        words.add(new Word("Eight", "hachi",R.mipmap.number_eight));
        words.add(new Word("Nine", "ku",R.mipmap.number_nine));
        words.add(new Word("Ten", "juu",R.mipmap.number_ten));


//      List view is used to reduce memory usage
        WordAdapter adapter = new WordAdapter(this,words);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}