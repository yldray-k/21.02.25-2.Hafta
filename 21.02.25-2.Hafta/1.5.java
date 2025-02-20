import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplam = 0;

        while (true) {
            System.out.print("Eklemek istediğiniz yemekleri seçin\n1. Mercimek Çorbası ( 30 TL )\n2. Karnıyarık ( 50 TL )\n3. Köfte ve Patates Kızartması ( 80 TL )\n4. Ayran ( 15 TL )\n5. Çay ( 2 TL )\n6. Künefe ( 35 TL )\n(Çıkış ve Toplam tutar için 0): ");
            int sayi = scanner.nextInt();

            switch (sayi) {
                case 1:
                    toplam = toplam + 30;
                    break;

                case 2:
                    toplam = toplam + 50;
                    break;

                case 3:
                    toplam = toplam + 80;
                    break;

                case 4:
                    toplam = toplam + 15;
                    break;

                case 5:
                    toplam = toplam + 2;
                    break;

                case 6:
                    toplam = toplam + 35;
                    break;

                case 0:
                    System.out.println("Toplam Ücret : " + toplam + " TL");
                    scanner.close();
                    return;

                default:
                    System.out.println("Geçersiz seçim, lütfen 0-6 arasında bir sayı girin.");
            }
        }
    }
}
