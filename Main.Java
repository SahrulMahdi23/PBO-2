// Program Sederhana dalam Java

public class Main {
    public static void main(String[] args) {
        // Menampilkan pesan awal
        System.out.println("Halo, pak yulhan selamat datang!");

        // Deklarasi variabel
        String nama = "Raja Aditia";
        int umur = 20;
        System.out.println("Nama: " + nama + ", Umur: " + umur + " tahun");

        // Menggunakan perulangan untuk mencetak angka 1-5
        for (int i = 1; i <= 5; i++) {
            System.out.println("Ini adalah iterasi ke-" + i);
        }

        // Menggunakan kondisi untuk menentukan pesan
        int angka = 10;
        if (angka > 5) {
            System.out.println("Angka lebih besar dari 5");
        } else {
            System.out.println("Angka kurang dari atau sama dengan 5");
        }
    }
}
