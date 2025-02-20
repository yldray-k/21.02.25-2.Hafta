import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hızınızı girin: ");

        int hiz = scanner.nextInt();

        if (90 <= hiz && hiz <= 110) {
            System.out.println("1000 TL CEZA!");
        }
        else if (110 < hiz && hiz < 130) {
            System.out.println("2000 TL CEZA!");
        }
        else if (130 <= hiz ) {
            System.out.println("Ehliyete el konulur!");
        }
        else {
            System.out.println("Hız uygun");
        }

        scanner.close();
    }
}
