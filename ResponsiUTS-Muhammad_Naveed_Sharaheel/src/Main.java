/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Produk produk1 = new Elektronik("Laptop", 10000000, 2);
        Produk produk2 = new Makanan("Roti", 5000, "2024-02-20");

        Pegawai pegawai1 = new PegawaiTetap("John Doe", 5000000, 1000000);
        Pegawai pegawai2 = new PegawaiKontrak("Jane Doe", 4000000, 12);

        produk1.tampilkanInfo();
        produk2.tampilkanInfo();

        pegawai1.tampilkanInfo();
        pegawai2.tampilkanInfo();
    }
}
