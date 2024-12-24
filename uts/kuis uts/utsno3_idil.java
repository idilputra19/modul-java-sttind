import java.util.Scanner;

public class utsno3_idil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel untuk setiap kategori
        double biayaMakanan, biayaTransportasi, biayaSewa, biayaListrik, biayaLainnya;
        
        // Input biaya untuk setiap kategori
        System.out.print("Masukkan biaya makanan selama 1 bulan: ");
        biayaMakanan = input.nextDouble();
        
        System.out.print("Masukkan biaya transportasi selama 1 bulan: ");
        biayaTransportasi = input.nextDouble();
        
        System.out.print("Masukkan biaya sewa tempat tinggal selama 1 bulan: ");
        biayaSewa = input.nextDouble();
        
        System.out.print("Masukkan biaya listrik selama 1 bulan: ");
        biayaListrik = input.nextDouble();
        
        System.out.print("Masukkan biaya lainnya selama 1 bulan: ");
        biayaLainnya = input.nextDouble();
        
        // Menghitung total biaya hidup
        double totalBiaya = biayaMakanan + biayaTransportasi + biayaSewa + biayaListrik + biayaLainnya;
        
        // Menampilkan total biaya hidup
        System.out.println("Total biaya hidup Saudara selama 1 bulan adalah: Rp" + totalBiaya);

        input.close();
    }
}
