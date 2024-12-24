public class uts_no4c_idil {
    public static void main(String[] args) {
        // Gaji pokok
        double gajiPokok = 5000000; // Contoh gaji pokok Rp 5.000.000

        // Persentase pajak tetap 17%
        int pajakPersen = 17;

        // Menghitung pajak dan gaji bersih
        double potonganPajak = gajiPokok * pajakPersen / 100;
        double gajiBersih = gajiPokok - potonganPajak;

        // Menampilkan hasil
        System.out.println("Gaji Pokok: Rp " + gajiPokok);
        System.out.println("Potongan Pajak (" + pajakPersen + "%): Rp " + potonganPajak);
        System.out.println("Gaji Bersih: Rp " + gajiBersih);
    }
}
