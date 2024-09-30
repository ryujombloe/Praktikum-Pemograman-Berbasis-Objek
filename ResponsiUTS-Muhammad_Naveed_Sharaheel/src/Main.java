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
        Produk produk1 = new Elektronik("Lenovo", 50000000, 2);
        Produk produk2 = new Makanan("Sari Roti", 3000, "20-02-2024");

        Pegawai pegawai1 = new PegawaiTetap("Uncle Roger", 5000000, 1000000);
        Pegawai pegawai2 = new PegawaiKontrak("Jamy Oliver", 4000000, 12);
        
        System.out.println("OutPut Produk");
        produk1.tampilkanInfo();
        produk2.tampilkanInfo();
        
        System.out.println("OutPut Pegawai");
        pegawai1.tampilkanInfo();
        pegawai2.tampilkanInfo();
    }
}
