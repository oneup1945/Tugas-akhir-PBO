abstract class Karyawan {
    String nama;
    String id;

    // Method abstrak
    abstract int hitungGaji();

    // Method biasa
    void info() {
        System.out.println("Nama karyawan: " + nama);
        System.out.println("ID karyawan: " + id);
    }
}
