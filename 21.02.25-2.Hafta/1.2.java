import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        int toplam = 0;

        while (true) {
            System.out.println("0. Çıkış\n1. Ekmek = 10TL\n2. Su = 5TL\n3. Tuz = 15TL");
            System.out.print("Seçiminiz: ");
            i = scanner.nextInt();

            int ekmek = 10;
            int su = 5;
            int tuz = 15;

            switch (i) {

                case 1:
                    System.out.println("İşlem Başarılı");
                    toplam = toplam + ekmek;
                    break;


                case 2:
                    System.out.println("İşlem Başarılı");
                    toplam = toplam + su;
                    break;


                case 3:
                    System.out.println("İşlem Başarılı");
                    toplam = toplam + tuz;
                    break;


                case 0:
                    System.out.println("Toplam Ücret: " + toplam);
                    System.out.println("Kupon kullanmak istiyorsanız 1\nKupon kullanmak istemiyorsanız  2\n ");
                    int x = scanner.nextInt();
                    if (x == 1) {
                        toplam = toplam*90/100;
                        System.out.println("Güncel Ücret: " + toplam);
                    }

                    System.out.println("Çıkış yapılıyor...");
                    scanner.close();
                    return;


                default:
                    System.out.println("Geçersiz seçim, tekrar deneyin.");

            }
        }

    }
}