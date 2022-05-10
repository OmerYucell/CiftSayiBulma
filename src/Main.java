import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int k,sayi = 1,ortalama=0,toplam=0,sayac =0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen Sayi Giriniz :");
        k = inp.nextInt();

        while (sayi <= k){

            if (sayi % 3 == 0 && sayi % 4 == 0){

                toplam = toplam+sayi;
                sayac++;




            }
            sayi++;

        }
        ortalama = toplam/sayac;
        System.out.print(ortalama);
    }
}
