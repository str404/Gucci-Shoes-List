package rp.satria.guccishoeslist;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyDataHelper extends SQLiteOpenHelper {

    //nama database
    private static final String Nama_DB = "gucci.db";

    //nama tabel
    private static final String NAMA_TABEL = "shoes";

    //versi database
    private static final int VERSI_DB = 2;

    //nama kolom dalam tabel
    private static final String ID = "id";
    private static final String NAMA = "nama";
    private static final String TIPE = "tipe";
    private static final String UKURAN = "ukuran";
//    private static final String AKTOR = "aktor";
//    private static final String SINOPSIS = "sinopsis";

    //sql untuk create table
    private static final String CREATE_TABLE =
            "CREATE TABLE "
                    +NAMA_TABEL
                    +"("
                    +ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                    +NAMA + " VARCHAR(255), "
                    +TIPE + " VARCHAR(255), "
                    +UKURAN + " VARCHAR(255) "
                    + ");";

//    //sql untuk create table yang kedua
//    private static final String CREATE_TABLE_TAMBAHAN =
//            "CREATE TABLE "
//                    +NAMA_TABEL
//                    +" ("
//                    +ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
//                    +JUDUL + " VARCHAR(255), "
//                    +TAHUNRILIS + " VARCHAR(255), "
//                    +PRODUSER + " VARCHAR(255), "
//                    +AKTOR + " VARCHAR(255), "
//                    +SINOPSIS + " VARCHAR(255) "
//                    + " );";

    //sql untuk drop table
    private static final String DROP_TABLE = "DROP TABLE IF EXISTS " + NAMA_TABEL;

    //custom constructor
    public MyDataHelper(Context context) {
        super(context, Nama_DB, null, VERSI_DB);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//        if (oldVersion < 4 ) {
//            db.execSQL(DROP_TABLE);
//            db.execSQL(CREATE_TABLE_TAMBAHAN);
        }
    }


