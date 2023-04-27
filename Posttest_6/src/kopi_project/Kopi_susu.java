package kopi_project;

public final class Kopi_susu extends Kopi {
    private final String jenis;

    Kopi_susu(int id, int harga, String merek, float berat, String jenis) {
        super(id, harga, merek, berat);
        this.jenis = jenis;
    }

    public final String getJenis() {
        return jenis;
    }

    @Override
    public void lihat() {
        System.out.printf("|%-7s  ", this.id);
        System.out.printf("|\t%-20s   ", this.produk_kopi);
        System.out.printf("|\t%-23s    ", this.Harga_kopi);
        System.out.printf("|\t%-21s    ", this.berat_kopi);
        System.out.printf("|\t%-2s  |", this.jenis);
        System.out.println("\n");
    }

    @Override
    public void lht() {
        System.out.printf("|%-7s  ", this.id);
        System.out.printf("|\t%-20s   ", this.produk_kopi);
        System.out.printf("|\t%-23s    ", this.Harga_kopi);
        System.out.printf("|\t%-21s    ", this.berat_kopi);
        System.out.println("\n");
    }

    void lihat(boolean show) {
        if (show)
            lihat();
        else
            lht();
    }
}
