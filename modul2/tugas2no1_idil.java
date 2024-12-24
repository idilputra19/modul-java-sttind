import java.util.Scanner;

public class tugas2no1_idil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input pemakaian kWh
        System.out.print("Masukkan pemakaian kWh: ");
        int pemakaianKwh = scanner.nextInt();
        
        // Menghitung biaya berdasarkan pemakaian kWh
        int totalBiaya = hitungBiaya(pemakaianKwh);
        
        // Menampilkan total biaya
        //System.out.println(" kWh adalah: Rp " + totalBiaya);
        
        scanner.close();
    }

    public static int hitungBiaya(int kwh) {
        int biaya = 0;

        if (kwh <= 20) {
             System.out.print("Harga kWh: Rp. 5.000 ");

        } else if (kwh <= 50) {
            System.out.print("Harga kWh: Rp. 10.000 ");

        } else {
             System.out.print("Harga kWh: Rp. 15.000 ");

        }

        return biaya;
    }
}
