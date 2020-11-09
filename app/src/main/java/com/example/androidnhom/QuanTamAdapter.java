package com.example.androidnhom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

public class QuanTamAdapter extends BaseAdapter {
    Context myContext;
    int myLayout;
    List<QuanTam> arrayQuantam;
    public QuanTamAdapter(Context context, int layout, List<QuanTam> quanTamList){
        myContext=context;
        myLayout=   layout;
        arrayQuantam= quanTamList;
    }


    @Override
    public int getCount() {

        return arrayQuantam.size();
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
        LayoutInflater inflater = (LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView= inflater.inflate(myLayout, null);

        //Ánh xạ và gán giá trị
        TextView txNoiDung = (TextView) convertView.findViewById(R.id.txNoiDung);
        txNoiDung.setText(arrayQuantam.get(position).Noidung);
        TextView txNoiDung1= (TextView) convertView.findViewById(R.id.txNoiDung1);
        txNoiDung1.setText(arrayQuantam.get(position).Noidung1);
        ImageView anh= (ImageView) convertView.findViewById(R.id.anh);
        anh.setImageResource(arrayQuantam.get(position).Anh);

        return convertView;
    }
}
