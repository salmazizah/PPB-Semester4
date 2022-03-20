package com.example.renotion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NoteDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_details);

        TextView detail = findViewById(R.id.text_message);

        Intent intent = getIntent();
        String message = intent.getStringExtra(NoteListAdapter.EXTRA_MESSAGE);
        detail.setText(message);
    }
}