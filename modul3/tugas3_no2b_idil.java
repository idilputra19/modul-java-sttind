public class tugas3_no2b_idil {
    public static void main (String [] args) {
        long p = 517;  // Panjang
        long l = 317;  // Lebar
        long t = 717;  // Tinggi
        long luas;

        // Menghitung luas permukaan balok
        luas = 2 * (p * l + p * t + l * t);
        
        // Menampilkan Panjang x Lebar x Tinggi dan Luas Permukaan Balok
        System.out.println("Dimensi Balok: " + p + " x " + l + " x " + t);
        System.out.println("Hasil dari Luas Permukaan Balok: " + luas);
    }
}
