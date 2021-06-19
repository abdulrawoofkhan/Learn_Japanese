package com.example.android.learnjapanese;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.learnjapanese.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//    Intent to open Numbers Activity
    public void openNumbersList(View view) {
        Intent nums = new Intent(this,NumbersActivity.class) ;
        startActivity(nums);
    }
//    Intent to open Family Activity
    public void openFamilyList(View view) {
        Intent fam = new Intent(this,FamilyActivity.class) ;
        startActivity(fam);
    }

    //    Intent to open Colors Activity
    public void openColorsList(View view) {
        Intent col = new Intent(this,ColorsActivity.class) ;
        startActivity(col);
    }

    //    Intent to open Phrases Activity
    public void openPhrasesList(View view) {
        Intent phr = new Intent(this,PhrasesActivity.class) ;
        startActivity(phr);
    }
}