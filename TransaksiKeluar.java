public class TransaksiKeluar extends Transaksi {

    public int kodeKeluar;
    private int kodeBarang;

    public int jumlahKeluar;


    public int getKodeKeluar() {
        return kodeKeluar;
    }

    public void setKodeKeluar(int kodeKeluar) {
        this.kodeKeluar = kodeKeluar;
    }

    public int getJumlahKeluar() {
        return jumlahKeluar;
    }

    public void setJumlahKeluar(int jumlahKeluar) {
        this.jumlahKeluar = jumlahKeluar;
    }

    @Override
    String tanggal() {
        return "09-02-2022";
    }

    @Override
    String deskribsi() {
        return "ini aman";
    }

    public int getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(int kodeBarang) {
        this.kodeBarang = kodeBarang;
    }



}
