package rp.satria.guccishoeslist;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class InsertShoes extends AppCompatActivity {

    protected Cursor cursor;
    MyDataHelper dbHelper;
    Button btn1,btn2;
    TextView text2, text3, text4, text5, text6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_shoes);

        dbHelper = new MyDataHelper(this);
        text2 = findViewById(R.id.editText2);
        text3 = findViewById(R.id.editText3);
        text4 = findViewById(R.id.editText4);
//        text5 = findViewById(R.id.editText5);
//        text6 = findViewById(R.id.editText6);

        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                db.execSQL("INSERT INTO shoes(nama, tipe, ukuran) values('" +
                        text2.getText().toString() + "','" +
                        text3.getText().toString() + "','" +
//                        text4.getText().toString() + "','" +
//                        text5.getText().toString() + "','" +
                        text4.getText().toString() + "')");

                Toast.makeText(getApplicationContext(), "berhasil ditambahkan",
                        Toast.LENGTH_LONG).show();
                TampilanActivity.layarutama.RefreshData();
                finish();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                finish();
            }
        });
    }
}
