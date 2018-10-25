package rp.satria.guccishoeslist;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.strictmode.SqliteObjectLeakedViolation;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class TampilanActivity extends AppCompatActivity {

    private Button btn_logout;
    MyDataHelper dataHelper;
    public RecyclerView mRecycleView;
    public RecyclerView.LayoutManager mLayoutManager;
    public RecyclerView.Adapter mAdapter;
    List<Shoes> LShoes;

    public static TampilanActivity layarutama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan);

        Button btn = findViewById(R.id.btn_tambah);

        //Register event onClick ke tombol btn
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent = new Intent(TampilanActivity.this, InsertShoes.class);
                startActivity(myintent);
            }
        });

        layarutama = this;

//        shoesList();
        RefreshData();


        LShoes = new ArrayList<>();
//        lstKarakter.add(new Shoes(1, "L Shoes", "xxx", "30,31,32"));
//        lstKarakter.add(new Shoes(2, "R Shoes", "YYY", "35,36,37"));
//        lstKarakter.add(new Shoes(3, "LR Shoes", "ZZZ", "40"));

        LShoes.addAll(shoesList());
        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, shoesList());
        myrv.setLayoutManager(new GridLayoutManager(this, 3));
        myrv.setAdapter(myAdapter);
        myrv.addOnItemTouchListener(new RecyclerTouchListener(this, mRecycleView, new ClickListener() {
            @Override
            public void onClick(View view, int position) {

            }

            @Override
            public void onLongClick(View view, final int position) {
                final CharSequence[] dialogitem = {"Lihat Sepatu", "Update Sepatu", "Hapus Sepatu"};

                AlertDialog.Builder builder = new AlertDialog.Builder(TampilanActivity.this);

                builder.setTitle("Pilihan");
                builder.setItems(dialogitem, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int item) {
                        switch (item) {
                            case 0 :
                                Intent intent0 = new Intent(getApplicationContext(), ViewShoes.class);
                                intent0.putExtra("nama", LShoes.get(position).getNama());
                                startActivity(intent0);
                                break;

                            case 1 :
                                Intent intent1 = new Intent(getApplicationContext(), UpdateShoes.class);
                                intent1.putExtra("nama", LShoes.get(position).getNama());
                                startActivity(intent1);
                                break;

                            case 2 :
                                SQLiteDatabase db = dataHelper.getWritableDatabase();
                                db.execSQL("DELETE FROM shoes WHERE id = '" + LShoes.get(position).getID() +
                                        "'");
//                                shoesList();
                                RefreshData();
                                break;
                        }
                    }
                });
                builder.create().show();
            }

//            @Override
//            public void onLongClick(View view, int position) {
//
//            }
        }));

    }

    public void RefreshData(){
        this.LShoes = new ArrayList<>();
        LShoes.addAll(shoesList());
        mRecycleView = findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, LShoes);
        mRecycleView.setAdapter(myAdapter);
    }

    public List<Shoes> shoesList(){
        dataHelper = new MyDataHelper(this);
        SQLiteDatabase db = dataHelper.getReadableDatabase();
        List<Shoes> list = new ArrayList<>();
        Cursor cursor = db.rawQuery("SELECT * FROM shoes",null);

        if (cursor.getCount()>0){
            for (int i = 0; i < cursor.getCount(); i++) {
                cursor.moveToPosition(i);
                Shoes s = new Shoes(cursor.getInt(0),
                cursor.getString(1),
                cursor.getString(2),
                cursor.getString(3)
                );
                list.add(s);
            }
        }

        return list;
    }

    public void button_onClick(View view)
    {
        SharedPreferences handler = getSharedPreferences("LoginActivity", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = handler.edit();

        editor.clear();
        editor.apply();

        Intent i = new Intent(this.getApplicationContext(), LoginActivity.class);
        startActivity(i);
    }
}
