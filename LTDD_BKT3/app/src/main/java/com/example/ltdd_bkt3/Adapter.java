package com.example.ltdd_bkt3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class Adapter extends BaseAdapter {

    private Context context;
    private int layout;
    List<ModelEng> mList;

    public Adapter(Context context, int layout, List<ModelEng> mList) {
        this.context = context;
        this.layout = layout;
        this.mList = mList;
    }

    @Override
    public int getCount() {
        if(mList != null){
            return mList.size();
        }
        return 0;
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
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout, null);

        ModelEng modelEng = mList.get(i);

        TextView textView = view.findViewById(R.id.thiEng);

        textView.setText(modelEng.getName());

        return view;
    }
}
