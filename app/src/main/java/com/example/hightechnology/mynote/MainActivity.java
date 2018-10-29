package com.example.hightechnology.mynote;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupViews();

    }

    private void setupViews() {
        RecyclerView itemNoteRv=findViewById(R.id.rv_main_itemNote);
        itemNoteRv.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        itemNoteRv.setAdapter(new NoteAdapter());
    }
}
