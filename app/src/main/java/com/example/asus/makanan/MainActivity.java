package com.example.asus.makanan;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Resep> dataResep;
    private RecyclerView listResep;
    private ResepAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateData();
        listResep   = (RecyclerView) findViewById(R.id.list_resep);

        adapter     = new ResepAdapter(this, dataResep);
        listResep.setAdapter(adapter);
        listResep.setLayoutManager(new LinearLayoutManager(this));
    }

    private void generateData() {
        dataResep = new ArrayList<>();

        dataResep.add(new Resep("Rendang Paru", "Paru dengan bumbu rendang yang nikmat",
                "<b>Bahan Dasar :</b><br>" +
                        "1 sachet Bumbu Spesial Indofood Rendang<br>" +
                        "1/2 kg paru sapi rebus matang iris goreng<br>" +
                        "3 lembar daun jeruk 5 cm jahe 1 batang serai<br>" +
                        "2 sdm minyak goreng<br>" +
                        "400 ml santan kental dari 1 butir kelapa<br>" +
                        "<br>" +

                        "<b>Langkah Pembuatan :</b><br>" +
                        "1.Panaskan minyak goreng tumis BUMBU SPESIAL INDOFOOD RENDANG bersama daun jeruk jahe dan serai aduk rata masukkan santan dan paru aduk rata.<br>" +
                        "2.Masak hingga bumbu merata angkat.<br>" +
                        "3.Sajikan.<br>", "rendangparu"));

        dataResep.add(new Resep("Tongseng Kambing","Tongseng Kambing Bumbu Spesial",
                        "<b>Bahan-bahan : </b><br>\n" +
                        "1 Bungkus Bumbu Spesial Indofood Kare<br>\n" +
                        "1 kg daging kambing potong dadu<br>\n" +
                        "2 sdm minyak goreng<br>\n" +
                        "6 lembar daun jeruk<br>\n" +
                        "2 batang serai memarkan<br>\n" +
                        "2 cm jahe memarkan<br>\n" +
                        "5 butir cengkih<br>\n" +
                        "4 cm kayu manis<br>\n" +
                        "1 biji pala memarkan<br>\n" +
                        "250 ml air 500 ml santan dari 1 butir kelapa<br>\n" +
                        "4 lembar kol iris 2 tomat merah iris<br>\n" +
                        "2 batang daun bawang iris<br>\n" +
                        "26 sdm Kecap Manis Indofood<br>\n" +
                        "5 cabe rawit merah iris<br>\n" +
                                "<br>"+

                        "<b>Langkah Pembuatan :</b><br>" +
                        "1.Panaskan minyak goreng, lalu tumis BUMBU SPESIAL INDOFOOD KARE hingga harum. Kemudian masukkan daging kambing, daun jeruk, serai cengkih, dan kayu manis. Masak hingga daging berubah warna, tambahkan air. Masak hingga daging lunak.<br>" +
                        "2.Masukkan santan, masak hingga kuah mengental berminyak. Masukkan kol, iris tomat, dan KECAP MANIS INDOFOOD, tambahkan irisan daun bawang, aduk rata, lalu angkat.<br>" +
                        "3.Siapkan mangkuk, tuang tongseng kedalam mangkuk, lalu taburi dengan bawang goreng dan emping. Sajikan selagi hangat.<br>"

                ,"tongsengkambing"));



    }


}
