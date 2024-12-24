public class UAS1_idil {
    public static void main(String[] args) {
        int nilai = 100; // Contoh nilai antara 10-100
        String predikat;

        System.out.println("Nilai Anda = " + nilai);

        if (nilai >= 90 && nilai <= 100) {
            predikat = "Sangat Baik";
        } else if (nilai >= 80 && nilai < 90) {
            predikat = "Baik";
        } else if (nilai >= 70 && nilai < 80) {
            predikat = "Cukup";
        } else if (nilai >= 60 && nilai < 70) {
            predikat = "Kurang";
        } else if (nilai >= 10 && nilai < 60) {
            predikat = "Sangat Kurang";
        } else {
            predikat = "Nilai tidak valid";
        }

        System.out.println("Predikat Anda adalah = " + predikat);
    }
}
