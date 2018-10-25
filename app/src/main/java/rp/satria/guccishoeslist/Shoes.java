package rp.satria.guccishoeslist;

public class Shoes {

    private int ID;
    private String Nama;
    private String Tipe;
    private String Ukuran ;


    public Shoes(int id, String nama, String tipe, String ukuran){
        ID = id;
        Nama = nama;
        Tipe = tipe;
        Ukuran = ukuran;
    }

    public int getID(){
        return ID;
    }
    public void setID(int id){ ID = id; }

    public String getNama(){
        return Nama;
    }
    public void setNama(String nama){
        Nama = nama;
    }

    public String getTipe(){
        return Tipe;
    }
    public void setTipe(String tipe){
        Tipe = tipe;
    }

    public String getUkuran(){
        return Ukuran;
    }
    public void setUkuran(String ukuran){ Ukuran = ukuran; }
}
