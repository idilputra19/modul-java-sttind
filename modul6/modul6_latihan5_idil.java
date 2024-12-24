public class modul6_latihan5_idil {
 public static void main(String[] args) {
 int[] arrayOfInteger; //sangat dianjurkan
 String arrayOfString[]; //benar namun tidak dianjurkan
 int[][] matriks2D; //array 2 dimensi
 String[] array3D[][]; //benar namun tidak dianjurkan
 arrayOfInteger = new int[10];
 /* membuat array dan mengalokasikan memori untuk 10 integer */
 arrayOfString = new String[4];
/* membuat array dan mengalokasikan memori untuk 4 String */
 matriks2D = new int[2][2];
 /* membuat array 2 dimensi berukuran 2 x 2 */
 array3D = new String[3][][];
 /* membuat array 3 dimensi, berukuran 3 x ? x ? */
 System.out.println(arrayOfInteger.length);
 System.out.println(arrayOfString.length);
 System.out.println(matriks2D.length);
 System.out.println(array3D.length);
 }
}