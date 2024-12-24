public class tugas3_no1b_idil {
    
    public static void main(String[] args) {
        // Jari-jari lingkaran
        double jariJari = 17;
        
        // Menghitung luas lingkaran
        double luas = Math.PI * Math.pow(jariJari, 2);
        
        // Menampilkan hasil dengan dua angka di belakang koma
        System.out.printf("Luas lingkaran dengan jari-jari %.2f adalah %.2f%n", jariJari, luas);
    }
}
