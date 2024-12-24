// BENTUK KEDUA MENGGUNAKAN WHILE
 class modul5_latihan6_idil{
public static void main(String[] args) {
 // inisialisasi
 int i = 1;
 boolean ketemu = false;
 while((i <= 9) && (ketemu == false)){
 // proses
 System.out.println("nilai variabel i : " + i + ", nilai variabel ketemu : " + ketemu);
 // iterasi
 i = i + 1;
 // kondisi terminasi
 if((i == 10) && (ketemu == false)){
 ketemu = true; } } }}