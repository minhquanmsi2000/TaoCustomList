package com.example.androidnhom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lvQuanTam;
    ArrayList<QuanTam> mangQuanTam;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvQuanTam=(ListView) findViewById(R.id.listQuantam);
        mangQuanTam= new ArrayList<QuanTam>();

        mangQuanTam.add(new QuanTam("Bão số 12 gây mưa lớn ở miền trung, bão số 13 đã 'lấp ló' vào biển Đông","Tiền Phong",R.drawable.image1));
        mangQuanTam.add(new QuanTam("Lời kể cư dân vụ thi thể không đầu ở chung cư Quận 7","Người lao động",R.drawable.image2));
        mangQuanTam.add(new QuanTam("Điểm nóng vòng 8 ngoại hạng Anh: MU hồi sinh, Liverpool gặp lớp 'Cực dị'","Tin tức24h",R.drawable.image3));
        mangQuanTam.add(new QuanTam("Tranh cãi về gói 300.000 tỷ vay không thế chấp","Tin tức 24h",R.drawable.image4));
        mangQuanTam.add(new QuanTam("Viettel hạ bệ Hà Nội FC, lần đầu vô địch V-League","VTC News",R.drawable.image5));

        QuanTamAdapter adapter= new QuanTamAdapter(
                MainActivity.this,
                R.layout.dongquantam,
                mangQuanTam
        );
        lvQuanTam.setAdapter(adapter);

    }
}