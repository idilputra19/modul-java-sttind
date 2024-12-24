public class uts_no4b_idil {
    public static void main(String[] args) {
        // Daftar barang dan harga
        String[] barang = {"Buku", "Pensil", "Penghapus", "Pulpen"};
        int[] harga = {5000, 2000, 1000, 3000}; // Harga per barang
        int jumlahPerItem = 17; // Jumlah per barang berdasarkan NIM

        // Menampilkan daftar barang yang dibeli
        System.out.println("Daftar Barang yang Dibeli:");
        for (int i = 0; i < barang.length; i++) {
            System.out.println(barang[i] + " - " + jumlahPerItem + " x Rp " + harga[i] + " = Rp " + (harga[i] * jumlahPerItem));
        }

        // Menghitung total belanja
        int totalBelanja = 0;
        for (int h : harga) {
            totalBelanja += h * jumlahPerItem;
        }

        // Menampilkan total belanja
        System.out.println("\nTotal Belanja: Rp " + totalBelanja);
    }
}
