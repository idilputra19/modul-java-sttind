// BENTUK KEDUA MENGGUNAKAN DO..WHILE
public class modul5_latihan4_idil{
public static void main(String[] args) {
 // inisialisasi
 int i = 1;
 boolean ketemu = false;
do{
 // proses
System.out.println("nilai variabel i : " + i + ", nilai variabel ketemu : " + ketemu);
 // iterasi
 i = i + 5;
 } while((i < 2) && (ketemu != true));
}
}