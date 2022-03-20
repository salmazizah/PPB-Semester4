package com.example.renotion;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class NoteListAdapter extends RecyclerView.Adapter<NoteListAdapter.NoteViewHolder> {
    private final LinkedList<String> mNoteList;
    private LayoutInflater mInflater;
    public static final String EXTRA_MESSAGE = "com.example.renotion.extra.MESSAGE";

    public NoteListAdapter(Context context, LinkedList<String> noteList) {
        mInflater = LayoutInflater.from(context);
        this.mNoteList = noteList;
    }

    @Override
    public NoteListAdapter.NoteViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.notelist_item,
                parent, false);
        return new NoteViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(NoteListAdapter.NoteViewHolder holder, int position) {
        String mCurrent = mNoteList.get(position);
        holder.noteItemView.setText(mCurrent);
    }

    @Override
    public int getItemCount() {
        return mNoteList.size();
    }

    class NoteViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public final TextView noteItemView;
        final NoteListAdapter mAdapter;

        public NoteViewHolder(View itemView, NoteListAdapter adapter) {
            super(itemView);
            noteItemView = itemView.findViewById(R.id.note);
            this.mAdapter = adapter;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
//            int mPosition = getLayoutPosition();
//            String element = mNoteList.get(mPosition);
//            mNoteList.set(mPosition, "Clicked! " + element);
//            mAdapter.notifyDataSetChanged();
            Intent intent = new Intent(view.getContext(), NoteDetails.class);
            String message = "Note message";
            intent.putExtra(EXTRA_MESSAGE, message);
            view.getContext().startActivity(intent);
        }
    }
}
