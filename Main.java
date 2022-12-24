import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            // System.out.println();
            Barang input = new Barang();
            input.setNamaBarang("kopi");
            input.setKodeBarang(12);
            input.setStokBarang(30);
            input.setKeterangan("Barang berharga");

            User pengguna = new User();
            pengguna.setUsername("Ahmad");
            pengguna.setAlamat("Yogyakarta");
            pengguna.setIdUser(1242);

            TransaksiMasuk masuk = new TransaksiMasuk();
            masuk.setKodeMasuk(1243);


            TransaksiKeluar keluar = new TransaksiKeluar();
            keluar.setKodeKeluar(13345);
            keluar.tanggal();
            keluar.setJumlahKeluar(30);
            keluar.deskribsi();

            System.out.println("");
            System.out.println("############# DATA KARYAWAN ####################");
            System.out.println("Masukkan jenis karyawan(tetap/harian): ");
            String jenis = sc.nextLine();
            System.out.println("Masukkan nama Karyawan: ");
            String nama = sc.nextLine();
            System.out.println("Masukkan ID karyawan");
            String id = sc.nextLine();

            Karyawan karyawan;
            if (jenis.equals("tetap")) {
                System.out.println("Masukkan gaji pokok karyawan: ");
                int gajiPokok = sc.nextInt();
                System.out.print("Masukkan tunjangan karyawan: ");
                int tunjangan = sc.nextInt();

                karyawan = new KaryawanTetap();
                karyawan.nama = nama;
                karyawan.id = id;
                ((KaryawanTetap) karyawan).gajiPokok = gajiPokok;
                ((KaryawanTetap) karyawan).tunjangan = tunjangan;
            } else {
                System.out.print("Masukkan jumlah jam kerja karyawan: ");
                int jumlahJamKerja = sc.nextInt();
                System.out.print("Masukkan tarif per jam karyawan: ");
                int tarifPerJam = sc.nextInt();
                System.out.print("Masukkan tunjangan karyawan: ");
                int tunjangan = sc.nextInt();

                karyawan = new KaryawanHarian();
                karyawan.nama = nama;
                karyawan.id = id;
                ((KaryawanHarian) karyawan).jumlahJamKerja = jumlahJamKerja;
                ((KaryawanHarian) karyawan).tarifPerJam = tarifPerJam;
                ((KaryawanHarian) karyawan).tunjangan = tunjangan;
            }
            karyawan.info();
            System.out.println("Gaji yang diterima: " + karyawan.hitungGaji());


            if (karyawan instanceof Gaji) {
                System.out.println("Tunjangan yang diterima: " + ((Gaji) karyawan).hitungTunjangan());
            }

            sc.close();

            java.io.File file = new java.io.File("database.txt");

            try {
                PrintWriter output = new PrintWriter(file);
                System.out.println("==========================================");
                System.out.println(" nama Barang :" + input.getNamaBarang());
                System.out.println(" Kode Barang : " + input.getKodeBarang());
                System.out.println(" Stok Barang : " + input.getStokBarang());
                System.out.println(" Keterangan  : " + input.getKeterangan());
                System.out.println("==========================================");
                System.out.println(" Username : " + pengguna.getUsername());
                System.out.println(" alamat   : " + pengguna.getAlamat());
                System.out.println(" id User  : " + pengguna.getIdUser());
                System.out.println("==========================================");



                System.out.println("******************TRANSAKSI MASUK****************");
                System.out.println(" Kode Transaksi Masuk   : " + masuk.getKodeMasuk());
                System.out.println(" Id Pengguna            : " + pengguna.getIdUser());
                System.out.println(" Kode Barang            : " + input.getKodeBarang());
                System.out.println(" tanggal barang masuk   : " + masuk.tanggal());
                System.out.println(" Jumlah barang          : " + input.getStokBarang());
                System.out.println(" Deskribsi              : " + masuk.deskribsi());
                System.out.println("=================================================");

                output.println("******************TRANSAKSI MASUK****************");
                output.println(" Kode Transaksi Masuk   : " + masuk.getKodeMasuk());
                output.println(" Id Pengguna            : " + pengguna.getIdUser());
                output.println(" Kode Barang            : " + input.getKodeBarang());
                output.println(" tanggal barang masuk   : " + masuk.tanggal());
                output.println(" Jumlah barang          : " + input.getStokBarang());
                output.println(" Deskribsi              : " + masuk.deskribsi());
                output.println("====================================================");

                System.out.println("***************TRANSAKSI KELUAR******************");
                System.out.println(" Kode Transaksi Keluar   : " + keluar.getKodeKeluar());
                System.out.println(" Id Pengguna             : " + pengguna.getIdUser());
                System.out.println(" Kode Barang             : " + input.getKodeBarang());
                System.out.println(" tanggal Barang Keluar   : " + keluar.tanggal());
                System.out.println(" Jumlah barang           : " + input.getStokBarang());
                System.out.println(" Keterangan              : " + keluar.deskribsi());
                System.out.println("=================================================");

                output.println("***************TRANSAKSI KELUAR******************");
                output.println(" Kode Transaksi Keluar   : " + keluar.getKodeKeluar());
                output.println(" Id Pengguna             : " + pengguna.getIdUser());
                output.println(" Kode Barang             : " + input.getKodeBarang());
                output.println(" tanggal Barang Keluar   : " + keluar.tanggal());
                output.println(" Jumlah barang           : " + input.getStokBarang());
                output.println(" Keterangan              : " + keluar.deskribsi());
                output.println("=================================================");

                output.close();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }

        } catch (Exception e) {
            System.out.println("inputan Salah");
        }
    }
 }

