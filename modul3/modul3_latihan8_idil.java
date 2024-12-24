public class modul3_latihan8_idil{
public static void main (String[] args) {
System.out.println("Tabel Kebenaran operator logika and");
System.out.println("Benar AND benar = "+ (1 & 1));
System.out.println("Benar AND Salah = "+ (1 & 0));
System.out.println("Salah AND benar = "+ (0 & 1));
System.out.println("Salah AND Salah = "+ (0 & 0));
System.out.println("");
System.out.println("Tabel Kebenaran operator logika OR");
System.out.println("Benar OR benar = "+ (1 | 1));
System.out.println("Benar OR Salah = "+ (1 | 0));
System.out.println("Salah OR benar = "+ (0 | 1));
System.out.println("Salah OR Salah = "+ (0 | 0));
System.out.println("");
System.out.println("Tabel Kebenaran operator logika XOR");
System.out.println("Benar XOR benar = "+ (1 ^ 1));
System.out.println("Benar XOR Salah = "+ (1 ^ 0));
System.out.println("Salah XOR benar = "+ (0 ^ 1));
System.out.println("Salah XOR Salah = "+ (0 ^ 0));
System.out.println("");
System.out.println("Tabel Kebenaran operator logika NOT");
System.out.println("NOT benar = "+ (~1));
System.out.println("NOT Salah = "+ (~0));
}
}
