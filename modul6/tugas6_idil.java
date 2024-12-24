public class tugas6_idil {
    public static void main(String[] args) {
        // Deklarasi variabel array
        String[] makanan;
        makanan = new String[9];

        // Mengisi elemen array dengan nama makanan khas Sumatera Barat
        makanan[0] = "Rendang";
        makanan[1] = "Sate Padang";
        makanan[2] = "Dendeng Balado";
        makanan[3] = "Ayam Pop";
        makanan[4] = "Gulai Ikan";
        makanan[5] = "Soto Padang";
        makanan[6] = "Asam Padeh";
        makanan[7] = "Keripik Balado";
        makanan[8] = "Pinyaram";

        // Menampilkan elemen array dengan nomor
        for (int i = 0; i < makanan.length; i++) {
            System.out.println((i + 1) + ". " + makanan[i]);
        }
    }
}
