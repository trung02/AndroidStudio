package com.example.firebase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterSinhvien extends BaseAdapter {

    private Context context;
    private int layout;
    private List<SinhVien> arraylist;

    public AdapterSinhvien(Context context, int layout, List<SinhVien> arraylist) {
        this.context = context;
        this.layout = layout;
        this.arraylist = arraylist;
    }

    @Override
    public int getCount() {
        return arraylist.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

        convertView = inflater.inflate(layout, null);

        SinhVien sv = arraylist.get(position);

        TextView textV1 = convertView.findViewById(R.id.name);
        TextView textV2 = convertView.findViewById(R.id.mota);
        TextView textV3 = convertView.findViewById(R.id.dactinh);
        TextView textV4 = convertView.findViewById(R.id.maula);
        ImageView imageV = convertView.findViewById(R.id.imageHinh);

        textV1.setText("Tên khoa học: "+sv.getName());
        textV2.setText("Tên thường gọi: "+sv.getMsv());
        textV3.setText("Đặc tính: "+sv.getDescription());
        textV4.setText("Màu lá: "+sv.getMaula());

        imageV.setImageResource(sv.getImage());


        return convertView;
    }
}


