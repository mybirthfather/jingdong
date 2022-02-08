package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TestAdapter extends RecyclerView.Adapter<TestAdapter.MyHolder> {

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);

        return new MyHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        if (position == 0) {
            holder.tv.setText("1111111");
        }else {
            holder.tv.setText("2222222");

        }
    }


    static class MyHolder extends RecyclerView.ViewHolder {

        TextView tv;

        public MyHolder(@NonNull View itemView) {
            super(itemView);
            tv = itemView.findViewById(R.id.tv);


        }
    }

    @Override
    public int getItemCount() {
        return 50;
    }
}
