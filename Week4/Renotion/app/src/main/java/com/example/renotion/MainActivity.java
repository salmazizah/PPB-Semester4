package com.example.renotion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private final LinkedList<String> mNoteList = new LinkedList<>();
    private RecyclerView mRecyclerViewNote;
    private NoteListAdapter mAdapter;
    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0; i < 10; i++) {
            mNoteList.addLast("Notes " + i);
        }

        fab = findViewById(R.id.fab);
        mRecyclerViewNote = findViewById(R.id.recyclerViewNote);
        mAdapter = new NoteListAdapter(this, mNoteList);
        mRecyclerViewNote.setAdapter(mAdapter);
        mRecyclerViewNote.setLayoutManager(new LinearLayoutManager(this));

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int noteListSize = mNoteList.size();
                mNoteList.addLast("+ Word " + noteListSize);
                mRecyclerViewNote.getAdapter().notifyItemInserted(noteListSize);
                mRecyclerViewNote.smoothScrollToPosition(noteListSize);
            }
        });
    }

    public void launchTaskActivity(View view) {
        Intent intent = new Intent(this, TaskActivity.class);
        startActivity(intent);
    }

}