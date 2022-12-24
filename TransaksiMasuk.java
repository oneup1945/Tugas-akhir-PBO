public class TransaksiMasuk extends Transaksi {

    private int kodeMasuk;
    private int kodeBarang;
    public int jumlah;


    public int getKodeMasuk() {
        return kodeMasuk;
    }

    public void setKodeMasuk(int kodeMasuk) {
        this.kodeMasuk = kodeMasuk;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(int kodeBarang) {
        this.kodeBarang = kodeBarang;
    }



    @Override
    String tanggal() {
         return "12-01-2022";
    }

    @Override
    String deskribsi() {
      return "ini bersih";
    }
}
