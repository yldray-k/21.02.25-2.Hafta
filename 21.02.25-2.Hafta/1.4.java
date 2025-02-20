import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float EnMax = 0;
        float EnMin = 100;
        float toplam = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Ders notu giriniz: ");
            float not = scanner.nextFloat();

            if (not > EnMax) {
                EnMax = not;
            }
            if (not < EnMin) {
                EnMin = not;
            }
            if (not < 30) {
                System.out.println("Düşük not aldığınız dersler var!");
            }
            toplam += not;
        }

        float ort = toplam / 5;

        System.out.println(" En yüksek not: " + EnMax);
        System.out.println(" En düşük not: " + EnMin);
        System.out.println(" Ortalama: " + ort);

        if (ort < 50) {
            System.out.println("Kaldınız!");
        } else {
            System.out.println("Geçtiniz!");
        }

        scanner.close();
    }
}
