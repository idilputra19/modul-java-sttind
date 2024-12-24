public class utsno2_idil {
    public static void main(String[] args) {
        // Harga masing-masing barang
        int hargaLemariBaju = 5000000;
        int hargaMejaMakan = 6000000;
        int hargaKursiTamu = 10500000;
        int hargaKarpet = 1350000;

        // Jumlah barang berdasarkan NPM terakhir (17)
        int jumlahBarang = 17;

        // Menghitung total harga
        int totalLemariBaju = hargaLemariBaju * jumlahBarang;
        int totalMejaMakan = hargaMejaMakan * jumlahBarang;
        int totalKursiTamu = hargaKursiTamu * jumlahBarang;
        int totalKarpet = hargaKarpet * jumlahBarang;
        
        int totalBelanja = totalLemariBaju + totalMejaMakan + totalKursiTamu + totalKarpet;

        // Menampilkan hasil total belanja tanpa diskon
        System.out.printf("Total belanja: Rp %,d%n", totalBelanja);
    }
}
