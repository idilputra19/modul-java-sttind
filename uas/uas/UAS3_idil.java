public class UAS3_idil {
    public static void main(String[] args) {
        int unit = 5;
        System.out.println("Anda Bekerja di Unit Nomor : " + unit);
        switch (unit) {
            case 1:
                System.out.println("Unit ke-" + unit + " adalah : Kepala Sekolah");
                break;
            case 2:
                System.out.println("Unit ke-" + unit + " adalah : Wakil Kepala Sekolah");
                break;
            case 3:
                System.out.println("Unit ke-" + unit + " adalah : Guru Kelas");
                break;
            case 4:
                System.out.println("Unit ke-" + unit + " adalah : Guru Mata Pelajaran");
                break;
            case 5:
                System.out.println("Unit ke-" + unit + " adalah : Tenaga Administrasi");
                break;
            case 6:
                System.out.println("Unit ke-" + unit + " adalah : Petugas Perpustakaan");
                break;
            case 7:
                System.out.println("Unit ke-" + unit + " adalah : Petugas Laboratorium");
                break;
            case 8:
                System.out.println("Unit ke-" + unit + " adalah : Petugas Kebersihan");
                break;
            default:
                System.out.println("Unit ke-" + unit + " adalah : Penjaga Sekolah");
        }
    }
}
