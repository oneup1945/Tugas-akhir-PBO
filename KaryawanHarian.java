public class KaryawanHarian extends Karyawan implements Gaji{
    int jumlahJamKerja;
    int tarifPerJam;
    int tunjangan;

    @Override
    int  hitungGaji() {
        return (jumlahJamKerja * tarifPerJam) + tunjangan;
    }

    @Override
    public int hitungTunjangan() {
        return tunjangan;
    }

}
