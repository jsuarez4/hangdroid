package com.example.jer.hangdroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Multiplayer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplayer);
    }

    public void startMultiGame(View v){

        EditText InputWord = (EditText) findViewById(R.id.editTextWord);

        String wordToGuess = InputWord.getText().toString().toUpperCase();
        InputWord.setText("");
        Intent myIntent = new Intent(this,GameMultiActivity.class);

        myIntent.putExtra("WORD_IDENTIFIER", wordToGuess);

        startActivity(myIntent);
    }
}
