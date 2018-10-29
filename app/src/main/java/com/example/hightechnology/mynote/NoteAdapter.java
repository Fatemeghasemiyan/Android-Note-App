package com.example.hightechnology.mynote;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class NoteAdapter extends RecyclerView.Adapter<NoteAdapter.NoteViewHolder> {
    private List<Note> notes=new ArrayList<>();
    public NoteAdapter(){
         Note note=new Note();
         note.setTitle("My first Note");
         note.setDescription("I'm making an awesome Note App.I'm making an awesome Note App.I'm making an awesome Note App.I'm making an awesome Note App.I'm making an awesome Note App.");
         note.setDate(System.currentTimeMillis());
         notes.add(note);

    }


    @NonNull
    @Override
    public NoteViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new NoteViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_note,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull NoteViewHolder noteViewHolder, int i) {
        noteViewHolder.bindNote(notes.get(i));
    }

    @Override
    public int getItemCount() {
        return notes.size();
    }

    public class NoteViewHolder extends RecyclerView.ViewHolder{
        private View editBtn;
        private View deleteBtn;
        private TextView titleTv;
        private TextView descriptionTv;
        private TextView dateTv;

        public NoteViewHolder(View itemView) {
            super(itemView);
            editBtn=itemView.findViewById(R.id.iv_itemNote_edit);
            deleteBtn=itemView.findViewById(R.id.iv_itemNote_delete);
            titleTv=itemView.findViewById(R.id.tv_itemNote_title);
            descriptionTv=itemView.findViewById(R.id.tv_itemNote_description);
            dateTv=itemView.findViewById(R.id.tv_itemNote_date);

        }

        public void bindNote(Note note) {
            titleTv.setText(note.getTitle());
            descriptionTv.setText(note.getDescription());
            dateTv.setText(note.getDate());
        }
    }
}
