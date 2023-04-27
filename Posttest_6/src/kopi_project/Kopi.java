package kopi_project;

public abstract class Kopi implements main_interface{
    // atribut kopi
    int id;
    int Harga_kopi;
    String produk_kopi;
    float berat_kopi;
    // constructor kopi
    Kopi(int id,int harga, String merek, float berat){
        this.id = id;
        this.Harga_kopi = harga;
        this.produk_kopi = merek;
        this.berat_kopi = berat;
    }

    public abstract void lihat();
    
    
    public void setHarga(int harga){
        this.Harga_kopi = harga;
    }

    public void setnama_produk(String merek){
        this.produk_kopi = merek;
    }

    public void set_berat(float berat){
        this.berat_kopi = berat;
    }

    public int getHarga(){
        return Harga_kopi;
    }

    public String getproduk_kopi(){
        return produk_kopi;
    }

    public float getberat_kopi(){
        return berat_kopi;
    }
}

