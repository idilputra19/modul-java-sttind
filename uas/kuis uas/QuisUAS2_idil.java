public class QuisUAS2_idil {
    public static void main(String[] args) {
        int item = 1; // Mengganti nama variabel "hadiah" menjadi "item"
        System.out.println("Anda Pemenang Item Nomor: " + item);
        
        switch (item) {
            case 1:
                System.out.println("Item ke-" + item + " adalah: Laptop");
                break;
            case 2:
                System.out.println("Item ke-" + item + " adalah: Smartphone");
                break;
            case 3:
                System.out.println("Item ke-" + item + " adalah: Tablet");
                break;
            case 4:
                System.out.println("Item ke-" + item + " adalah: Headphone");
                break;
            default:
                System.out.println("Item ke-" + item + " adalah: Voucher Belanja");
        }
    }
}
