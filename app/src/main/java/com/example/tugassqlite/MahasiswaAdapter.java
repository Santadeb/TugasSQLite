package com.example.tugassqlite;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class MahasiswaAdapter extends BaseAdapter {

    private Context context;
    private List<Mahasiswa> mahasiswaList;

    public MahasiswaAdapter(Context context, List<Mahasiswa> mahasiswaList) {
        this.context = context;
        this.mahasiswaList = mahasiswaList;
    }

    @Override
    public int getCount() {
        return mahasiswaList.size();
    }

    @Override
    public Object getItem(int position) {
        return mahasiswaList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return mahasiswaList.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.item, parent, false);
        }

        TextView tvNama = convertView.findViewById(R.id.tvNama);
        TextView tvNim = convertView.findViewById(R.id.tvNim);
        TextView tvProdi = convertView.findViewById(R.id.tvProdi);

        Mahasiswa mahasiswa = mahasiswaList.get(position);

        tvNama.setText(mahasiswa.getNama());
        tvNim.setText(mahasiswa.getNim());
        tvProdi.setText(mahasiswa.getProdi());

        return convertView;
    }
}
