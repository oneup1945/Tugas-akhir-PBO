 public class KaryawanTetap extends Karyawan implements Gaji {
    int gajiPokok;
    int tunjangan;

    @Override
    int hitungGaji() {
        return gajiPokok + tunjangan;
    }

    @Override
    public int hitungTunjangan() {
        return tunjangan;
    }
}
