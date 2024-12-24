// BENTUK KEDUA MENGGUNAKAN ARRAY MENGGUNAKAN FOR
public class modul6_latihan2_idil {
 public static void main(String[] args) {
 int[][] piksel = new int[6][3];
 // Mengisi elemen tertentu
 piksel[0][1] = 70;
 piksel[1][1] = 18;
 piksel[2][1] = 45;
 piksel[3][1] = 75;
 piksel[4][1] = 66;
 piksel[5][1] = 89;
 // Menampilkan elemen array
 int i, j;
 for (i = 0; i < 6; i++){
 for (j = 0; j < 3; j++)
 System.out.print(piksel[i][j] + " ");
 System.out.println(""); // Pindah baris
}
}
}
