package com.example.bt_th_ltdd;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Congan> arraylist;

    public Adapter(Context context, int layout, List<Congan> arraylist) {
        this.context = context;
        this.layout = layout;
        this.arraylist = arraylist;
    }

    @Override
    public int getCount() {
        return arraylist.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

        convertView = inflater.inflate(layout, null);

        Congan a = arraylist.get(position);

        TextView ten = convertView.findViewById(R.id.name);
        TextView capBac = convertView.findViewById(R.id.capbac);
        TextView noiCongTac = convertView.findViewById(R.id.noicongtac);
        TextView soSao = convertView.findViewById(R.id.sosao);
        ImageView hinhAnh = convertView.findViewById(R.id.imageHinh);

        ten.setText(a.getTen());
        capBac.setText(a.getCapBac());
        noiCongTac.setText(a.getNoiCongTac());
        soSao.setText(a.getSoSao());
        hinhAnh.setImageResource(a.getHinhAnh());

        return convertView;
    }
}
