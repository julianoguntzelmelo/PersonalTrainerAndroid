package com.example.jfitpersonal;

public interface OnAdapterItemClickListener {
    void onClick(int id, String type);
    void onLongClick(int position, String type, int id);
}
