import java.util.Scanner;

public class tugas_modul4_idil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Daftar hadiah berdasarkan rentang nilai
        String[] hadiah = {
            "3 Pensil",         // 0 - 10 
            "5 Penghapus",      // 11 - 20
            "5 Pulpen",         // 21 - 30
            "5 Correction Tape",// 31 - 40
            "5 Penggaris",      // 41 - 50
            "5 Spidol",         // 51 - 60
            "5 Nota",           // 61 - 70
            "5 Sticky Note",    // 71 - 80
            "5 Spidol",         // 81 - 90
            "10 Buku"            // 91 - 100
        };

        // Input nilai
        System.out.print("Masukkan nilai Anda (0-100): ");
        int nilai = scanner.nextInt();

        // Validasi input
        if (nilai < 0 || nilai > 100) {
            System.out.println("Nilai yang Anda masukkan tidak valid. Harus antara 0 dan 100.");
        } else {
            // Tentukan hadiah berdasarkan rentang nilai
            String hadiahDapatkan = "Tidak ada hadiah";
            if (nilai <= 10) {
                hadiahDapatkan = hadiah[0];
            } else if (nilai <= 20) {
                hadiahDapatkan = hadiah[1];
            } else if (nilai <= 30) {
                hadiahDapatkan = hadiah[2];
            } else if (nilai <= 40) {
                hadiahDapatkan = hadiah[3];
            } else if (nilai <= 50) {
                hadiahDapatkan = hadiah[4];
            } else if (nilai <= 60) {
                hadiahDapatkan = hadiah[5];
            } else if (nilai <= 70) {
                hadiahDapatkan = hadiah[6];
            } else if (nilai <= 80) {
                hadiahDapatkan = hadiah[7];
            } else if (nilai <= 90) {
                hadiahDapatkan = hadiah[8];
            } else if (nilai <= 100) {
                hadiahDapatkan = hadiah[9];
            }

            // Tampilkan hasil
            System.out.println("Nilai Anda: " + nilai);
            System.out.println("Hadiah yang Anda dapatkan: " + hadiahDapatkan);
        }

        scanner.close();
    }
}
