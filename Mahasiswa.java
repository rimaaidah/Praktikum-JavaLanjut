import java.util.Scanner;

public class Mahasiswa {
    public static void main(String[] args) {
        final int jumlah_mahasiswa = 100;
        mhsw_type[] mahasiswa = new mhsw_type[jumlah_mahasiswa];

        for (int i = 0; i < jumlah_mahasiswa; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i+1));
            mahasiswa[i] = new mhsw_type();
            mahasiswa[i].isi_data();
        }

        for (int i = 0; i < jumlah_mahasiswa; i++) {
            System.out.println("Data mahasiswa ke-" + (i+1));
            mahasiswa[i].ambil_data();
            System.out.println();
        }
    }

    static class almt_type {
        String jalan;
        String nomor;
        String kelurahan;
        String kecamatan;
        String kota;
    }

    static class mhsw_type {
        int nim;
        String prodi;
        String nama;
        almt_type alamat;
        String tgl_lahir;

        mhsw_type() {
            alamat = new almt_type();
        }
        
         
        void isi_data() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Masukkan NIM: ");
            nim = sc.nextInt();
            sc.nextLine();
            System.out.print("Masukkan Program Studi: ");
            prodi = sc.nextLine();
            System.out.print("Masukkan Nama: ");
            nama = sc.nextLine();
            System.out.print("Masukkan Jalan: ");
            alamat.jalan = sc.nextLine();
            System.out.print("Masukkan Nomor: ");
            alamat.nomor = sc.nextLine();
            System.out.print("Masukkan Kelurahan: ");
            alamat.kelurahan = sc.nextLine();
            System.out.print("Masukkan Kecamatan: ");
            alamat.kecamatan = sc.nextLine();
            System.out.print("Masukkan Kota: ");
            alamat.kota = sc.nextLine();
            System.out.print("Masukkan Tanggal Lahir: ");
            tgl_lahir = sc.nextLine();
        }

        void ambil_data() {
            System.out.println("NIM: " + nim);
            System.out.println("Program Studi: " + prodi);
            System.out.println("Nama: " + nama);
            System.out.println("Alamat: ");
            System.out.println("Jalan: " + alamat.jalan);
            System.out.println("Nomor: " + alamat.nomor);
            System.out.println("Kelurahan: " + alamat.kelurahan);
            System.out.println("Kecamatan: " + alamat.kecamatan);
            System.out.println("Kota: " + alamat.kota);
            System.out.println("Tanggal Lahir: " + tgl_lahir);
        }
    }
}